# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "An example controller manager plugin for MoveIt. This is not functional code."
AUTHOR = "Michael Görner <me@v4hn.de>"
ROS_AUTHOR = "Ioan Sucan <isucan@google.com>"
HOMEPAGE = "http://moveit.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "moveit"
ROS_BPN = "moveit_controller_manager_example"

ROS_BUILD_DEPENDS = " \
    moveit-core \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    moveit-core \
    pluginlib \
    roscpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    moveit-core \
    pluginlib \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros-gbp/moveit-release/archive/release/melodic/moveit_controller_manager_example/1.0.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/moveit_controller_manager_example"
SRC_URI = "git://github.com/ros-gbp/moveit-release;${ROS_BRANCH};protocol=https"
SRCREV = "061d843ddc9c084a957d23dabe64142e28c7e782"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('moveit', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
