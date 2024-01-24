package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tourtell extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tourtell() {
        super("Tourtell",
                Type.GRASS,Type.GROUND,
                new Stats(120,
                        70,
                        110,
                        70,
                        90,
                        25),
                List.of(Ability.WATER_ABSORB,Ability.DAMP,Ability.SAP_SIPPER), Ability.SAP_SIPPER,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tourtell has a peaceful and relaxed nature. Pokémon usually gather on their back to travel across lakes and ponds. History is written on their sturdy bodies."),
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
           setLangFileName("Tourtell");

    }


}
