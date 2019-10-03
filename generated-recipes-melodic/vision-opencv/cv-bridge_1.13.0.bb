# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This contains CvBridge, which converts between ROS     Image messages and OpenCV images."
AUTHOR = "Vincent Rabaud <vincent.rabaud@gmail.com>"
ROS_AUTHOR = "Patrick Mihelich"
HOMEPAGE = "http://www.ros.org/wiki/cv_bridge"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "vision_opencv"
ROS_BPN = "cv_bridge"

ROS_BUILD_DEPENDS = " \
    boost \
    opencv \
    python \
    rosconsole \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    opencv \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    opencv \
    python \
    rosconsole \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    python-numpy \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/vision_opencv-release/archive/release/melodic/cv_bridge/1.13.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "49fa9e8fe00ff37cbc8ad3b0b3a1ed50"
SRC_URI[sha256sum] = "fb812741718a40399f538eaef7c887b79004afcdbe0271b3258c5c8ee9c55023"
S = "${WORKDIR}/vision_opencv-release-release-melodic-cv_bridge-1.13.0-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('vision-opencv', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('vision-opencv', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/vision-opencv_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/vision-opencv-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/vision-opencv/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
