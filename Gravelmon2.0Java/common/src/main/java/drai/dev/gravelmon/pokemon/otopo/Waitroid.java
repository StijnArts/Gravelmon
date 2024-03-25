package drai.dev.gravelmon.pokemon.otopo;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Waitroid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Waitroid() {
        super("Waitroid",
                Type.STEEL,Type.ELECTRIC,
                new Stats(60,
                        40,
                        90,
                        120,
                        90,
                        65),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 50,
                new Stats(0,0,0,2,0,0), 30,
                0.5,
                230, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("After several years with its trainer, Robutler evolves into Waitroid. Waitroid is capable of combat as well as chores, and can quickly overwhelm other Pokemon."),
                List.of(),
                List.of(                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Waitroid");

    }


}
