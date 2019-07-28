# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Virtual package providing ViSP related packages."
AUTHOR = "Fabien Spindler <fabien.spindler@inria.fr>"
ROS_AUTHOR = "Thomas Moulard <thomas.moulard@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/vision_visp"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_CN = "vision_visp"
ROS_BPN = "vision_visp"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    visp-auto-tracker \
    visp-bridge \
    visp-camera-calibration \
    visp-hand2eye-calibration \
    visp-tracker \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    visp-auto-tracker \
    visp-bridge \
    visp-camera-calibration \
    visp-hand2eye-calibration \
    visp-tracker \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/lagadic/vision_visp-release/archive/release/melodic/vision_visp/0.11.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "124956e4a6c5de922ac56b6afc72691e"
SRC_URI[sha256sum] = "ef04aa5ab2459ab1a2690f7386f223e98c86285200d45fd11f101195550dc1ef"
S = "${WORKDIR}/vision_visp-release-release-melodic-vision_visp-0.11.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('vision-visp', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('vision-visp', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-visp/vision-visp_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-visp/vision-visp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-visp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-visp/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
