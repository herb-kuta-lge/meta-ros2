# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Drive-by-wire interface to the Dataspeed Inc. Chrysler Pacifica DBW kit"
AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
ROS_AUTHOR = "Kevin Hallenbeck <khallenbeck@dataspeedinc.com>"
HOMEPAGE = "http://dataspeedinc.com"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "dbw_fca_ros"
ROS_BPN = "dbw_fca_can"

ROS_BUILD_DEPENDS = " \
    can-msgs \
    dbw-fca-msgs \
    geometry-msgs \
    nodelet \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    can-msgs \
    dbw-fca-msgs \
    geometry-msgs \
    nodelet \
    roscpp \
    rospy \
    sensor-msgs \
    std-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    can-msgs \
    dataspeed-can-usb \
    dataspeed-ulc-can \
    dbw-fca-description \
    dbw-fca-msgs \
    geometry-msgs \
    nodelet \
    roscpp \
    roslaunch \
    rospy \
    sensor-msgs \
    std-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/DataspeedInc-release/dbw_fca_ros-release/archive/release/melodic/dbw_fca_can/1.0.6-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/dbw_fca_can"
SRC_URI = "git://github.com/DataspeedInc-release/dbw_fca_ros-release;${ROS_BRANCH};protocol=https"
SRCREV = "e92d4858d42d8e08b4e3a03317fb074f638e6ee1"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('dbw-fca-ros', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
