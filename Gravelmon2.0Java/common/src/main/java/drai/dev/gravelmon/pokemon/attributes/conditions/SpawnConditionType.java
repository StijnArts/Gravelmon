package drai.dev.gravelmon.pokemon.attributes.conditions;

public enum SpawnConditionType {
    BIOMES("biomes", "biome"),
    CANSEESKY("canSeeSky","boolean"),
    MAXY("maxY","boolean"),
    MINY("minY", "boolean"),
    TIMERANGE("timeRange","timeRange"),
    IS_RAINING("isRaining", "boolean"),
    MOONPHASE("moonPhase", "moonPhase"),
    MAX_LIGHT("maxLight", "boolean"),
    IS_THUNDERING("isThundering", "boolean");

    private final String name;
    private final String valueType;

    SpawnConditionType(String name, String valueType){
        this.name = name;
        this.valueType = valueType;
    }

    public String getName() {
        return name;
    }

    public String getValueType() {
        return valueType;
    }
}
