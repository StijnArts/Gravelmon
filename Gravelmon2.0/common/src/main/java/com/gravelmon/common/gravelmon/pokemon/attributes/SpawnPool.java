package com.gravelmon.common.gravelmon.pokemon.attributes;

public enum SpawnPool {
    COMMON("common"),
    RARE("rare"),
    ULTRA_RARE("ultra-rare"),
    UNCOMMON("uncommon");
    SpawnPool(String name){
        this.name = name;
    }
    private String name;

    public String getName() {
        return name;
    }
}
