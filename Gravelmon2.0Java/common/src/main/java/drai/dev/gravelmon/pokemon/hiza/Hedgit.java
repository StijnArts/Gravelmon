package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Hedgit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Hedgit() {
        super("Hedgit",
                Type.GRASS,Type.STEEL,
                new Stats(30,
                        70,
                        80,
                        30,
                        45,
                        45),
                List.of(Ability.HYPER_CUTTER), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                56, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("It loves trimming with its precise shear-like claw. This Pokemon is quite popular between gardeners and even hairdressers."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hedgit");

    }


}
