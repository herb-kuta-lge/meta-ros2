# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "qt_dotgraph provides helpers to work with dot graphs."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Thibault Kruse"
HOMEPAGE = "http://ros.org/wiki/qt_dotgraph"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "qt_gui_core"
ROS_BPN = "qt_dotgraph"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    python-qt-binding \
    python3-pydot \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    python3-pygraphviz \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/qt_gui_core-release/archive/release/dashing/qt_dotgraph/1.0.5-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "c31315e46d4222dee120c6ae39ab1120"
SRC_URI[sha256sum] = "7d44837d02bfd2d4d9cbba91c2915cf4ad05e199a1c26b3b386908549f613b94"
S = "${WORKDIR}/qt_gui_core-release-release-dashing-qt_dotgraph-1.0.5-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('qt-gui-core', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('qt-gui-core', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/qt-gui-core/qt-gui-core_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/qt-gui-core/qt-gui-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/qt-gui-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/qt-gui-core/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
