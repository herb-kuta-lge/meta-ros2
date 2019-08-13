# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A Python GUI plugin for introspecting available ROS message types.   Note that the msgs available through this plugin is the ones that are stored   on your machine, not on the ROS core your rqt instance connects to."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Aaron Blasdel"
HOMEPAGE = "http://wiki.ros.org/rqt_msg"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_msg"
ROS_BPN = "rqt_msg"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-rospkg} \
    python-qt-binding \
    roslib \
    rosmsg \
    rospy \
    rqt-console \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-rospkg} \
    python-qt-binding \
    roslib \
    rosmsg \
    rospy \
    rqt-console \
    rqt-gui \
    rqt-gui-py \
    rqt-py-common \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_msg-release/archive/release/melodic/rqt_msg/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "7f187230eed29c0be3ab8c297a8bfb8c"
SRC_URI[sha256sum] = "ec3e88d3c822856ace98a11ab03950fb0e9390829122b7abfabc863180611630"
S = "${WORKDIR}/rqt_msg-release-release-melodic-rqt_msg-0.4.8-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rqt-msg', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rqt-msg', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-msg/rqt-msg_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-msg/rqt-msg-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-msg/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-msg/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
