package drai.dev.gravelmon.pokemon.nodorro;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Penumbillar extends drai.dev.gravelmon.pokemon.Pokemon {
    public Penumbillar() {
        super("Penumbillar",
                Type.BUG,
                new Stats(50,
                        40,
                        43,
                        60,
                        57,
                        50),
                List.of(Ability.SHIELD_DUST,Ability.INNER_FOCUS), Ability.SWARM,
                3, 104,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(),
                List.of("It has always been believed that this Pokemon has strong connections to the moon. As such, ancient cultures would keep and praise these Pokemon in hopes of appeasing the god of night."),
                List.of(),
                List.of(                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Penumbillar");

    }


}
