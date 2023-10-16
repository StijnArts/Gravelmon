package com.gravelmon.common.gravelmon.pokemon.attributes.conditions;

public enum SpawnPreset {
    DERELICT("derelict"),
    FOLIAGE("foliage"),
    FRESHWATER("freshwater"),
    LAVA_SURFACE("lava_surface"),
    NATURAL("natural"),
    REDSTONE("redstone"),
    RIVER("river"),
    RUINED_STRUCTURES("ruined_structures"),
    TREE_TOP("treetop"),
    UNDERGROUND("underground"),
    UNDERLAVA("underlava"),
    UNDERWATER("underwater"),
    URBAN("urban"),
    WATER_SURFACE("water_surface");
    SpawnPreset(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
