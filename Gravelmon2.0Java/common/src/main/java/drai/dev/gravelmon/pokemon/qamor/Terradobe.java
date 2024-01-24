package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Terradobe extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terradobe() {
        super("Terradobe",
                Type.GROUND,Type.GRASS,
                new Stats(88,
                        68,
                        120,
                        76,
                        88,
                        75),
                List.of(Ability.STORM_DRAIN), Ability.HEATPROOF,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Terradobe carry complete ecosystems on their back, many different types poke Pokemon will often use it as shelter. Terradobe are considered protective spirits of Qamoran ruins."),
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
           setLangFileName("Terradobe");

    }


}
