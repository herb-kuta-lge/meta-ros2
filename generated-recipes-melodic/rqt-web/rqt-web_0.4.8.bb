# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "rqt_web is a simple web content viewer for rqt. Users can show web content in Qt-based window by specifying its URL."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
ROS_AUTHOR = "Aaron Blasdel"
HOMEPAGE = "http://wiki.ros.org/rqt_web"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rqt_web"
ROS_BPN = "rqt_web"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-rospkg} \
    python-qt-binding \
    qt-gui \
    rospy \
    rqt-gui \
    rqt-gui-py \
    webkit-dependency \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-rospkg} \
    python-qt-binding \
    qt-gui \
    rospy \
    rqt-gui \
    rqt-gui-py \
    webkit-dependency \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/rqt_web-release/archive/release/melodic/rqt_web/0.4.8-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e030a570e7434f7499ab61c064e53a76"
SRC_URI[sha256sum] = "3192e2e64f268d79b93d505bc475aa1f39009e75f645d294934d55c2b0b27303"
S = "${WORKDIR}/rqt_web-release-release-melodic-rqt_web-0.4.8-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rqt-web', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rqt-web', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-web/rqt-web_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-web/rqt-web-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-web/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rqt-web/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
