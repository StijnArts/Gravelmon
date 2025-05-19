package drai.dev.data.pokemon.mystis.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MystisanGrimmsnarl extends drai.dev.data.pokemon.Pokemon {
    public MystisanGrimmsnarl(String name, Aspect aspect) {
        super(name, aspect, "MystisanGrimmsnarl",
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
                List.of(
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,1),
                        new MoveLearnSetEntry(Move.GOLD_BREAKER,1)),
                List.of(Label.MYSTIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Grimmsnarl");

    }


}
