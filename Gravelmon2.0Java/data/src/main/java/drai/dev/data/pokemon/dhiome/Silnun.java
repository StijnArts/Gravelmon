package drai.dev.data.pokemon.dhiome;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Silnun extends drai.dev.data.pokemon.Pokemon {
    public Silnun() {
        super("Silnun",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.HEALER), Ability.NATURAL_CURE,
                6, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its fur is extremely soft and velvety. Its comforting touch is said to ease pain and suffering in others."),
                List.of(new EvolutionEntry("amivelv", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"220")))),
                List.of(        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.ROUND,3),
                        new MoveLearnSetEntry(Move.PLAY_NICE,7),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,11),
                        new MoveLearnSetEntry(Move.CAPTIVATE,14),
                        new MoveLearnSetEntry(Move.COTTON_SPORE,16),
                        new MoveLearnSetEntry(Move.SNORE,20),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,25),
                        new MoveLearnSetEntry(Move.REST,29),
                        new MoveLearnSetEntry(Move.HEAL_BELL,32),
                        new MoveLearnSetEntry(Move.COTTON_GUARD,37),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,40),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,44),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,49)                ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 3, 26, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Silnun");

    }


}
