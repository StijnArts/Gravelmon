package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wormor extends drai.dev.data.pokemon.Pokemon {
    public Wormor() {
        super("Wormor",
                Type.BUG, Type.ROCK,
                new Stats(80,
                        70,
                        100,
                        35,
                        65,
                        50),
                List.of(Ability.ROCK_HEAD), Ability.TRAMPLE,
                17, 1397,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                180, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Skitter SmackSTAB Bug"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SKITTER_SMACK,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wormor");

    }


}
