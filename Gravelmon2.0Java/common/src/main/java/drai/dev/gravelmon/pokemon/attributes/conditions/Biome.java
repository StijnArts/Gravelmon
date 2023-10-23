package drai.dev.gravelmon.pokemon.attributes.conditions;

public enum Biome {
    IS_ABYSS("cobblemon","is_abyss"),
    IS_ARID("cobblemon","is_arid"),
    IS_AUTUMN("cobblemon","is_autumn"),
    IS_BADLANDS("cobblemon","is_badlands"),
    IS_BAMBOO("cobblemon","is_bamboo"),
    IS_CAVE("cobblemon","is_cave"),
    IS_COAST("cobblemon","is_coast"),
    IS_COLD("cobblemon","is_cold"),
    IS_DEEP("cobblemon","is_deep"),
    IS_DESERT("cobblemon","is_desert"),
    IS_DRIPSTONE("cobblemon","is_dripstone"),
    IS_FLORAL("cobblemon","is_floral"),
    IS_FOREST("cobblemon","is_forest"),
    IS_FREEZING("cobblemon","is_freezing"),
    IS_FRESHWATER("cobblemon","is_freshwater"),
    IS_FRIGID("cobblemon","is_frigid"),
    IS_FROZEN("cobblemon","is_frozen"),
    IS_GLACIAL("cobblemon","is_glacial"),
    IS_GRASSLAND("cobblemon","is_grassland"),
    IS_HIGHLANDS("cobblemon","is_highlands"),
    IS_HILLS("cobblemon","is_hills"),
    IS_ISLAND("cobblemon","is_island"),
    IS_JUNGLE("cobblemon","is_jungle"),
    IS_LUKEWARM("cobblemon","is_lukewarm"),
    IS_LUSH("cobblemon","is_lush"),
    IS_MAGICAL("cobblemon","is_magical"),
    IS_MOUNTAIN("cobblemon","is_mountain"),
    IS_MUSHROOM("cobblemon","is_mushroom"),
    IS_OVERWORLD("cobblemon","is_overworld"),
    IS_PEAK("cobblemon","is_peak"),
    IS_PLAINS("cobblemon","is_plains"),
    IS_PLATEAU("cobblemon","is_plateau"),
    IS_REEF("cobblemon","is_reef"),
    IS_RIVER("cobblemon","is_river"),
    IS_SANDY("cobblemon","is_sandy"),
    IS_SAVANNA("cobblemon","is_savanna"),
    IS_SKY("cobblemon","is_sky"),
    IS_SNOWY("cobblemon","is_snowy"),
    IS_SPOOKY("cobblemon","is_spooky"),
    IS_SPRING("cobblemon","is_spring"),
    IS_SUMMER("cobblemon","is_summer"),
    IS_SWAMP("cobblemon","is_swamp"),
    IS_TAIGA("cobblemon","is_taiga"),
    IS_TEMPERATE("cobblemon","is_temperate"),
    IS_THERMAL("cobblemon","is_thermal"),
    IS_TUNDRA("cobblemon","is_tundra"),
    IS_OCEAN("minecraft","is_ocean"),
    IS_DEEP_OCEAN("minecraft","is_deep_ocean"),
    IS_NETHER("minecraft","is_nether"),
    IS_END("minecraft","is_end");
    private String id;
    private String name;
    Biome(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
