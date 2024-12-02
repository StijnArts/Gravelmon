package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sparkatoo extends drai.dev.data.pokemon.Pokemon {
    public Sparkatoo(Stats stats) {
        super("Sparkatoo",
                Type.PSYCHIC, Type.ELECTRIC,
                stats,
                List.of(Ability.LEVITATE,Ability.KEEN_EYE), Ability.MAGIC_BOUNCE,
                11, 0,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 13, 43, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL, Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Sparkatoo");

    }


}
