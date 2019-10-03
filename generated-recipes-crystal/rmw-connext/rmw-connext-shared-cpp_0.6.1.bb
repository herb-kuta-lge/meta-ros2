# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "C++ types and functions shared by the ROS middleware interface to RTI Connext Static and RTI Connext Dynamic."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_CN = "rmw_connext"
ROS_BPN = "rmw_connext_shared_cpp"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_rti-connext-dds-5.3.1} \
    connext-cmake-module \
    rcutils \
    rmw \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_rti-connext-dds-5.3.1} \
    connext-cmake-module \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rmw_connext-release/archive/release/crystal/rmw_connext_shared_cpp/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a628641a20fd6818b7577978b12f6b17"
SRC_URI[sha256sum] = "7c45059558c31cf04c5130b14d5df11dedac4f01991d29cec84c4d95784a120b"
S = "${WORKDIR}/rmw_connext-release-release-crystal-rmw_connext_shared_cpp-0.6.1-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rmw-connext', d)}"
ROS_BUILD_TYPE = "ament_cmake"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('rmw-connext', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-connext/rmw-connext_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-connext/rmw-connext-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-connext/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/rmw-connext/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
