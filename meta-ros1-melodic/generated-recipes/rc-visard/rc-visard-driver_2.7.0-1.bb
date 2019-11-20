# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "The rc_visard_driver provides data from a Roboception rc_visard 3D sensor on several ROS topics."
AUTHOR = "Felix Ruess <felix.ruess@roboception.de>"
ROS_AUTHOR = "Heiko Hirschmueller <heiko.hirschmueller@roboception.de>"
HOMEPAGE = "http://wiki.ros.org/rc_visard_driver"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_CN = "rc_visard"
ROS_BPN = "rc_visard_driver"

ROS_BUILD_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    message-generation \
    nav-msgs \
    nodelet \
    protobuf \
    rc-common-msgs \
    rc-dynamics-api \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    stereo-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    nav-msgs \
    nodelet \
    rc-common-msgs \
    rc-dynamics-api \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    stereo-msgs \
    tf \
    visualization-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    ${ROS_UNRESOLVED_PLATFORM_PKG_protobuf} \
    curl \
    diagnostic-updater \
    dynamic-reconfigure \
    geometry-msgs \
    image-transport \
    message-runtime \
    nav-msgs \
    nodelet \
    rc-common-msgs \
    rc-dynamics-api \
    rc-genicam-api \
    roscpp \
    sensor-msgs \
    stereo-msgs \
    tf \
    visualization-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/roboception-gbp/rc_visard-release/archive/release/melodic/rc_visard_driver/2.7.0-1.tar.gz
ROS_BRANCH ?= "branch=release/melodic/rc_visard_driver"
SRC_URI = "git://github.com/roboception-gbp/rc_visard-release;${ROS_BRANCH};protocol=https"
SRCREV = "a126bb2681d2cc98216979764768920aba0a7254"
S = "${WORKDIR}/git"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('rc-visard', d)}"
ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
