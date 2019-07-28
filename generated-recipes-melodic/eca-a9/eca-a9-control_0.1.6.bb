# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Configuration and launch files to control the ECA A9 AUV"
AUTHOR = "Thibault Pelletier <thp@eca.fr>"
ROS_AUTHOR = "Thibault Pelletier <thp@eca.fr>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

ROS_CN = "eca_a9"
ROS_BPN = "eca_a9_control"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    uuv-teleop \
    uuv-trajectory-control \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/uuvsimulator/eca_a9-release/archive/release/melodic/eca_a9_control/0.1.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c2129c71d771d61338a968a1e69dd35a"
SRC_URI[sha256sum] = "2c5e9d6e0a17f5cf7b07029ac6e1df1dbcb1d47b77737b8c1d5a1eefd3254c1e"
S = "${WORKDIR}/eca_a9-release-release-melodic-eca_a9_control-0.1.6-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('eca-a9', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('eca-a9', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eca-a9/eca-a9_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eca-a9/eca-a9-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eca-a9/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/eca-a9/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
