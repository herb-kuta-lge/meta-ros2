# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package contains a collection of launch files that can be helpful in configuring     the calibration stack to run on your robot."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://ros.org/wiki/calibration_launch"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "calibration"
ROS_BPN = "calibration_launch"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    interval-intersection \
    joint-states-settler \
    laser-cb-detector \
    monocam-settler \
    urdfdom-py \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    interval-intersection \
    joint-states-settler \
    laser-cb-detector \
    monocam-settler \
    urdfdom-py \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/calibration-release/archive/release/melodic/calibration_launch/0.10.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "94c74b3f081128faa2401f8d759d3f19"
SRC_URI[sha256sum] = "eaf7a65341c7be0665741f2d6f22d3e9d6a5a50deb004ffd402434fc2ae715b7"
S = "${WORKDIR}/calibration-release-release-melodic-calibration_launch-0.10.14-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('calibration', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('calibration', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/calibration_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/calibration-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/calibration/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
