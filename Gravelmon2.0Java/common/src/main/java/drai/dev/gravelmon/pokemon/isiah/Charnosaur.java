package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Charnosaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Charnosaur() {
        super("Charnosaur",
                Type.ROCK, Type.FIRE,
                new Stats(60,
                        110,
                        77,
                        106,
                        72,
                        96),
                List.of(Ability.BATTLE_ARMOR), Ability.WHITE_SMOKE,
                8, 165,
                new Stats(0,2,0,1,0,0), 45,
                0.875,
                182, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Charnosaur's smoke is as hot as fire itself. It can spew red-hot magma from its maw for self-defense."),
                List.of(),
                List.of(                        ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Charnosaur");

    }


}
