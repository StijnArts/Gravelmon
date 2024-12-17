package drai.dev.data.pokemon.ottora;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wolverupt extends drai.dev.data.pokemon.Pokemon {
    public Wolverupt() {
        super("Wolverupt",
                Type.FIRE,
                new Stats(50,
                        90,
                        75,
                        60,
                        65,
                        70),
                List.of(Ability.BLAZE), Ability.TOUGH_CLAWS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wolverupt's claws harden as they evolve from Inflagulo, hardening into a steel-like substance. When heated, it's claws can cut through trees in quick swipes."),
                List.of(),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Wolverupt");

    }


}
