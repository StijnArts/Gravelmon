package drai.dev.gravelmon.pokemon.attributes.conditions;

public enum Biome {
    IS_DEEP_DARK("#cobblemon","is_deep_dark"),
    IS_ARID("#cobblemon","is_arid"),
    IS_AUTUMN("#cobblemon","is_autumn"),
    IS_BADLANDS("#cobblemon","is_badlands"),
    IS_BAMBOO("#cobblemon","is_bamboo"),
    IS_BEACH("#cobblemon", "is_beach"),
    IS_CAVE("#cobblemon","is_cave"),
    IS_COAST("#cobblemon","is_coast"),
    IS_COLD("#cobblemon","is_cold"),
    IS_COLD_OCEAN("#cobblemon", "is_cold_ocean"),
    IS_DESERT("#cobblemon","is_desert"),
    IS_DRIPSTONE("#cobblemon","is_dripstone"),
    IS_DENSE("#cobblemon","is_dense"),
    IS_DEEP_OCEAN("#minecraft","is_deep_ocean"),
    IS_END("#minecraft","is_end"),
    IS_FLORAL("#cobblemon","is_floral"),
    IS_FOREST("#cobblemon","is_forest"),
    IS_FREEZING("#cobblemon","is_freezing"),
    IS_FRESHWATER("#cobblemon","is_freshwater"),
    IS_FRIGID("#cobblemon","is_frigid"),
    IS_FROZEN_OCEAN("#cobblemon","is_frozen"),
    IS_GLACIAL("#cobblemon","is_glacial"),
    IS_GRASSLAND("#cobblemon","is_grassland"),
    IS_HIGHLANDS("#cobblemon","is_highlands"),
    IS_HILLS("#cobblemon","is_hills"),
    IS_ISLAND("#cobblemon","is_island"),
    IS_JUNGLE("#cobblemon","is_jungle"),
    IS_LUKEWARM_OCEAN("#cobblemon","is_lukewarm_ocean"),
    IS_LUSH("#cobblemon","is_lush"),
    IS_MAGICAL("#cobblemon","is_magical"),
    IS_MOUNTAIN("#cobblemon","is_mountain"),
    IS_MUSHROOM("#cobblemon","is_mushroom"),
    IS_NETHER("#minecraft","is_nether"),
    IS_NETHER_BASALT("#cobblemon","is_nether_basalt"),
    IS_NETHER_CRIMSON("#cobblemon","is_nether_crimson"),
    IS_NETHER_DESERT("#cobblemon","is_nether_desert"),
    IS_NETHER_FOREST("#cobblemon","is_nether_forest"),
    IS_NETHER_FROZEN("#cobblemon","is_nether_frozen"),
    IS_NETHER_FUNGUS("#cobblemon","is_nether_fungus"),
    IS_NETHER_MOUNTAIN("#cobblemon","is_nether_mountain"),
    IS_NETHER_OVERGROWTH("#cobblemon","is_nether_overgrowth"),
    IS_NETHER_QUARTZ("#cobblemon","is_nether_quartz"),
    IS_NETHER_SOUL_FIRE("#cobblemon","is_nether_soul_fire"),
    IS_NETHER_SOUL_SAND("#cobblemon","is_nether_soul_sand"),
    IS_NETHER_TOXIC("#cobblemon","is_nether_toxic"),
    IS_NETHER_WARPED("#cobblemon","is_nether_warped"),
    IS_NETHER_WASTELAND("#cobblemon","is_nether_wasteland"),
    IS_OCEAN("#minecraft","is_ocean"),
    IS_OVERWORLD("#cobblemon","is_overworld"),
    IS_PEAK("#cobblemon","is_peak"),
    IS_PLAINS("#cobblemon","is_plains"),
    IS_PLATEAU("#cobblemon","is_plateau"),
    IS_REEF("#cobblemon","is_reef"),
    IS_RIVER("#cobblemon","is_river"),
    IS_SANDY("#cobblemon","is_sandy"),
    IS_SAVANNA("#cobblemon","is_savanna"),
    IS_SKY("#cobblemon","is_sky"),
    IS_SNOWY("#cobblemon","is_snowy"),
    IS_SNOWY_FOREST("#cobblemon","is_snowy_forest"),
    IS_SPOOKY("#cobblemon","is_spooky"),
    IS_SALT("#cobblemon", "is_salt"),
    IS_SPARSE("#cobblemon", "is_sparse"),
    IS_SPRING("#cobblemon","is_spring"),
    IS_SUMMER("#cobblemon","is_summer"),
    IS_SWAMP("#cobblemon","is_swamp"),
    IS_TAIGA("#cobblemon","is_taiga"),
    IS_TEMPERATE("#cobblemon","is_temperate"),
    IS_THERMAL("#cobblemon","is_thermal"),
    IS_TROPICAL("#cobblemon","is_tropical"),
    IS_TROPICAL_ISLAND("#cobblemon","is_tropical_island"),
    IS_TUNDRA("#cobblemon","is_tundra"),
    IS_VOLCANIC("#cobblemon","is_volvanic"),
    IS_WARM_OCEAN("#cobblemon","is_warm_ocean"),
    IS_OLD_GROWTH_TAIGA("#cobblemon","is_old_growth_taiga"),
    IS_WINTER("#cobblemon","is_winter"), IS_CHERRY_GROVE("minecraft", "cherry_grove");
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
