# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "<p>       MoveIt plugins for the ABB 2400 (and variants).     </p>     <p>       This package contains plugins for use with MoveIt and ABB 2400 manipulators.       Plugins included support the 2400. See the ABB 2400 support package for       information on used joint angle and velocity limits.     </p>     <p>       Before using any of the plugins included in this package, be sure to       check they are correct for the particular robot model and configuration       you intend to use them with.     </p>"
AUTHOR = "Levi Armstrong (Southwest Research Institute) <levi.armstrong@swri.org>"
ROS_AUTHOR = "G.A. vd. Hoorn (TU Delft Robotics Institute)"
HOMEPAGE = "http://ros.org/wiki/abb_irb2400_moveit_plugins"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=23;endline=23;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "abb"
ROS_BPN = "abb_irb2400_moveit_plugins"

ROS_BUILD_DEPENDS = " \
    lapack \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    lapack \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    lapack \
    moveit-core \
    pluginlib \
    roscpp \
    tf-conversions \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/abb-release/archive/release/melodic/abb_irb2400_moveit_plugins/1.3.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/abb_irb2400_moveit_plugins"
SRC_URI = "git://github.com/ros-industrial-release/abb-release;${ROS_BRANCH};protocol=https"
SRCREV = "508faeb25b8ecbb5ae993308ebc47dd0e74dd4c7"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
