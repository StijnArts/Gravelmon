package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Tapiruin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tapiruin() {
        super("Tapiruin",
                Type.ROCK,
                new Stats(73,
                        90,
                        115,
                        80,
                        42,
                        82),
                List.of(Ability.SAP_SIPPER), Ability.ANALYTIC,
                13, 850,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                144, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Mysterious Pokémon with rock hard skin, that used to be very common but became a rarer sight over the years. It seems like they are quickly adapting to live in subterrain areas."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tapiruin");

    }


}
