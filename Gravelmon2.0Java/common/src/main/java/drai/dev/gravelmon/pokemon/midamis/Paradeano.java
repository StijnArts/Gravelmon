package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Paradeano extends drai.dev.gravelmon.pokemon.Pokemon {
    public Paradeano() {
        super("Paradeano",
                Type.GRASS,Type.ELECTRIC,
                new Stats(110,
                        85,
                        70,
                        115,
                        85,
                        70),
                List.of(Ability.ELECTRIC_SURGE), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Paradeano's bulbs are full of pure energy, capable of powering cities when given proper care. When angered, they're known to burst in chaotic displays of electrical bolts."),
                List.of(),
                List.of(                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Paradeano");

    }


}
