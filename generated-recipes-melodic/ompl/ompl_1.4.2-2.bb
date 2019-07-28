# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "OMPL is a free sampling-based motion planning library."
AUTHOR = "Mark Moll <mmoll@rice.edu>"
ROS_AUTHOR = "Kavraki Lab"
HOMEPAGE = "http://ompl.kavrakilab.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ompl"
ROS_BPN = "ompl"

ROS_BUILD_DEPENDS = " \
    boost \
    cmake \
    libeigen \
    pkgconfig \
"

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    libeigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    libeigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/ompl-release/archive/release/melodic/ompl/1.4.2-2.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a4488e2dc6ac10daf8109d31548aba8e"
SRC_URI[sha256sum] = "cdcd1f9c8f7d876221b6a1867cfb0ec99a3607a7c5118942fd430df007d8de70"
S = "${WORKDIR}/ompl-release-release-melodic-ompl-1.4.2-2"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ompl', d)}"
ROS_BUILD_TYPE = "cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ompl', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ompl/ompl_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ompl/ompl-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ompl/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ompl/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
