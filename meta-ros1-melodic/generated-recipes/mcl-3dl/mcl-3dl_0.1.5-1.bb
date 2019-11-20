# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "3-D/6-DOF localization for mobile robots with 3-D LIDAR(s)"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mcl_3dl"
ROS_BPN = "mcl_3dl"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    libeigen \
    mcl-3dl-msgs \
    nav-msgs \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    geometry-msgs \
    libeigen \
    mcl-3dl-msgs \
    nav-msgs \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    libeigen \
    mcl-3dl-msgs \
    nav-msgs \
    pcl-ros \
    roscpp \
    sensor-msgs \
    std-msgs \
    std-srvs \
    tf2 \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/at-wat/mcl_3dl-release/archive/release/melodic/mcl_3dl/0.1.5-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mcl_3dl"
SRC_URI = "git://github.com/at-wat/mcl_3dl-release;${ROS_BRANCH};protocol=https"
SRCREV = "34dc8d46062cf4f0dac70d721abea848d5c7cd36"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('mcl-3dl', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
