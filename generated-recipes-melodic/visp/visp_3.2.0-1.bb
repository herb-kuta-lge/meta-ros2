# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "ViSP standing for Visual Servoing Platform is a modular cross     platform library that allows prototyping and developing applications     using visual tracking and visual servoing technics at the heart of the     researches done by Inria Lagadic team. ViSP is able to compute control     laws that can be applied to robotic systems. It provides a set of visual     features that can be tracked using real time image processing or computer     vision algorithms. ViSP provides also simulation capabilities.      ViSP can be useful in robotics, computer vision, augmented reality     and computer animation."
AUTHOR = "Fabien Spindler <Fabien.Spindler@inria.fr>"
ROS_AUTHOR = "Thomas Moulard, Fabien Spindler"
HOMEPAGE = "http://www.ros.org/wiki/visp"
SECTION = "devel"
LICENSE = "GPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=fe8b75cf0aba647401e1038bcd69ee74"

ROS_CN = "visp"
ROS_BPN = "visp"

ROS_BUILD_DEPENDS = " \
    bzip2 \
    doxygen \
    libcoin80-dev \
    libdc1394-dev \
    libdmtx-dev \
    libeigen \
    libjpeq-turbo \
    liblapack-dev \
    libogre-dev \
    libois-dev \
    libpng-dev \
    libv4l-dev \
    libx11 \
    libxml2 \
    opencv \
    zbar \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    bzip2 \
    libcoin80-dev \
    libdc1394-dev \
    libdmtx-dev \
    libeigen \
    libjpeq-turbo \
    liblapack-dev \
    libogre-dev \
    libois-dev \
    libpng-dev \
    libv4l-dev \
    libx11 \
    libxml2 \
    opencv \
    zbar \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    bzip2 \
    libcoin80-dev \
    libdc1394-dev \
    libdmtx-dev \
    libeigen \
    libjpeq-turbo \
    liblapack-dev \
    libogre-dev \
    libois-dev \
    libpng-dev \
    libv4l-dev \
    libx11 \
    libxml2 \
    opencv \
    zbar \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/lagadic/visp-release/archive/release/melodic/visp/3.2.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a15b6d28a6a07a62723b6fb7ebad57ec"
SRC_URI[sha256sum] = "346143452a134faec92f55373cdc2be7500a1e98c0c2b4a4459d7511adeea98c"
S = "${WORKDIR}/visp-release-release-melodic-visp-3.2.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('visp', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('visp', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visp/visp_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visp/visp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/visp/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
