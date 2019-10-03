# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Extensions to RxROS for working with TF."
AUTHOR = "Andrzej Wasowski <wasowski@itu.dk>"
ROS_AUTHOR = "Henrik Larsen"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rxros"
ROS_BPN = "rxros_tf"

ROS_BUILD_DEPENDS = " \
    rxros \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    rxros \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/rosin-project/rxros-release/archive/release/melodic/rxros_tf/0.1.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "6b6315c918326b840fb4c549521b3f68"
SRC_URI[sha256sum] = "dc14d6a0fb3706f25cbad9696e1b39a5e9b16f44be6f8f827a13aa5833bbe355"
S = "${WORKDIR}/rxros-release-release-melodic-rxros_tf-0.1.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rxros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rxros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/rxros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/rxros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rxros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
