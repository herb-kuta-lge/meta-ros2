# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "control_msgs contains base messages and actions useful for     controlling robots.  It provides representations for controller     setpoints and joint and cartesian trajectories."
AUTHOR = "Bence Magyar <bence.magyar.robotics@gmail.com>"
ROS_AUTHOR = "Stuart Glaser <sglaser@willowgarage.com>"
HOMEPAGE = "http://ros.org/wiki/control_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "control_msgs"
ROS_BPN = "control_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    builtin-interfaces \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-default-generators-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    trajectory-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    builtin-interfaces \
    rosidl-default-runtime \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/control_msgs-release/archive/release/bouncy/control_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "b35f00beda3ea89b593659dca8662f03"
SRC_URI[sha256sum] = "631e64f5af2c4d37849942c809c4c8907a70283ae0432e8d3c824c2d5cc41841"
S = "${WORKDIR}/control_msgs-release-release-bouncy-control_msgs-2.0.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('control-msgs', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('control-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-msgs/control-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-msgs/control-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/control-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
