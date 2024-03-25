package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pillunge extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pillunge() {
        super("Pillunge",
                Type.BUG,
                new Stats(40,
                        50,
                        65,
                        32,
                        50,
                        43),
                List.of(Ability.BATTLE_ARMOR), Ability.SWARM,
                5, 86,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                50, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It moves by curling itself in a ball and rolling, various paths can be found in the forest carved by several Pillunge rolling over time"),
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
           setLangFileName("Pillunge");

    }


}
