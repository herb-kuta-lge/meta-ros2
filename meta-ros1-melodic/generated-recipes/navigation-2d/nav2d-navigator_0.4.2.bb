# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides a node for higher level navigation of a mobile     robot in a planar environment. It needs a map and the robot's position     within this map to create a plan for navigation. When used together with     a SLAM module it can also be used to perform autonomous exploration of     the robot's workspace."
AUTHOR = "Sebastian Kasperski <sebastian.kasperski@dfki.de>"
ROS_AUTHOR = "Sebastian Kasperski <sebastian.kasperski@dfki.de>"
HOMEPAGE = "http://wiki.ros.org/robot_operator"
SECTION = "devel"
LICENSE = "GPL-3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=1e7b3bcc2e271699c77c769685058cbe"

ROS_CN = "navigation_2d"
ROS_BPN = "nav2d_navigator"

ROS_BUILD_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-generation \
    nav2d-msgs \
    nav2d-operator \
    pluginlib \
    roscpp \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    nav2d-msgs \
    nav2d-operator \
    pluginlib \
    roscpp \
    std-srvs \
    tf \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    actionlib \
    actionlib-msgs \
    geometry-msgs \
    message-runtime \
    nav2d-msgs \
    nav2d-operator \
    pluginlib \
    roscpp \
    std-srvs \
    tf \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/skasperski/navigation_2d-release/archive/release/melodic/nav2d_navigator/0.4.2-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/nav2d_navigator"
SRC_URI = "git://github.com/skasperski/navigation_2d-release;${ROS_BRANCH};protocol=https"
SRCREV = "ddbcb3eb120c0f5c15a17e281eb8b9f829d87585"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('navigation-2d', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
