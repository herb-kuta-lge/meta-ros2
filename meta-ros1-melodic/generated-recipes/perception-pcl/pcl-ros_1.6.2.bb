# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "PCL (Point Cloud Library) ROS interface stack. PCL-ROS is the preferred   bridge for 3D applications involving n-D Point Clouds and 3D geometry   processing in ROS."
AUTHOR = "Paul Bovbel <paul@bovbel.com>"
ROS_AUTHOR = "Open Perception"
HOMEPAGE = "http://ros.org/wiki/perception_pcl"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=20;endline=20;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "perception_pcl"
ROS_BPN = "pcl_ros"

ROS_BUILD_DEPENDS = " \
    cmake-modules \
    dynamic-reconfigure \
    libeigen \
    message-filters \
    nodelet \
    nodelet-topic-tools \
    pcl \
    pcl-conversions \
    pcl-msgs \
    pluginlib \
    rosbag \
    rosconsole \
    roscpp \
    roslib \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    dynamic-reconfigure \
    libeigen \
    message-filters \
    nodelet \
    nodelet-topic-tools \
    pcl \
    pcl-conversions \
    pcl-msgs \
    pluginlib \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dynamic-reconfigure \
    libeigen \
    message-filters \
    nodelet \
    nodelet-topic-tools \
    pcl \
    pcl-conversions \
    pcl-msgs \
    pluginlib \
    rosbag \
    roscpp \
    sensor-msgs \
    std-msgs \
    tf \
    tf2-eigen \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/perception_pcl-release/archive/release/melodic/pcl_ros/1.6.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/pcl_ros"
SRC_URI = "git://github.com/ros-gbp/perception_pcl-release;${ROS_BRANCH};protocol=https"
SRCREV = "f452488fc90f101b3a0580cc2fbecf841b4cb86f"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
