package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Florges extends drai.dev.data.pokemon.Pokemon {
    public Florges(String name, Aspect aspect) {
        super(name, aspect, "Florges",
                Type.GHOST, Type.FAIRY,
                new Stats(78,
                        65,
                        68,
                        112,
                        154,
                        75),
                List.of(Ability.CURSED_BODY), Ability.MISTY_SURGE,
                11, 100,
                new Stats(0,0,0,0,3,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Florges are very malicious, feeding on the souls of fellow Pokémon while they rest."),
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
           setLangFileName("Florges");

    }


}
