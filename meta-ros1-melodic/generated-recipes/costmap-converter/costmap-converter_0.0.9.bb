# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A ros package that includes plugins and nodes to convert occupied costmap2d cells to primitive types."
AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
ROS_AUTHOR = "Christoph Rösmann <christoph.roesmann@tu-dortmund.de>"
HOMEPAGE = "http://wiki.ros.org/costmap_converter"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=15;endline=15;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "costmap_converter"
ROS_BPN = "costmap_converter"

ROS_BUILD_DEPENDS = " \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    message-generation \
    pluginlib \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    pluginlib \
    roscpp \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-2d \
    cv-bridge \
    dynamic-reconfigure \
    geometry-msgs \
    message-runtime \
    pluginlib \
    roscpp \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/rst-tu-dortmund/costmap_converter-release/archive/release/melodic/costmap_converter/0.0.9-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/costmap_converter"
SRC_URI = "git://github.com/rst-tu-dortmund/costmap_converter-release;${ROS_BRANCH};protocol=https"
SRCREV = "8cc4b31f3a3dcc5493e1cb29cd0cc00be592d61f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
