# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "ROS driver for IBEO LUX"
AUTHOR = "AutonomouStuff Software Development Team <software@autonomoustuff.com>"
ROS_AUTHOR = "Joe Kale <jkale@autonomoustuff.com>"
HOMEPAGE = "http://wiki.ros.org/ibeo_lux"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "ibeo_lux"
ROS_BPN = "ibeo_lux"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    ibeo-core \
    ibeo-msgs \
    network-interface \
    pcl-ros \
    roscpp \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    ibeo-core \
    ibeo-msgs \
    network-interface \
    pcl-ros \
    roscpp \
    std-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    ibeo-core \
    ibeo-msgs \
    network-interface \
    pcl-ros \
    roscpp \
    std-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/astuff/ibeo_lux-release/archive/release/melodic/ibeo_lux/2.0.1-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/ibeo_lux"
SRC_URI = "git://github.com/astuff/ibeo_lux-release;${ROS_BRANCH};protocol=https"
SRCREV = "5c1428a874d794db72e4602df5b343d63683b558"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
