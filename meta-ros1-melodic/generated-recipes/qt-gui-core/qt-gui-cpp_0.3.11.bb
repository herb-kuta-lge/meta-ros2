# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "qt_gui_cpp provides the foundation for C++-bindings for qt_gui and creates bindings for every generator available.     At least one specific binding must be available in order to use C++-plugins."
AUTHOR = "D. Hood <dhood@osrfoundation.org>"
ROS_AUTHOR = "Dirk Thomas"
HOMEPAGE = "http://ros.org/wiki/qt_gui_cpp"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "qt_gui_core"
ROS_BPN = "qt_gui_cpp"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    libtinyxml \
    pkgconfig \
    pluginlib \
    python-qt-binding \
    qtbase \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    libtinyxml \
    pluginlib \
    qt-gui \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    libtinyxml \
    pluginlib \
    qt-gui \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/qt_gui_core-release/archive/release/melodic/qt_gui_cpp/0.3.11-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/qt_gui_cpp"
SRC_URI = "git://github.com/ros-gbp/qt_gui_core-release;${ROS_BRANCH};protocol=https"
SRCREV = "1f18e71e763940783c684038cb4419e3d1a1516e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
