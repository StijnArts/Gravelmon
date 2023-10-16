package com.gravelmon.common.gravelmon.pokemon.attributes;

public enum EggGroup {
    MONSTER("monster",true),
    HUMAN_LIKE("human_like",true),
    WATER_1("water_1",true),
    WATER_3("water_3",true),
    BUG("bug",true),
    FLYING("flying",true),
    FIELD("field",true),
    FAIRY("fairy",true),
    GRASS("grass",true),
    MINERAL("mineral",true),
    AMORPHOUS("amorphous",true),
    WATER_2("water_2",true),
    DITTO("ditto",true),
    DRAGON("dragon",true),
    UNDISCOVERED("undiscovered",true),
    DELTA("delta", false),
    DELTA_DITTO("delta_ditto", false),
    XENO("xeno", false), DITTO_X("ditto_x", false);
    private String name;
    private boolean isImplemented;
    EggGroup(String name, Boolean isImplemented){
        this.name = name;
        this.isImplemented = isImplemented;
    }

    public String getName() {
        return name;
    }

    public boolean isImplemented() {
        return isImplemented;
    }
}
