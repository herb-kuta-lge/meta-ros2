# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation

inherit ros_distro_melodic
inherit ros_superflore_generated

DESCRIPTION = "This package provides simulated tactile sensors for the Schunk Dextrous      Hand (SDH) which is mounted on the Care-O-bot arm. The node subscribes to      the Gazebo bumper topics of the SDH. It transforms the Gazebo feedback to      the &quot;tactile_data&quot; topic to provide the same tactile sensor interface as      the schunk_sdh package.       The following parameters can be set:      * cells_x: The number of patches on the tactile sensor in the direction                 perpendicular to the finger. Defaults to 6.      * cells_y: The number of patches on the tactile sensor along the direction                 of the finger. Defaults to 14.      * output_range: The maximum output value of one patch. Defaults to 3500.      * sensitivity: The change of output in one patch per Newton. Defaults to                     350. The sensitivity can be approximated by the following                     formula: S = output_range / (measurement_range * cell_area)                     - The measurement range of the tactile pads is 250 kPa (from                       the data sheet).                     - The output range can be determined by experiment from the                       real SDH. It is about 3500.                     - The cell area is the size of one patch. Length and width                       of the area are determined by dividing the length/width                       of the collision surface by the number of cells in the                       respective direction.                       Important: In most cases this is NOT the cell area that is                                  given in the data sheet!      * filter_length: The length of the moving average filter which smoothes                       the values from simulation. Defaults to 10.       The node subscribes to the following topics to receive data from the      simulation:      * thumb_2/state      * thumb_3/state      * finger_12/state      * finger_13/state      * finger_22/state      * finger_23/state       The node publishes the processed data on the following topic:      * tactile_data       The simulated bumper must obtain the collision data in the link that the      sensor is attached to. This is achieved by setting the &quot;frameName&quot; property      in the gazebo_ros_bumper controller."
AUTHOR = "Bruno Brito <bfb@ipa.fhg.de>"
ROS_AUTHOR = "Sven Schneider"
HOMEPAGE = "http://ros.org/wiki/schunk_simulated_tactile_sensors"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=48;endline=48;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "schunk_modular_robotics"
ROS_BPN = "schunk_simulated_tactile_sensors"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    gazebo-msgs \
    rospy \
    schunk-sdh \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/schunk_modular_robotics-release/archive/release/melodic/schunk_simulated_tactile_sensors/0.6.13-2.tar.gz
ROS_BRANCH ?= "branch=release/melodic/schunk_simulated_tactile_sensors"
SRC_URI = "git://github.com/ipa320/schunk_modular_robotics-release;${ROS_BRANCH};protocol=https"
SRCREV = "bf98455586d17278f15a0773d1e0ef99f21e5836"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}
