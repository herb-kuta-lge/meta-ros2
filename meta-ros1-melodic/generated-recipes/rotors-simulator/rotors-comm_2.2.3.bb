# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "RotorS specific messages and services."
AUTHOR = "Fadri Furrer <fadri.furrer@mavt.ethz.ch>"
ROS_AUTHOR = "Fadri Furrer"
HOMEPAGE = "https://github.com/ethz-asl/rotors_simulator"
SECTION = "devel"
LICENSE = "ASL-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=5f4e9e9dcee74b02aa26af144fe2f0af"

ROS_CN = "rotors_simulator"
ROS_BPN = "rotors_comm"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    message-generation \
    message-runtime \
    octomap-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    message-generation \
    message-runtime \
    octomap-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cmake-modules \
    geometry-msgs \
    message-generation \
    message-runtime \
    octomap-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ethz-asl/rotors_simulator-release/archive/release/melodic/rotors_comm/2.2.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rotors_comm"
SRC_URI = "git://github.com/ethz-asl/rotors_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "084be855d23442f6629384f3ac33df752bfa7bab"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rotors-simulator', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
