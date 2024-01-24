package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Moleheimer extends drai.dev.gravelmon.pokemon.Pokemon {
    public Moleheimer() {
        super("Moleheimer",
                Type.GROUND,Type.PSYCHIC,
                new Stats(83,
                        92,
                        80,
                        82,
                        88,
                        60),
                List.of(Ability.ARENA_TRAP,Ability.SAND_RUSH,Ability.SECRETINSIGHT), Ability.SECRETINSIGHT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Moleheimer is the greatest navigator in all of Norheim. Its swirl like scars are the remains of countless battles with Beatroot."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXTRASENSORY,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Moleheimer");

    }


}
