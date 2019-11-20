# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The nmea_gps_plugin package"
AUTHOR = "Masaya Kataoka <ms.kataoka@gmail.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=fc216ef9336537897fbeafa564601763"

ROS_CN = "nmea_gps_plugin"
ROS_BPN = "nmea_gps_plugin"

ROS_BUILD_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    gazebo-ros \
    geodesy \
    geographic-msgs \
    libeigen \
    nmea-msgs \
    quaternion-operation \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    gazebo-ros \
    geodesy \
    geographic-msgs \
    libeigen \
    nmea-msgs \
    quaternion-operation \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_gazebo} \
    gazebo-ros \
    geodesy \
    libeigen \
    nmea-msgs \
    quaternion-operation \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/OUXT-Polaris/nmea_gps_plugin-release/archive/release/melodic/nmea_gps_plugin/0.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/nmea_gps_plugin"
SRC_URI = "git://github.com/OUXT-Polaris/nmea_gps_plugin-release;${ROS_BRANCH};protocol=https"
SRCREV = "55a72aee58f1b4e26066970e4b882334e830a647"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('nmea-gps-plugin', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
