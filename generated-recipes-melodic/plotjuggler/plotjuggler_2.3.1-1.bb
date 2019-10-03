# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "PlotJuggler: juggle with data"
AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
ROS_AUTHOR = "Davide Faconti <davide.faconti@gmail.com>"
HOMEPAGE = "https://github.com/facontidavide/PlotJuggler"
SECTION = "devel"
LICENSE = "LGPL-2"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=a9a72c186797ff98a79f90205c589abf"

ROS_CN = "plotjuggler"
ROS_BPN = "plotjuggler"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_binutils} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_qtdeclarative5-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_qtmultimedia5-dev} \
    diagnostic-msgs \
    nav-msgs \
    qtbase \
    ros-type-introspection \
    rosbag \
    rosbag-storage \
    roscpp \
    roscpp-serialization \
    rostime \
    tf \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_binutils} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_qtdeclarative5-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_qtmultimedia5-dev} \
    diagnostic-msgs \
    nav-msgs \
    qtbase \
    ros-type-introspection \
    rosbag \
    rosbag-storage \
    roscpp \
    roscpp-serialization \
    rostime \
    tf \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_binutils} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_qtdeclarative5-dev} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_qtmultimedia5-dev} \
    diagnostic-msgs \
    nav-msgs \
    qtbase \
    ros-type-introspection \
    rosbag \
    rosbag-storage \
    roscpp \
    roscpp-serialization \
    rostime \
    tf \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/facontidavide/plotjuggler-release/archive/release/melodic/plotjuggler/2.3.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "315404940a5cbf554f61f74fe5932c5e"
SRC_URI[sha256sum] = "75ce60382945fad506db651af0fbb7159f2b4d6ba56e97f94d2176d6a04f810c"
S = "${WORKDIR}/plotjuggler-release-release-melodic-plotjuggler-2.3.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('plotjuggler', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('plotjuggler', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/plotjuggler/plotjuggler_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/plotjuggler/plotjuggler-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/plotjuggler/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/plotjuggler/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
