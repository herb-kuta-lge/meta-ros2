# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Kinematics plugin for Fetch robot, generated through IKFast"
AUTHOR = "Russell Toris <rtoris@fetchrobotics.com>"
ROS_AUTHOR = "Michael Ferguson"
HOMEPAGE = "http://docs.fetchrobotics.com/manipulation.html"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=c93e37fc0c6f510db5735eb91dcc1550"

ROS_CN = "fetch_ros"
ROS_BPN = "fetch_ikfast_plugin"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_liblapack-dev} \
    eigen-conversions \
    moveit-core \
    pluginlib \
    roscpp \
    tf2-eigen \
    tf2-kdl \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_liblapack-dev} \
    eigen-conversions \
    moveit-core \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_liblapack-dev} \
    eigen-conversions \
    moveit-core \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_ros-release/archive/release/melodic/fetch_ikfast_plugin/0.8.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d247a9cc3a6bf5f4aeab2a9fe83efdc8"
SRC_URI[sha256sum] = "62c825a29e1ea77397875b05777eacde641a4a67ceba2c5b2f3ab161effeff67"
S = "${WORKDIR}/fetch_ros-release-release-melodic-fetch_ikfast_plugin-0.8.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('fetch-ros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('fetch-ros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/fetch-ros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/fetch-ros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/fetch-ros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
