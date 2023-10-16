package com.gravelmon.common.gravelmon.pokemon.attributes;

import java.util.*;

public enum Type {
    NORMAL("normal"),
    FIRE("fire"),
    FIGHTING("fighting"),
    WATER("water"),
    FLYING("flying"),
    GRASS("grass"),
    POISON("poison"),
    ELECTRIC("electric"),
    GROUND("ground"),
    PSYCHIC("psychic"),
    ROCK("rock"),
    ICE("ice"),
    BUG("bug"),
    DRAGON("dragon"),
    GHOST("ghost"),
    DARK("dark"),
    STEEL("steel"),
    FAIRY("fairy"),
    SOUND("sound");
    private String name;
    Type(String name){
        this.name = name;
    }

    public String getName() {
        if(name.equals("sound")){
            return "normal";
        } else {
            return name;
        }

    }
}
