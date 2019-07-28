# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Server Side tools for Authorization and Authentication of ROS Clients"
AUTHOR = "Russell Toris <rctoris@wpi.edu>"
ROS_AUTHOR = "Russell Toris <rctoris@wpi.edu>"
HOMEPAGE = "http://ros.org/wiki/rosauth"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rosauth"
ROS_BPN = "rosauth"

ROS_BUILD_DEPENDS = " \
    message-generation \
    openssl \
    roscpp \
    rostest \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/gt-rail-release/rosauth-release/archive/release/melodic/rosauth/0.1.7-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "450a3ecb512b1784fb08c575b69d2609"
SRC_URI[sha256sum] = "9d3f956efc11d59d7fb973249d34a497dfe1649d77dffe76da6cc29a485a6c31"
S = "${WORKDIR}/rosauth-release-release-melodic-rosauth-0.1.7-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rosauth', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rosauth', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosauth/rosauth_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosauth/rosauth-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosauth/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rosauth/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
