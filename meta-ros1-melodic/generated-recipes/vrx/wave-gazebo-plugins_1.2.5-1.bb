# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package contains Gazebo plugins for the simulation of      water surface waves and hydrostatic and hydrodynamics forces."
AUTHOR = "Rhys Mainwaring <rhys.mainwaring@me.com>"
ROS_AUTHOR = "Rhys Mainwaring <rhys.mainwaring@me.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "TBD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=17de80a4e910d574ec9f29d9922c3248"

ROS_CN = "vrx"
ROS_BPN = "wave_gazebo_plugins"

ROS_BUILD_DEPENDS = " \
    gazebo-ros \
    libeigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/vrx-release/archive/release/melodic/wave_gazebo_plugins/1.2.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/wave_gazebo_plugins"
SRC_URI = "git://github.com/ros-gbp/vrx-release;${ROS_BRANCH};protocol=https"
SRCREV = "e990c851a25e96f4f0506d3b2de2ece12087cbc1"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('vrx', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
