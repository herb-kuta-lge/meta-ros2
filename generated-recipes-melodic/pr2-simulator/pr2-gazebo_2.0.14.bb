# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Launch scripts for simulating the PR2 in <a href="http://ros.org/wiki/gazebo">gazebo</a>.     The simulation equivalent of pr2.launch is found here.     pr2_fingertip_pressure_contact_translator produces the same ROS topics as fingertip_pressure package for simulated PR2."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "John Hsu"
HOMEPAGE = "http://ros.org/wiki/pr2_gazebo"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_simulator"
ROS_BPN = "pr2_gazebo"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    gazebo-plugins \
    pr2-gazebo-plugins \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    diagnostic-aggregator \
    fingertip-pressure \
    gazebo-plugins \
    gazebo-ros \
    geometry-msgs \
    image-proc \
    joint-trajectory-action \
    pr2-controller-configuration-gazebo \
    pr2-controller-manager \
    pr2-dashboard-aggregator \
    pr2-description \
    pr2-gazebo-plugins \
    pr2-gripper-action \
    pr2-head-action \
    pr2-mechanism-controllers \
    pr2-msgs \
    robot-mechanism-controllers \
    robot-pose-ekf \
    robot-state-publisher \
    rospy \
    rostopic \
    single-joint-position-action \
    std-msgs \
    stereo-image-proc \
    tf2-ros \
    topic-tools \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    diagnostic-aggregator \
    fingertip-pressure \
    gazebo-plugins \
    gazebo-ros \
    geometry-msgs \
    image-proc \
    joint-trajectory-action \
    pr2-controller-configuration-gazebo \
    pr2-controller-manager \
    pr2-dashboard-aggregator \
    pr2-description \
    pr2-gazebo-plugins \
    pr2-gripper-action \
    pr2-head-action \
    pr2-mechanism-controllers \
    pr2-msgs \
    robot-mechanism-controllers \
    robot-pose-ekf \
    robot-state-publisher \
    rospy \
    rostopic \
    single-joint-position-action \
    std-msgs \
    stereo-image-proc \
    tf2-ros \
    topic-tools \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    pr2-machine \
    pr2-tuckarm \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_simulator-release/archive/release/melodic/pr2_gazebo/2.0.14-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "677819668fecbcf7feb4048c8aa4f7e2"
SRC_URI[sha256sum] = "65a61813255f0e2fd52200aceb94b18f0e19ed5e4f9c07c521558541015392a9"
S = "${WORKDIR}/pr2_simulator-release-release-melodic-pr2_gazebo-2.0.14-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-simulator', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-simulator', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/pr2-simulator_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/pr2-simulator-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-simulator/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
