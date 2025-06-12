package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Lauves extends drai.dev.data.pokemon.Pokemon {
    public Lauves() {
        super("Lauves",
                Type.GRASS, Type.STEEL,
                new Stats(55,
                        40,
                        50,
                        40,
                        50,
                        30),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(1,0,0,0,0,0), 220,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("lauvered", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.CONFIDE,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,11),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,15),
                        new MoveLearnSetEntry(Move.METAL_SOUND,19),
                        new MoveLearnSetEntry(Move.UPROAR,23),
                        new MoveLearnSetEntry(Move.ROUND,27),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,31),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,35),
                        new MoveLearnSetEntry(Move.HEAL_BELL,39),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,43),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,47)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Lauves");

    }


}
