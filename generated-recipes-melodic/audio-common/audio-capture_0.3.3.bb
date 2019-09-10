# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Transports audio from a source to a destination. Audio sources can come       from a microphone or file. The destination can play the audio or save it       to an mp3 file."
AUTHOR = "Austin Hendrix <namniart@gmail.com>"
ROS_AUTHOR = "Nate Koenig"
HOMEPAGE = "http://ros.org/wiki/audio_capture"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=a3ae2ba3f0f44e61270955e8cd98afcf"

ROS_CN = "audio_common"
ROS_BPN = "audio_capture"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libgstreamer-plugins-base1.0-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_libgstreamer1.0-dev} \
    audio-common-msgs \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-plugins-base} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-plugins-good} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-plugins-ugly} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0} \
    audio-common-msgs \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-plugins-base} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-plugins-good} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0-plugins-ugly} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gstreamer1.0} \
    audio-common-msgs \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/audio_common-release/archive/release/melodic/audio_capture/0.3.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "952046920adf51bfaedef5ef93fe1ed7"
SRC_URI[sha256sum] = "c24552309d44459372bb344e5d02af47ce6f9451329cb1f73e99e57833d734cb"
S = "${WORKDIR}/audio_common-release-release-melodic-audio_capture-0.3.3-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('audio-common', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('audio-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/audio-common/audio-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/audio-common/audio-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/audio-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/audio-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
