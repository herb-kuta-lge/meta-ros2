# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "This library provides lean and mean error mechanisms.      It includes c style error functions as well as a few      useful macros. For higher level mechanisms,      refer to ecl_exceptions."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
ROS_AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_errors"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=13;endline=13;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "ecl_lite"
ROS_BPN = "ecl_errors"

ROS_BUILD_DEPENDS = " \
    ecl-config \
    ecl-license \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    ecl-config \
    ecl-license \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ecl-config \
    ecl-license \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_lite-release/archive/release/melodic/ecl_errors/0.61.6-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "a1a454bd9b467455abc9449714ef62d4"
SRC_URI[sha256sum] = "e41cdee101ab35c2963fc8e080294f597646006e246cae31242898b1b69e4eb9"
S = "${WORKDIR}/ecl_lite-release-release-melodic-ecl_errors-0.61.6-0"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('ecl-lite', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('ecl-lite', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-lite/ecl-lite_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-lite/ecl-lite-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-lite/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/ecl-lite/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
