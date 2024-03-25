package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Gigantuna extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gigantuna() {
        super("Gigantuna",
                Type.WATER,
                new Stats(105,
                        65,
                        70,
                        105,
                        85,
                        75),
                List.of(Ability.THICK_FAT), Ability.MARVEL_SCALE,
                17, 1400,
                new Stats(2,0,0,0,0,0), 80,
                0.5,
                172, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It will try to eat anything that fits in its mouth, especially shiny objects. Their scales will glisten and even slightly change color depending on what they eat."),
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
           setLangFileName("Gigantuna");

    }


}
