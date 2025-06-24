package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Humoth extends drai.dev.data.pokemon.Pokemon {
    public Humoth() {
        super("Humoth",
                Type.BUG, Type.FAIRY,
                new Stats(60,
                        55,
                        80,
                        90,
                        80,
                        100),
                List.of(Ability.HONEY_GATHER,Ability.SHIELD_DUST), Ability.INFILTRATOR,
                7, 60,
                new Stats(0,0,0,0,0,2), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FLORAL).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Humoth");

    }


}
