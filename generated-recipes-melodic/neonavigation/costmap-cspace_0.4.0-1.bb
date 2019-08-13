# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "3-dof configuration space costmap package"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation"
ROS_BPN = "costmap_cspace"

ROS_BUILD_DEPENDS = " \
    costmap-cspace-msgs \
    geometry-msgs \
    laser-geometry \
    nav-msgs \
    neonavigation-common \
    roscpp \
    sensor-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    costmap-cspace-msgs \
    geometry-msgs \
    laser-geometry \
    nav-msgs \
    neonavigation-common \
    roscpp \
    sensor-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    xmlrpcpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-cspace-msgs \
    geometry-msgs \
    laser-geometry \
    nav-msgs \
    neonavigation-common \
    roscpp \
    sensor-msgs \
    tf2-geometry-msgs \
    tf2-ros \
    tf2-sensor-msgs \
    xmlrpcpp \
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

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/costmap_cspace/0.4.0-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "4566608588d0d437d473371be594945a"
SRC_URI[sha256sum] = "f348d691d05d84eeac664cba12fbec411db59ab90a17c1d1a957f61037dcc72c"
S = "${WORKDIR}/neonavigation-release-release-melodic-costmap_cspace-0.4.0-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('neonavigation', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('neonavigation', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/neonavigation_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/neonavigation-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/neonavigation/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
