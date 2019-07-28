# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Utilities for flashing and enabling Kobuki's USB connection. 	    This package contains tools for flashing the Kobuki's FTDI chip (usually done at the factory). 	    The special firmware for the FTDI chip (USB to serial converter) enables it to appear as 	    /dev/kobuki on the user's PC."
AUTHOR = "Younghun Ju <yhju@yujinrobot.com>"
ROS_AUTHOR = "Younghun Ju <yhju@yujinrobot.com>"
HOMEPAGE = "http://ros.org/wiki/kobuki_ftdi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "kobuki_core"
ROS_BPN = "kobuki_ftdi"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ftdi-eeprom} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libftdi-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libusb-dev} \
    ecl-command-line \
    pkgconfig \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ftdi-eeprom} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libftdi-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libusb-dev} \
    ecl-command-line \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ftdi-eeprom} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libftdi-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libusb-dev} \
    ecl-command-line \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/kobuki_core-release/archive/release/melodic/kobuki_ftdi/0.7.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "dd3b9bd83e1d0cc248eb5858baf3f2e3"
SRC_URI[sha256sum] = "e1c6ba8e7d1fbd11de09faca56c7dd845fb12aa44432909e2ae0df6867296828"
S = "${WORKDIR}/kobuki_core-release-release-melodic-kobuki_ftdi-0.7.8-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('kobuki-core', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('kobuki-core', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-core/kobuki-core_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-core/kobuki-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/kobuki-core/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
