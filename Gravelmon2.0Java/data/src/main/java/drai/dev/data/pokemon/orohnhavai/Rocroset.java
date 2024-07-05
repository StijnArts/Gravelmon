package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Rocroset extends drai.dev.data.pokemon.Pokemon {
    public Rocroset() {
        super("Rocroset",
                Type.ROCK, Type.GRASS,
                new Stats(95,
                        75,
                        78,
                        65,
                        75,
                        30),
                List.of(Ability.LEAF_GUARD,Ability.FLOWER_VEIL,Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                12, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their weakest spot is their head, which is protected by their petals. They lay on their backs and disguise themselves as a plant. They attack their enemies with their sharp spikes. Inside them, their bodies are slowly growing."),
                List.of(new EvolutionEntry("granderosa", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,6),
                        new MoveLearnSetEntry(Move.ALLERGYPOLLEN,9),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,12),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,16),
                        new MoveLearnSetEntry(Move.SYNTHESIS,19),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,22),
                        new MoveLearnSetEntry(Move.GROWTH,26),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,31),
                        new MoveLearnSetEntry(Move.FLATTER,35),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,38),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,43),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,47),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,51),
                        new MoveLearnSetEntry(Move.SNATCH,55),
                        new MoveLearnSetEntry(Move.POWER_WHIP,60)
                ),
                List.of(Label.OROHNHAVAI
                ),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 43, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rocroset");

    }


}
