package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Castide extends drai.dev.gravelmon.pokemon.Pokemon {
    public Castide() {
        super("Castide",
                Type.WATER,
                new Stats(42,
                        42,
                        30,
                        50,
                        30,
                        46),
                List.of(Ability.MARVEL_SCALE,Ability.RIVALRY,Ability.WATER_VEIL), Ability.WATER_VEIL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("Castide are sociable Pokemon that travel in large schools with other Castide and miscellaneous fish Pokemon. They are popular Pokemon to keep as pets considering they're cute demeanor, friendly nature, and colorfull patterns."),
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
           setLangFileName("Castide");

    }


}
