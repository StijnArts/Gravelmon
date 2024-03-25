package drai.dev.gravelmon.pokemon.mushi;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Glastasma extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glastasma() {
        super("Glastasma",
                Type.GHOST,Type.ICE,
                new Stats(54,
                        45,
                        75,
                        103,
                        137,
                        36),
                List.of(Ability.CURSED_BODY,Ability.INTIMIDATE), Ability.SNOW_WARNING,
                0, 0,
                new Stats(0,0,0,0,2,0), 75,
                0.5,
                159, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MUSHI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glastasma");

    }


}
