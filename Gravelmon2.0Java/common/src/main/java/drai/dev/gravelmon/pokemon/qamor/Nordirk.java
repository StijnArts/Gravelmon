package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Nordirk extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nordirk() {
        super("Nordirk",
                Type.ICE,
                new Stats(55,
                        45,
                        45,
                        45,
                        55,
                        45),
                List.of(Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Nordirk carve intricate tunnel systems inside of glaciers, collecting blue ice back to their dens to be crafted into weapons and armor."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DIG,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nordirk");

    }


}
