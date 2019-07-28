# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Messages exclusive to Jackal, especially for representing low-level motor commands and sensors."
AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
ROS_AUTHOR = "Mike Purvis <mpurvis@clearpathrobotics.com>"
HOMEPAGE = "http://wiki.ros.org/jackal_msgs"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jackal"
ROS_BPN = "jackal_msgs"

ROS_BUILD_DEPENDS = " \
    message-generation \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    message-runtime \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    message-runtime \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/clearpath-gbp/jackal-release/archive/release/melodic/jackal_msgs/0.6.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "732676a514da662ec037fcf3ffa16afc"
SRC_URI[sha256sum] = "4be5567160fa88f461cf4319ebdbd28ea67a3060cb7bb41fcf3dfadd4396c9ef"
S = "${WORKDIR}/jackal-release-release-melodic-jackal_msgs-0.6.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jackal', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jackal', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jackal/jackal_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jackal/jackal-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jackal/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jackal/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
