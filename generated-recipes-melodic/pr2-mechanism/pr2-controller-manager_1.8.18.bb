# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The controller manager (CM) package provides the infrastructure to run controllers in a hard realtime loop."
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Eric Berger berger@willowgarage.com"
HOMEPAGE = "http://ros.org/pr2_controller_manager"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_mechanism"
ROS_BPN = "pr2_controller_manager"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    diagnostic-msgs \
    pluginlib \
    pr2-controller-interface \
    pr2-description \
    pr2-hardware-interface \
    pr2-mechanism-diagnostics \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    realtime-tools \
    roscpp \
    rostest \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-msgs \
    pluginlib \
    pr2-controller-interface \
    pr2-description \
    pr2-hardware-interface \
    pr2-mechanism-diagnostics \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    realtime-tools \
    roscpp \
    rosparam \
    rospy \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    diagnostic-msgs \
    pluginlib \
    pr2-controller-interface \
    pr2-description \
    pr2-hardware-interface \
    pr2-mechanism-diagnostics \
    pr2-mechanism-model \
    pr2-mechanism-msgs \
    realtime-tools \
    roscpp \
    rosparam \
    rospy \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_mechanism-release/archive/release/melodic/pr2_controller_manager/1.8.18-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6ca7525193660e6a19ddb9e3657e4f28"
SRC_URI[sha256sum] = "b8c00259af30026fbef6c1651f3b95332e5aab3922fbc66ed109515613d68da4"
S = "${WORKDIR}/pr2_mechanism-release-release-melodic-pr2_controller_manager-1.8.18-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-mechanism', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-mechanism', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/pr2-mechanism_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/pr2-mechanism-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-mechanism/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
