package drai.dev.data.pokemon.mystis.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MystisianGrimmsnarl extends drai.dev.data.pokemon.Pokemon {
    public MystisianGrimmsnarl(String name, Aspect aspect) {
        super(name, aspect, "Grimmsnarl",
                Type.FIRE,Type.STEEL,
                new Stats(95,
                        120,
                        110,
                        80,
                        85,
                        20),
                List.of(Ability.BATTLE_ARMOR), Ability.GOLDRUSH,
                15, 5466,
                new Stats(0,0,0,0,0,0), 45,
                0.75,
                255, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("- Gold BreakerSTAB Steel - Spirit Break Fairy"),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(42).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOLCANIC, Biome.IS_NETHER_BASALT)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Grimmsnarl");

    }


}
