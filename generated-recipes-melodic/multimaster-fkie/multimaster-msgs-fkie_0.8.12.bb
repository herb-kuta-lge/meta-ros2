# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The messages required by multimaster packages."
AUTHOR = "Alexander Tiderko <alexander.tiderko@gmail.com>"
ROS_AUTHOR = "Alexander Tiderko"
HOMEPAGE = "http://ros.org/wiki/multimaster_msgs_fkie"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "multimaster_fkie"
ROS_BPN = "multimaster_msgs_fkie"

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

SRC_URI = "https://github.com/fkie-release/multimaster_fkie-release/archive/release/melodic/multimaster_msgs_fkie/0.8.12-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "0588eddc83fb64b9cb550a5d7186433e"
SRC_URI[sha256sum] = "e69b1c634583d23b9fce4e222c7e4f1728b6849811b9fcb13ef41b0bb26bbc6a"
S = "${WORKDIR}/multimaster_fkie-release-release-melodic-multimaster_msgs_fkie-0.8.12-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('multimaster-fkie', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('multimaster-fkie', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/multimaster-fkie/multimaster-fkie_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/multimaster-fkie/multimaster-fkie-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/multimaster-fkie/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/multimaster-fkie/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
