# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The md49_base_controller package"
AUTHOR = "Fabian Prinzing <scheik.todeswache@googlemail.com>"
ROS_AUTHOR = "Fabian Prinzing <scheik.todeswache@googlemail.com>"
HOMEPAGE = "http://www.the-starbearer.de"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "md49_base_controller"
ROS_BPN = "md49_base_controller"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    md49-messages \
    md49-serialport \
    message-generation \
    roscpp \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    md49-messages \
    md49-serialport \
    message-runtime \
    roscpp \
    rospy \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    md49-messages \
    md49-serialport \
    message-runtime \
    roscpp \
    rospy \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/Scheik/md49_base_controller-release/archive/release/melodic/md49_base_controller/0.1.4-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/md49_base_controller"
SRC_URI = "git://github.com/Scheik/md49_base_controller-release;${ROS_BRANCH};protocol=https"
SRCREV = "b87ffd1cdaa6806e790af1f120156cd8e21ae420"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('md49-base-controller', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
