package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Visacoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Visacoon() {
        super("Visacoon",
                Type.BUG,Type.DRAGON,
                new Stats(52,
                        75,
                        106,
                        70,
                        86,
                        31),
                List.of(Ability.INTIMIDATE,Ability.OVERCOAT), Ability.WEAK_ARMOR,
                11, 547,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                147, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It uses the same scare trick as Wurmidrake to ward off predators. Its shell has shaped itself to produce a more convincing image. It peers unblinking from within its cocoon, patiently awaiting evolution."),
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
           setLangFileName("Visacoon");

    }


}
