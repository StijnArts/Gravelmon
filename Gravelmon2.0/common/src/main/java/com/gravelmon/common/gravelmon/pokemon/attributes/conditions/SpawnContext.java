package com.gravelmon.common.gravelmon.pokemon.attributes.conditions;

public enum SpawnContext {
    GROUNDED("grounded"),
    SEAFLOOR("seafloor"),
    SUBMERGED("submerged"),
    SURFACE("surface");
    private String name;
    SpawnContext(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }


}
