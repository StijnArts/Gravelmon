package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Folicero extends drai.dev.data.pokemon.Pokemon {
    public Folicero() {
        super("Folicero",
                Type.GRASS,
                new Stats(68,
                        53,
                        60,
                        40,
                        60,
                        39),
                List.of(Ability.OVERGROW), Ability.GRASS_PELT,
                7, 165,
                new Stats(0,0,1,0,0,0), 45,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("The playful Folicero is more than often unnaware of its size and ends up scaring smaller creatures. When the wind blows through its wooden horn it produces a calming sound."),
                List.of(new EvolutionEntry("verblunt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))
                ),
                List.of(     new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.CURSE,17),
                        new MoveLearnSetEntry(Move.BITE,22),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,27),
                        new MoveLearnSetEntry(Move.LEECH_SEED,32),
                        new MoveLearnSetEntry(Move.SYNTHESIS,37),
                        new MoveLearnSetEntry(Move.CRUNCH,42),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,47),
                        new MoveLearnSetEntry(Move.LEAF_STORM,52)),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 32, 6.0, List.of(

                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Folicero");

    }


}
