# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "The jsk_data package"
AUTHOR = "Ryohei Ueda <ueda@jsk.t.u-tokyo.ac.jp>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "jsk_common"
ROS_BPN = "jsk_data"

ROS_BUILD_DEPENDS = " \
    dynamic-reconfigure \
    message-generation \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_paramiko} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-click} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-gdown-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-yaml} \
    depth-image-proc \
    dynamic-reconfigure \
    image-transport \
    jsk-topic-tools \
    message-runtime \
    nodelet \
    openni-launch \
    pr2-description \
    pr2-machine \
    rosbag \
    rqt-bag \
    rviz \
    tf2-ros \
    xacro \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_paramiko} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-click} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-gdown-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-yaml} \
    depth-image-proc \
    dynamic-reconfigure \
    image-transport \
    jsk-topic-tools \
    message-runtime \
    nodelet \
    openni-launch \
    pr2-description \
    pr2-machine \
    rosbag \
    rqt-bag \
    rviz \
    tf2-ros \
    xacro \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-freezegun-pip} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-nose} \
    roslaunch \
    roslint \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/tork-a/jsk_common-release/archive/release/melodic/jsk_data/2.2.10-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "13eff7e8e39335b069254ae920bfe25c"
SRC_URI[sha256sum] = "2a23f49d88eb32f0ecc762fa43fccef0a549e2f6f68d78f54e8eaf11fd415f0b"
S = "${WORKDIR}/jsk_common-release-release-melodic-jsk_data-2.2.10-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('jsk-common', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('jsk-common', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/jsk-common_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/jsk-common-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/jsk-common/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
