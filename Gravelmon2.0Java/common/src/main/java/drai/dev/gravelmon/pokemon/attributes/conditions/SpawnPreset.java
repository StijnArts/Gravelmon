package drai.dev.gravelmon.pokemon.attributes.conditions;

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
    HONEY_TREE("honey_tree"),
    MANSION("mansion"),
    MINESHAFT("mineshaft"),
    NEAR_BERRY_BUSH("near_berry_bush"),
    NEAR_WATER("near_water"),
    OCEAN_MONUMENT("ocean_monument"),
    SPIDERWEBS("spiderwebs"),
    AMETHYST_GEODE("amethyst_geode"),
    WATER_SURFACE("water_surface"),
    DESERT_TEMPLE("desert_temple"),
    NEAR_LAVA("near_lava"),
    NEAR_CAMPFIRE("near_campfire"),
    NEAR_CROPS("near_crops"),
    NEAR_MAGMA("near_magma"),
    NEAR_SHIP_WRECK("near_ship_wreck");
    SpawnPreset(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
