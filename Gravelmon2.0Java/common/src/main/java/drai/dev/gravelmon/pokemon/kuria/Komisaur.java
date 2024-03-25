package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Komisaur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Komisaur() {
        super("Komisaur",
                Type.ROCK,Type.COSMIC,
                new Stats(55,
                        70,
                        90,
                        30,
                        55,
                        33),
                List.of(Ability.SOLID_ROCK,Ability.ENTERSPHERE), Ability.STURDY,
                7, 536,
                new Stats(0,0,1,0,0,0), 45,
                0.875,
                88, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Komisaur");

    }


}
