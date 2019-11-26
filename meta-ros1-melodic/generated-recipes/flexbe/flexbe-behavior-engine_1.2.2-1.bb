# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "A meta-package to aggregate all the FlexBE packages"
AUTHOR = "Philipp Schillinger <schillin@kth.se>"
HOMEPAGE = "http://ros.org/wiki/flexbe"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "flexbe"
ROS_BPN = "flexbe_behavior_engine"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    flexbe-core \
    flexbe-input \
    flexbe-mirror \
    flexbe-msgs \
    flexbe-onboard \
    flexbe-states \
    flexbe-testing \
    flexbe-widget \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_behavior_engine/1.2.2-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/flexbe_behavior_engine"
SRC_URI = "git://github.com/FlexBE/flexbe_behavior_engine-release;${ROS_BRANCH};protocol=https"
SRCREV = "58330e0070cb5809f88bb43b85f23e0875441aea"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
