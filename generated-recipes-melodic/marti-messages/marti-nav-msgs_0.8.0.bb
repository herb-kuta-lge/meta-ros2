# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "marti_nav_msgs"
AUTHOR = "Marc Alban <malban@swri.org>"
ROS_AUTHOR = "Marc Alban"
HOMEPAGE = "https://github.com/swri-robotics/marti_messages"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "marti_messages"
ROS_BPN = "marti_nav_msgs"

ROS_BUILD_DEPENDS = " \
    geographic-msgs \
    geometry-msgs \
    marti-common-msgs \
    message-generation \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geographic-msgs \
    geometry-msgs \
    marti-common-msgs \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geographic-msgs \
    geometry-msgs \
    marti-common-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/swri-robotics-gbp/marti_messages-release/archive/release/melodic/marti_nav_msgs/0.8.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6993a28e58a713d414eb4364ed372b55"
SRC_URI[sha256sum] = "d4e787cb1a9e173eda0759738129af2ec90c286bcc3dcc35b4d622198ed2b917"
S = "${WORKDIR}/marti_messages-release-release-melodic-marti_nav_msgs-0.8.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('marti-messages', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('marti-messages', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-messages/marti-messages_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-messages/marti-messages-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-messages/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/marti-messages/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
