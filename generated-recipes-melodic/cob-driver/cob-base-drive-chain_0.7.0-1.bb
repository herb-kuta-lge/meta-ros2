# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This package contains classes that are able to control the platform of the Care-O-Bot. This means to establish a CAN communication to drive and steering motors of the platform and later send motion commands and receive motor information."
AUTHOR = "Matthias Gruhler <mig@ipa.fhg.de>"
ROS_AUTHOR = "Christian Connette"
HOMEPAGE = "http://ros.org/wiki/cob_base_drive_chain"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_driver"
ROS_BPN = "cob_base_drive_chain"

ROS_BUILD_DEPENDS = " \
    cob-canopen-motor \
    cob-generic-can \
    cob-utilities \
    control-msgs \
    diagnostic-msgs \
    message-generation \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cob-canopen-motor \
    cob-generic-can \
    cob-utilities \
    control-msgs \
    diagnostic-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-canopen-motor \
    cob-generic-can \
    cob-utilities \
    control-msgs \
    diagnostic-msgs \
    message-runtime \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/cob_driver-release/archive/release/melodic/cob_base_drive_chain/0.7.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "386951ad3bc89fce5b8e95dae1c517ca"
SRC_URI[sha256sum] = "f5d79bcd8f90405a99ef4689d3760f4dfaec222460817bfadfc4cc848ebe0fec"
S = "${WORKDIR}/cob_driver-release-release-melodic-cob_base_drive_chain-0.7.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('cob-driver', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('cob-driver', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/cob-driver_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/cob-driver-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-driver/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
