package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Pengerupt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pengerupt() {
        super("Pengerupt",
                Type.ROCK,Type.FIRE,
                new Stats(90,
                        80,
                        91,
                        128,
                        91,
                        15),
                List.of(Ability.SOLID_ROCK,Ability.MAGMATICHEAT), Ability.CHLOROPHYLL,
                11, 307,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                171, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FLYING),
                List.of("Pengerupt wander deep into volcanos so they may fill their bodies with hot lava. They will then travel to the top of the volcano and shoot it into the air. No one knows why they do this."),
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
           setLangFileName("Pengerupt");

    }


}
