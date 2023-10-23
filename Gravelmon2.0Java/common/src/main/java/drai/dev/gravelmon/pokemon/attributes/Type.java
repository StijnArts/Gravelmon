package drai.dev.gravelmon.pokemon.attributes;

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
    SHADOW("shadow"),
    WIND("wind"),
    COSMIC("cosmic"),
    SOUND("sound"),
    NUCLEAR("nuclear"),
    DIGITAL("digital"),
    PLASTIC("plastic"),
    LIGHT("light"),
    SLIME("slime"),
    CRYSTAL("crytal"),
    QUESTION_MARK("questionmark");
    private String name;
    Type(String name){
        this.name = name;
    }

    public String getName() {
            return name;
    }
}
