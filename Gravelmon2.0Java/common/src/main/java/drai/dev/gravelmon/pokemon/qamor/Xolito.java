package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Xolito extends drai.dev.gravelmon.pokemon.Pokemon {
    public Xolito() {
        super("Xolito",
                Type.FAIRY,Type.FIRE,
                new Stats(75,
                        60,
                        50,
                        55,
                        60,
                        50),
                List.of(Ability.CUTE_CHARM), Ability.HUGE_POWER,
                8, 165,
                new Stats(1,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Certain Xolito were selectively bred specifically so they could not evolve. Despite being kept mostly as pets, most Xolito are still very feisty and continue to have a warrior's heart beat within them, they will not pass up an opportunity to battle and will valiantly protect their loved ones from even the most fiercest foes."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Xolito");

    }


}
