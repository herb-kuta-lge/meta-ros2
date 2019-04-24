# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "C++ library to convert between ROS messages and MRPT classes"
AUTHOR = "Jose-Luis Blanco-Claraco <jlblanco@ual.es>"
ROS_AUTHOR = "Markus Bader <markus.bader@tuwien.ac.at>"
HOMEPAGE = "http://wiki.ros.org/mrpt_bridge"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrpt_bridge"
ROS_BPN = "mrpt_bridge"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    marker-msgs \
    message-generation \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    pcl \
    pcl-conversions \
    qtbase \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    marker-msgs \
    message-generation \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    marker-msgs \
    message-generation \
    message-runtime \
    mrpt-msgs \
    mrpt1 \
    nav-msgs \
    roscpp \
    sensor-msgs \
    std-msgs \
    stereo-msgs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/mrpt-ros-pkg-release/mrpt_bridge-release/archive/release/melodic/mrpt_bridge/0.1.25-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "bee0794170cc15fe61251590e634a3ac"
SRC_URI[sha256sum] = "58292956027c9b5bc85b4223fc9ce1220d88b975e68206ad1a963728ca27d396"
S = "${WORKDIR}/mrpt_bridge-release-release-melodic-mrpt_bridge-0.1.25-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mrpt-bridge', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mrpt-bridge', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-bridge/mrpt-bridge_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-bridge/mrpt-bridge-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-bridge/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mrpt-bridge/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
