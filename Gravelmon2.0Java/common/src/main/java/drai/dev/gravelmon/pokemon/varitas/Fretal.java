package drai.dev.gravelmon.pokemon.varitas;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Fretal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fretal() {
        super("Fretal",
                Type.GRASS,
                new Stats(70,
                        10,
                        40,
                        20,
                        60,
                        80),
                List.of(Ability.RATTLED,Ability.FLOWER_VEIL,Ability.RUN_AWAY), Ability.RUN_AWAY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.25,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("A forest-dwelling pokemon that for some reason searches for a flower to cover its head with. It has an extremely reclusive and meek demeanor and becomes greatly distraught if the flower is blown off of its head."),
                List.of(),
                List.of(                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fretal");

    }


}
