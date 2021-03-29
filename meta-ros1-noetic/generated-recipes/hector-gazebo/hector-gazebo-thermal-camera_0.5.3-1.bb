# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "hector_gazebo_thermal_camera provides a gazebo plugin that produces simulated thermal camera images. The plugin uses modified code from the gazebo_ros_camera plugin."
AUTHOR = "Stefan Fabian <fabian@sim.tu-darmstadt.de>"
ROS_AUTHOR = "Stefan Kohlbrecher <kohlbrecher@sim.tu-darmstadt.de>"
HOMEPAGE = "http://ros.org/wiki/hector_gazebo_thermal_camera"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "hector_gazebo"
ROS_BPN = "hector_gazebo_thermal_camera"

ROS_BUILD_DEPENDS = " \
    gazebo-plugins \
    roscpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_DEP-gazebo} \
    gazebo-plugins \
    roscpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release/archive/release/noetic/hector_gazebo_thermal_camera/0.5.3-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/hector_gazebo_thermal_camera"
SRC_URI = "git://github.com/tu-darmstadt-ros-pkg-gbp/hector_gazebo-release;${ROS_BRANCH};protocol=https"
SRCREV = "b77d905d66c45178ddef5a97e499e0ccda0427ea"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}