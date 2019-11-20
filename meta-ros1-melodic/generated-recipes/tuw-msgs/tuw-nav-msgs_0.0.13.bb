# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The tuw_nav_msgs package"
AUTHOR = "George Todoran <george.todoran@tuwien.ac.at>"
ROS_AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "tuw_msgs"
ROS_BPN = "tuw_nav_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    nav-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
    tuw-geometry-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    nav-msgs \
    roscpp \
    rospy \
    std-msgs \
    tf \
    tuw-geometry-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tuw-robotics/tuw_msgs-release/archive/release/melodic/tuw_nav_msgs/0.0.13-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/tuw_nav_msgs"
SRC_URI = "git://github.com/tuw-robotics/tuw_msgs-release;${ROS_BRANCH};protocol=https"
SRCREV = "a39f0d6c59761b8cddd5756920e70a8433283eab"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('tuw-msgs', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
