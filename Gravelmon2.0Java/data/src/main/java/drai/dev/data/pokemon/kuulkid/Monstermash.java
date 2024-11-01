package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Monstermash extends drai.dev.data.pokemon.Pokemon {
    public Monstermash() {
        super("Monstermash",
                Type.FAIRY,Type.FIGHTING,
                new Stats(100,
                        120,
                        77,
                        67,
                        75,
                        73),
                List.of(Ability.CUTE_CHARM), Ability.INTIMIDATE,
                16, 0,
                new Stats(1,1,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 35, 56, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Monstermash");

    }


}
