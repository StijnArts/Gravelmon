package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flabb extends drai.dev.data.pokemon.Pokemon {
    public Flabb(String name, Aspect aspect) {
        super(name, aspect, "Flabb",
                Type.GHOST, Type.FAIRY,
                new Stats(44,
                        38,
                        39,
                        61,
                        79,
                        42),
                List.of(Ability.CURSED_BODY), Ability.MISTY_SURGE,
                1, 1,
                new Stats(0,0,0,0,1,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The light Theosian Flabébé produce from their flower grows brighter the more in-tune they are with their ghostly powers."),
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
           setLangFileName("Flabébé");

    }


}
