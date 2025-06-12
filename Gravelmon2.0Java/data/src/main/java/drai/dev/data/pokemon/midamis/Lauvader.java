package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Lauvader extends drai.dev.data.pokemon.Pokemon {
    public Lauvader() {
        super("Lauvader",
                Type.GRASS, Type.STEEL,
                new Stats(100,
                        70,
                        95,
                        80,
                        85,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 165,
                new Stats(3,0,0,0,0,0), 60,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFIDE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,39),
                        new MoveLearnSetEntry(Move.HEAL_BELL,44),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,49),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,54),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,59)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(36)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Lauvader");

    }


}
