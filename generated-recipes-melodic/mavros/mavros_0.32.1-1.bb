# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "MAVROS -- MAVLink extendable communication node for ROS     with proxy for Ground Control Station."
AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
ROS_AUTHOR = "Vladimir Ermakov <vooon341@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/mavros"
SECTION = "devel"
LICENSE = "GPL-3 & LGPL-2 & BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "mavros"
ROS_BPN = "mavros"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_geographiclib-tools} \
    angles \
    boost \
    cmake-modules \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-conversions \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    libmavconn \
    mavlink \
    mavros-msgs \
    nav-msgs \
    pluginlib \
    rosconsole-bridge \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_geographiclib-tools} \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-conversions \
    geographic-msgs \
    geographiclib \
    geometry-msgs \
    libeigen \
    libmavconn \
    mavlink \
    mavros-msgs \
    nav-msgs \
    pluginlib \
    rosconsole-bridge \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    diagnostic-msgs \
    diagnostic-updater \
    eigen-conversions \
    geographic-msgs \
    geometry-msgs \
    libmavconn \
    mavros-msgs \
    message-runtime \
    nav-msgs \
    pluginlib \
    rosconsole-bridge \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2-eigen \
    tf2-ros \
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

SRC_URI = "https://github.com/mavlink/mavros-release/archive/release/melodic/mavros/0.32.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ce1d9c24be1b32891153540e9bf94f9f"
SRC_URI[sha256sum] = "3d4332f4b7c3fee7cafec325e2ccfa936105fac92254a38e646ec6205a3f17f3"
S = "${WORKDIR}/mavros-release-release-melodic-mavros-0.32.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mavros', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('mavros', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/mavros_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/mavros-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/mavros/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
