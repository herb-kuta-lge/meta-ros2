# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A simple viewer for ROS image topics with draw-on features"
AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/image_view2"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_common"
ROS_BPN = "image_view2"

ROS_BUILD_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    image-view \
    message-filters \
    message-generation \
    pcl-ros \
    roscpp \
    rostest \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    image-view \
    message-filters \
    message-runtime \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cv-bridge \
    geometry-msgs \
    image-geometry \
    image-transport \
    image-view \
    message-filters \
    message-runtime \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-numpy} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-scipy} \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/image_view2/2.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "91b58e0f82aed02890994eae41d8b7be"
SRC_URI[sha256sum] = "fc10ec510f70e52bb26455ddc62237f9b9c3dfa77819fa84c140d41617db004c"
S = "${WORKDIR}/jsk_common-release-release-melodic-image_view2-2.2.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jsk-common', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jsk-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/jsk-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/jsk-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
