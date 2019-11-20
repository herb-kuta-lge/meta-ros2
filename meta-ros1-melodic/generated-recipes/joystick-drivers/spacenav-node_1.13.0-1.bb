# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS interface to the 3Dconnexion SpaceNavigator 6DOF joystick."
AUTHOR = "Jonathan Bohren <jbo@jhu.edu>"
ROS_AUTHOR = "Stuart Glaser"
HOMEPAGE = "http://www.ros.org/wiki/spacenav_node"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=4;endline=4;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "joystick_drivers"
ROS_BPN = "spacenav_node"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libspnav-dev} \
    geometry-msgs \
    libx11 \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libspnav-dev} \
    geometry-msgs \
    libx11 \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libspnav-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_spacenavd} \
    geometry-msgs \
    libx11 \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/joystick_drivers-release/archive/release/melodic/spacenav_node/1.13.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/spacenav_node"
SRC_URI = "git://github.com/ros-gbp/joystick_drivers-release;${ROS_BRANCH};protocol=https"
SRCREV = "03de68d8abeb5af38540c1e9ba4acbd6fdebc32c"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('joystick-drivers', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
