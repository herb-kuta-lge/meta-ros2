# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "euscollada"
AUTHOR = "Yohei Kakiuchi <youhei@jsk.t.u-tokyo.ac.jp>"
ROS_AUTHOR = "Kei Okada <k-okada@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "http://ros.org/wiki/euscollada"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_model_tools"
ROS_BPN = "euscollada"

ROS_BUILD_DEPENDS = " \
    assimp-devel \
    cmake-modules \
    collada-dom \
    collada-parser \
    collada-urdf \
    mk \
    qhull \
    resource-retriever \
    rosboost-cfg \
    rosbuild \
    roscpp \
    rospack \
    rostest \
    tf \
    urdf \
    urdfdom \
    yaml-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    assimp-devel \
    collada-dom \
    collada-parser \
    collada-urdf \
    qhull \
    resource-retriever \
    roscpp \
    rospack \
    rostest \
    tf \
    urdf \
    urdfdom \
    yaml-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    assimp-devel \
    collada-dom \
    collada-parser \
    collada-urdf \
    qhull \
    resource-retriever \
    roscpp \
    rospack \
    rostest \
    tf \
    urdf \
    urdfdom \
    yaml-cpp \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    openhrp3 \
    pr2-description \
    roseus \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/tork-a/jsk_model_tools-release/archive/release/melodic/euscollada/0.4.3-0.tar.gz
ROS_BRANCH ?= "branch=release/melodic/euscollada"
SRC_URI = "git://github.com/tork-a/jsk_model_tools-release;${ROS_BRANCH};protocol=https"
SRCREV = "a0fd3ebce188105ed5a458dbc53c87f059164b4e"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
