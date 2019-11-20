# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Interface driver for Omron OS32C Lidar via Ethernet/IP (Industrial Protocol)"
AUTHOR = "Rein Appeldoorn <rein@eurogroep.com>"
ROS_AUTHOR = "Kareem Shehata <kareem@shehata.ca>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "omron_os32c_driver"
ROS_BPN = "omron_os32c_driver"

ROS_BUILD_DEPENDS = " \
    boost \
    diagnostic-updater \
    odva-ethernetip \
    rosconsole-bridge \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    boost \
    diagnostic-updater \
    odva-ethernetip \
    rosconsole-bridge \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    boost \
    diagnostic-updater \
    odva-ethernetip \
    rosconsole-bridge \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslaunch \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-drivers-gbp/omron-release/archive/release/melodic/omron_os32c_driver/1.0.0-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/omron_os32c_driver"
SRC_URI = "git://github.com/ros-drivers-gbp/omron-release;${ROS_BRANCH};protocol=https"
SRCREV = "f88fcc0b9072b63f207b024b0b5fd53f422728ba"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('omron-os32c-driver', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
