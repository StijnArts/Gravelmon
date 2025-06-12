package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Lauvered extends drai.dev.data.pokemon.Pokemon {
    public Lauvered() {
        super("Lauvered",
                Type.GRASS, Type.STEEL,
                new Stats(80,
                        60,
                        75,
                        60,
                        75,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(2,0,0,0,0,0),160,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("lauvader", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.CONFIDE,1),
                        new MoveLearnSetEntry(Move.METAL_SOUND,21),
                        new MoveLearnSetEntry(Move.UPROAR,25),
                        new MoveLearnSetEntry(Move.ROUND,29),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,33),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,37),
                        new MoveLearnSetEntry(Move.HEAL_BELL,41),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,45),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,49),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,53)                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(19)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Lauvered");

    }


}
