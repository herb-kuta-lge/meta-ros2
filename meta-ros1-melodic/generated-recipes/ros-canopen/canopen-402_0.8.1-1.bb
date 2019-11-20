# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This implements the CANopen device profile for drives and motion control. CiA(r) 402"
AUTHOR = "Mathias Lüdtke <mathias.luedtke@ipa.fraunhofer.de>"
ROS_AUTHOR = "Thiago de Freitas <tdf@ipa.fhg.de>"
HOMEPAGE = "http://wiki.ros.org/canopen_402"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=b691248d2f70cdaeeaf13696ada5d47c"

ROS_CN = "ros_canopen"
ROS_BPN = "canopen_402"

ROS_BUILD_DEPENDS = " \
    canopen-master \
    class-loader \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    canopen-master \
    class-loader \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    canopen-master \
    class-loader \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-industrial-release/ros_canopen-release/archive/release/melodic/canopen_402/0.8.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/canopen_402"
SRC_URI = "git://github.com/ros-industrial-release/ros_canopen-release;${ROS_BRANCH};protocol=https"
SRCREV = "036e622d3e10e919582ee175c723f24eba44eeea"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ros-canopen', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
