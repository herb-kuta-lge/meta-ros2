# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "A collection of navigation plugins and tools: Various recovery behaviors,     local and global planner plugins for move_base, a teleop filter for     obstacle avoidance, a simple control-based move_base replacement     etc."
AUTHOR = "Martin Günther <martin.guenther@dfki.de>"
HOMEPAGE = "http://wiki.ros.org/navigation_experimental"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "navigation_experimental"
ROS_BPN = "navigation_experimental"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assisted-teleop \
    goal-passer \
    pose-base-controller \
    pose-follower \
    sbpl-lattice-planner \
    sbpl-recovery \
    twist-recovery \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/navigation_experimental-release/archive/release/melodic/navigation_experimental/0.3.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "3ac9b733135d014a9ff43b07b528f777"
SRC_URI[sha256sum] = "79834c6c9f70411161eb2604ba1e6b13ecd2d28c89eeefd583530f237a8f851f"
S = "${WORKDIR}/navigation_experimental-release-release-melodic-navigation_experimental-0.3.2-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation-experimental', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('navigation-experimental', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/navigation-experimental_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/navigation-experimental-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/navigation-experimental/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
