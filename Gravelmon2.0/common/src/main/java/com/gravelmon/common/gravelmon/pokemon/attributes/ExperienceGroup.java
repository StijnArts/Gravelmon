package com.gravelmon.common.gravelmon.pokemon.attributes;

public enum ExperienceGroup {
    ERRATIC("erratic"),
    FAST("fast"),
    MEDIUM_FAST("medium_fast"),
    MEDIUM_SLOW("medium_slow"),
    SLOW("slow"),
    FLUCTUATING("fluctuating");
    private String name;
    ExperienceGroup(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
