package drai.dev.data.pokemon.soulstones.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class EpochSewaddle extends drai.dev.data.pokemon.Pokemon {
    public EpochSewaddle(String name, Aspect aspect) {
        super(name, aspect, "EpochSewaddle",
                Type.STEEL,Type.DARK,
                new Stats(45,
                        53,
                        42,
                        70,
                        40,
                        60),
                List.of(Ability.RUN_AWAY), null,
                3, 25,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It observes from a distance and studies its foes. When it is ready, it will adapt and change its form to perfectly replicate its enemy."),
                List.of(new EvolutionEntry("epoch swadloon", EvolutionType.LEVEL_UP, List.of(), 
 List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.TRANSFORM,1),
                        new MoveLearnSetEntry(Move.SIPHON,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIND_READER,"egg"),
                        new MoveLearnSetEntry(Move.PSYCHIC_TERRAIN,"egg"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"egg"),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,"egg")                        ),
                List.of(Label.SOULSTONES),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 7, 21, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_DARK))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sewaddle");

    }


}
