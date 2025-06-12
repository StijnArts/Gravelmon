package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vaxxine extends drai.dev.data.pokemon.Pokemon {
    public Vaxxine(Stats stats) {
        super("Vaxxine",
                Type.POISON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Many Pokemon produce a variety of toxic chemicals for defense and offence, which poses one of the larger threats to trainers and their companions. Even Pokemon not classified as Poison element can surprise you with hazardous secretions. Luckily, modern medicine has developed a number of widely-available and broad-spectrum products that even a 10 year old can apply when need be. With the exception of natural remedies, most commercial status-alleviating products are manufactured in labs and derive"),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 45, 1.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vaxxine");

    }


}
