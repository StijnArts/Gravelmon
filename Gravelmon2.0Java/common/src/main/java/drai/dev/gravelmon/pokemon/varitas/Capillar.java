package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Capillar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Capillar() {
        super("Capillar",
                Type.BUG,
                new Stats(50,
                        20,
                        40,
                        35,
                        50,
                        25),
                List.of(Ability.SWARM), Ability.SWARM,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Despite their small size, Capillar have a very tough attitude and will rear up and puff out their antenna when threatened. Ancient civilizations once held festivals to honor their bravery and ornate bodies."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1),
                        new MoveLearnSetEntry(Move.HEADBUTT,9)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Capillar");

    }


}
