# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The pr2_tuck_arms_action package"
AUTHOR = "ROS Orphaned Package Maintainers <ros-orphaned-packages@googlegroups.com>"
ROS_AUTHOR = "Wim Meeussen"
HOMEPAGE = "http://wiki.ros.org/pr2_tuck_arms_action"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "pr2_common_actions"
ROS_BPN = "pr2_tuck_arms_action"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    pr2-common-action-msgs \
    pr2-controllers-msgs \
    rospy \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    pr2-common-action-msgs \
    pr2-controllers-msgs \
    rospy \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    pr2-common-action-msgs \
    pr2-controllers-msgs \
    rospy \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/pr2-gbp/pr2_common_actions-release/archive/release/melodic/pr2_tuck_arms_action/0.0.11-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bd6d5182c36fa547efef0afa2277f7ec"
SRC_URI[sha256sum] = "12d791a5cb70ca8bce9093e6dddc5cd0fc718b1d440f62c6006071bd736629e7"
S = "${WORKDIR}/pr2_common_actions-release-release-melodic-pr2_tuck_arms_action-0.0.11-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('pr2-common-actions', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('pr2-common-actions', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/pr2-common-actions_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/pr2-common-actions-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/pr2-common-actions/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
