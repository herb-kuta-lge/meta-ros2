# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Message and service data structures for interacting with Gazebo from ROS."
AUTHOR = "Jose Luis Rivero <jrivero@osrfoundation.org>"
ROS_AUTHOR = "John Hsu"
HOMEPAGE = "http://gazebosim.org/tutorials?cat=connect_ros"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "gazebo_ros_pkgs"
ROS_BPN = "gazebo_msgs"

ROS_BUILD_DEPENDS = " \
    geometry-msgs \
    message-generation \
    sensor-msgs \
    std-msgs \
    std-srvs \
    trajectory-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    geometry-msgs \
    message-runtime \
    sensor-msgs \
    std-msgs \
    std-srvs \
    trajectory-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros-gbp/gazebo_ros_pkgs-release/archive/release/melodic/gazebo_msgs/2.8.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "40fb398685edc28165ac7e4e16e6cdbb"
SRC_URI[sha256sum] = "e0b6c175c51d3fcbe4a2c3143a70a3fc6a209c922c811159a2d5b1922db72426"
S = "${WORKDIR}/gazebo_ros_pkgs-release-release-melodic-gazebo_msgs-2.8.4-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('gazebo-ros-pkgs', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('gazebo-ros-pkgs', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/gazebo-ros-pkgs_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/gazebo-ros-pkgs-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/gazebo-ros-pkgs/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
