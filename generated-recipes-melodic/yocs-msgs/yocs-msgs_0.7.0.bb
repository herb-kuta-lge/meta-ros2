# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Yujin's Open Control System messages, services and actions"
AUTHOR = "Jihoon Lee <jihoonl@yujinrobot.com>"
ROS_AUTHOR = "Jorge Santos"
HOMEPAGE = "http://ros.org/wiki/yocs_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "yocs_msgs"
ROS_BPN = "yocs_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib-msgs \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/yocs_msgs-release/archive/release/melodic/yocs_msgs/0.7.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "f76ae2c95faf6e20af023af206ba0b35"
SRC_URI[sha256sum] = "92aa5df09147dc1819de1d4415efe58d267744ca6cbf9ffe4dbb742d1713cdcc"
S = "${WORKDIR}/yocs_msgs-release-release-melodic-yocs_msgs-0.7.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('yocs-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('yocs-msgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yocs-msgs/yocs-msgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yocs-msgs/yocs-msgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yocs-msgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/yocs-msgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
