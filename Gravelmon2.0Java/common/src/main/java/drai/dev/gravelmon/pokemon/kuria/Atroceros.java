package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Atroceros extends drai.dev.gravelmon.pokemon.Pokemon {
    public Atroceros() {
        super("Atroceros",
                Type.GROUND,Type.BUG,
                new Stats(120,
                        150,
                        120,
                        50,
                        50,
                        50),
                List.of(Ability.BATTLE_ARMOR,Ability.ROCK_HEAD), Ability.GUTS,
                17, 2148,
                new Stats(1,1,0,0,0,0), 45,
                0.5,
                210, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.BUG),
                List.of("Eating lots of minerals has caused Atroceros's skin to harden almost as hard as its shell. It can withstand powerful physical attacks and retaliate twice as hard."),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Atroceros");

    }


}
