package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Goopest extends drai.dev.data.pokemon.Pokemon {
    public Goopest() {
        super("Goopest",
                Type.FAIRY, Type.POISON,
                new Stats(98,
                        65,
                        101,
                        65,
                        107,
                        54),
                List.of(Ability.GOOEY,Ability.STICKY_HOLD), Ability.UNAWARE,
                16, 0,
                new Stats(0,0,0,0,2,0), 45,
                1.0,
                221, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Goopest");

    }


}
