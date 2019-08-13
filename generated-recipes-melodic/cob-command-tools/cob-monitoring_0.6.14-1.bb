# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "cob_monitoring"
AUTHOR = "Felix Messmer <felixmessmer@gmail.com>"
ROS_AUTHOR = "Florian Weisshardt <fmw@ipa.fhg.de>"
HOMEPAGE = "http://ros.org/wiki/cob_monitoring"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_command_tools"
ROS_BPN = "cob_monitoring"

ROS_BUILD_DEPENDS = " \
    diagnostic-updater \
    roscpp \
    topic-tools \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    diagnostic-updater \
    roscpp \
    topic-tools \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ifstat} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ipmitool} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_ntpdate} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_paramiko} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-mechanize} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-psutil} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_python-requests} \
    ${ROS_UNRESOLVED_PLATFORM_PKG_sysstat} \
    actionlib \
    cob-light \
    cob-msgs \
    cob-script-server \
    diagnostic-msgs \
    diagnostic-updater \
    roscpp \
    rospy \
    rostopic \
    sensor-msgs \
    std-msgs \
    topic-tools \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ipa320/cob_command_tools-release/archive/release/melodic/cob_monitoring/0.6.14-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "da7b5920a17c6565869429c3738e927c"
SRC_URI[sha256sum] = "0059021c89b85f78e24d90539097f1698f41127bb413e7eb503af53a7d85d489"
S = "${WORKDIR}/cob_command_tools-release-release-melodic-cob_monitoring-0.6.14-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('cob-command-tools', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('cob-command-tools', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-command-tools/cob-command-tools_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-command-tools/cob-command-tools-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-command-tools/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cob-command-tools/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
