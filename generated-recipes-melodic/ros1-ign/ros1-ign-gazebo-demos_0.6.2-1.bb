# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Demos using Ignition Gazebo simulation with ROS 1."
AUTHOR = "Louise Poubel <louise@openrobotics.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=5;endline=5;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "ros1_ign"
ROS_BPN = "ros1_ign_gazebo_demos"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ignition-gazebo2} \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ignition-gazebo2} \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ignition-gazebo2} \
    image-transport-plugins \
    ros1-ign-bridge \
    ros1-ign-image \
    ros1-ign-point-cloud \
    rqt-image-view \
    rqt-plot \
    rviz \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/osrf/ros1_ign-release/archive/release/melodic/ros1_ign_gazebo_demos/0.6.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "577b081fa55b779fb35b1a7dcd4b4be8"
SRC_URI[sha256sum] = "4de5901be50cbfd829c2591af5337627d6ff8d030d776d1f1e0f1da918aaa42b"
S = "${WORKDIR}/ros1_ign-release-release-melodic-ros1_ign_gazebo_demos-0.6.2-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros1-ign', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ros1-ign', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros1-ign/ros1-ign_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros1-ign/ros1-ign-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros1-ign/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ros1-ign/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
