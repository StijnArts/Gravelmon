package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Woopillar extends drai.dev.data.pokemon.Pokemon {
    public Woopillar() {
        super("Woopillar",
                Type.BUG,Type.POISON,
                new Stats(40,
                        45,
                        28,
                        24,
                        28,
                        35),
                List.of(Ability.SHIELD_DUST), Ability.LEAF_GUARD,
                3, 23,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                40, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("An old wives' tale claims that the length of a Woopillar's orange stripe predicts the next winter's severity. Its body freezes solid during the winter months and thaws in the spring."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,15),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"tm")                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Woopillar");

    }


}