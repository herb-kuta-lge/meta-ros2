# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Precisely stamped URG driver for ROS"
AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
ROS_AUTHOR = "Atsushi Watanabe <atsushi.w@ieee.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "urg_stamped"
ROS_BPN = "urg_stamped"

ROS_BUILD_DEPENDS = " \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    roscpp \
    sensor-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    roscpp \
    sensor-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    roslint \
    rostest \
    rosunit \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/seqsense/urg_stamped-release/archive/release/melodic/urg_stamped/0.0.3-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "aa0ae43a5c0f11df9c1ccd991ee1a619"
SRC_URI[sha256sum] = "39b46f6c170dee6ab94eca3fec1a364123d3efb290c5790219ca820ddccff739"
S = "${WORKDIR}/urg_stamped-release-release-melodic-urg_stamped-0.0.3-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('urg-stamped', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('urg-stamped', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/urg-stamped/urg-stamped_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/urg-stamped/urg-stamped-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/urg-stamped/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/urg-stamped/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
