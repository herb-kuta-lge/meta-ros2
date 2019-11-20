# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The twist_mux msgs and actions package"
AUTHOR = "Enrique Fernandez <efernandez@clearpathrobotics.com>"
ROS_AUTHOR = "Enrique Fernandez <efernandez@clearpathrobotics.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "CC-BY-NC-SA-4.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=6bc0e2b80b41b84c8240cea714dea709"

ROS_CN = "twist_mux_msgs"
ROS_BPN = "twist_mux_msgs"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-runtime \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    message-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/twist_mux_msgs-release/archive/release/melodic/twist_mux_msgs/2.1.0-6.tar.gz
ROS_BRANCH ?= "branch=release/melodic/twist_mux_msgs"
SRC_URI = "git://github.com/ros-gbp/twist_mux_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "d35d50437bec59346c4e68a93ca58ce1e1cdf12f"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('twist-mux-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
