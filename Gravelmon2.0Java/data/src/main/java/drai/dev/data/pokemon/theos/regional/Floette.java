package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Floette extends drai.dev.data.pokemon.Pokemon {
    public Floette(String name, Aspect aspect) {
        super(name, aspect, "Floette",
                Type.GHOST, Type.FAIRY,
                new Stats(54,
                        45,
                        47,
                        75,
                        98,
                        52),
                List.of(Ability.CURSED_BODY), Ability.MISTY_SURGE,
                2, 9,
                new Stats(0,0,0,0,2,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legend has it, Theosian Floette help lost souls find their way to the afterlife using their lanturn-like flower."),
                List.of(),
                List.of(                        ),
                List.of(Label.THEOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Floette");

    }


}
