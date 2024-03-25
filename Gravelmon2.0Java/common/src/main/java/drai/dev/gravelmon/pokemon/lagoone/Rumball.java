package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Rumball extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rumball() {
        super("Rumball",
                Type.BUG,
                new Stats(70,
                        82,
                        100,
                        60,
                        80,
                        72),
                List.of(Ability.BATTLE_ARMOR), Ability.STURDY,
                11, 930,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                140, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It hides inside its shell deflecting any attack from its opponents till they tire, when it notices an opening it will launch its body towards them at full speed."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rumball");

    }


}
