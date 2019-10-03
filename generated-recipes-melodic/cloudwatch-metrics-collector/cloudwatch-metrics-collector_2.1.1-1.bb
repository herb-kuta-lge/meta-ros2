# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_${ROS_DISTRO}
inherit ros_superflore_generated

DESCRIPTION = "Subscriber node for the aws/monitoring topic to publish metrics to AWS Cloudwatch"
AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
ROS_AUTHOR = "AWS RoboMaker <ros-contributions@amazon.com>"
HOMEPAGE = "http://wiki.ros.org/cloudwatch_metrics_collector"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cloudwatch_metrics_collector"
ROS_BPN = "cloudwatch_metrics_collector"

ROS_BUILD_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-metrics-common \
    ros-monitoring-msgs \
    roscpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-metrics-common \
    ros-monitoring-msgs \
    roscpp \
    std-msgs \
    std-srvs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    aws-common \
    aws-ros1-common \
    cloudwatch-metrics-common \
    ros-monitoring-msgs \
    roscpp \
    std-msgs \
    std-srvs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    gtest \
    rostest \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/aws-gbp/cloudwatch_metrics_collector-release/archive/release/melodic/cloudwatch_metrics_collector/2.1.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "ce7d894ff7c28356ca417b2e204b48c3"
SRC_URI[sha256sum] = "765bfbb06471515deaa6dc40b39f426ef386774cf658a7b9afe356cfa75e2ca2"
S = "${WORKDIR}/cloudwatch_metrics_collector-release-release-melodic-cloudwatch_metrics_collector-2.1.1-1"

ROS_COMPONENT_TYPE = "${@ros_distro__get_component_type('cloudwatch-metrics-collector', d)}"
ROS_BUILD_TYPE = "catkin"

# Allow the above settings to be overridden.
ROS_INCLUDES_TREE := "${@ros_superflore_generated__get_includes_tree('cloudwatch-metrics-collector', d)}"
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-metrics-collector/cloudwatch-metrics-collector_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-metrics-collector/cloudwatch-metrics-collector-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-metrics-collector/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_INCLUDES_TREE}/cloudwatch-metrics-collector/${BPN}-${PV}.inc

inherit ${ROS_COMPONENT_TYPE}_component
inherit ros_${ROS_BUILD_TYPE}
