package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Terragrip extends drai.dev.gravelmon.pokemon.Pokemon {
    public Terragrip() {
        super("Terragrip",
                Type.BUG,Type.STEEL,
                new Stats(95,
                        120,
                        100,
                        35,
                        65,
                        65),
                List.of(Ability.STICKY_HOLD), Ability.STICKY_HOLD,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.875,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("New Ability - Stand Ground: Terragrip can not be removed from battle by opponent's moves."),
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
           setLangFileName("Terragrip");

    }


}
