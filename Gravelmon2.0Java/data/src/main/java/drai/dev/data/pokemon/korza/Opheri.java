package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Opheri extends drai.dev.data.pokemon.Pokemon {
    public Opheri() {
        super("Opheri",
                Type.GRASS,Type.POISON,
                new Stats(66,
                        42,
                        55,
                        52,
                        46,
                        64),
                List.of(Ability.HARVEST), Ability.HARVEST,
                8, 67,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                65, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("The berry on Opheri's tail is made to look like a Cheri berry. If eaten, it causes paralysis instead of healing. When taken, the tail bulb will quickly regrow."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Opheri");

    }


}
