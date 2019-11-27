# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_eloquent
inherit ros_superflore_generated

DESCRIPTION = "The decision which ROS middleware implementation should be used for C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_implementation"
ROS_BPN = "rmw_implementation"

ROS_BUILD_DEPENDS = " \
    poco \
    poco-vendor \
    rcutils \
    rmw \
    rmw-connext-cpp \
    rmw-cyclonedds-cpp \
    rmw-fastrtps-cpp \
    rmw-implementation-cmake \
    rmw-opensplice-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    ament-cmake-python-native \
"

ROS_EXPORT_DEPENDS = " \
    poco \
    poco-vendor \
    rmw-implementation-cmake \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ament-index-python \
    poco \
    poco-vendor \
    rmw-implementation-cmake \
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

# matches with: https://github.com/ros2-gbp/rmw_implementation-release/archive/release/eloquent/rmw_implementation/0.8.2-2.tar.gz
ROS_BRANCH ?= "branch=release/eloquent/rmw_implementation"
SRC_URI = "git://github.com/ros2-gbp/rmw_implementation-release;${ROS_BRANCH};protocol=https"
SRCREV = "0ee1dcc6480b7ee929de41831fd87a8c9e554b23"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
