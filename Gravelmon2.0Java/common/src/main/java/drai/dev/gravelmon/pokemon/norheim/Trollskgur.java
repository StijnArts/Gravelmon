package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Trollskgur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Trollskgur() {
        super("Trollskgur",
                Type.FAIRY,Type.GRASS,
                new Stats(120,
                        80,
                        70,
                        90,
                        109,
                        61),
                List.of(Ability.COLOR_CHANGE,Ability.ADAPTABILITY,Ability.PROTEAN), Ability.PROTEAN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Trollskógur rules the forests of Migard. They can change their appearance into humans and are extremely greedy."),
                List.of(),
                List.of(                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Trollskógur");

    }


}
