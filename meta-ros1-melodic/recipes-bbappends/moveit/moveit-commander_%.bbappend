# Copyright (c) 2019 LG Electronics, Inc.

# Depends on moveit-ros-planning-interface->moveit-ros-planning->moveit-ros-perception->mesa with this restriction:
inherit features_check
ANY_OF_DISTRO_FEATURES = "opengl vulkan"
