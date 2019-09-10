# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Rosbridge provides a JSON API to ROS functionality for non-ROS programs.     There are a variety of front ends that interface with rosbridge, including     a WebSocket server for web browsers to interact with.      Rosbridge_suite is a meta-package containing rosbridge, various front end     packages for rosbridge like a WebSocket package, and helper packages."
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Jonathan Mace <jonathan.c.mace@gmail.com>"
HOMEPAGE = "http://ros.org/wiki/rosbridge_suite"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosbridge_suite"
ROS_BPN = "rosbridge_suite"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    rosapi \
    rosbridge-library \
    rosbridge-server \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/RobotWebTools-release/rosbridge_suite-release/archive/release/melodic/rosbridge_suite/0.11.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "5ff423c0f764458a55af2a092d6ee3c5"
SRC_URI[sha256sum] = "2d3f7f7cc800d54dabde409e9f6caf4a9dee6b4901ba5639d060f0c91ea0bcb1"
S = "${WORKDIR}/rosbridge_suite-release-release-melodic-rosbridge_suite-0.11.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosbridge-suite', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosbridge-suite', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbridge-suite/rosbridge-suite_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbridge-suite/rosbridge-suite-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbridge-suite/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosbridge-suite/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
