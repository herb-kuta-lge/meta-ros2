# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "Simulation-related packages for MRP2"
AUTHOR = "Emir Cem Gezer <emircem.g@milvusrobotics.com>"
ROS_AUTHOR = "Akif Hacinecipoglu <akifhno@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/mrp2_simulator"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "mrp2_simulator"
ROS_BPN = "mrp2_simulator"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    mrp2-gazebo \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    mrp2-gazebo \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/milvusrobotics/mrp2_simulator-release/archive/release/melodic/mrp2_simulator/1.0.1-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/mrp2_simulator"
SRC_URI = "git://github.com/milvusrobotics/mrp2_simulator-release;${ROS_BRANCH};protocol=https"
SRCREV = "d2c17c0224711103d52f0b4d5bb971d6dfdbd965"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}