# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Demonstration and sample launch files for neonavigation meta-package"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "neonavigation"
ROS_BPN = "neonavigation_launch"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    costmap-cspace \
    map-server \
    planner-cspace \
    safety-limiter \
    tf2-ros \
    trajectory-tracker \
    trajectory-tracker-rviz-plugins \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/at-wat/neonavigation-release/archive/release/melodic/neonavigation_launch/0.4.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "1748eba613709c35277e02e613a2d876"
SRC_URI[sha256sum] = "884e164ae66cfc46c47acf497bdda11b34342518bfe019b3e2f2c9b30a0abbc7"
S = "${WORKDIR}/neonavigation-release-release-melodic-neonavigation_launch-0.4.3-1"

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
