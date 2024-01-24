package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tropiary extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tropiary() {
        super("Tropiary",
                Type.GRASS,Type.STEEL,
                new Stats(77,
                        100,
                        121,
                        50,
                        70,
                        52),
                List.of(Ability.HYPER_CUTTER), Ability.CHLOROPHYLL,
                8, 165,
                new Stats(0,1,1,0,0,0), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.GRASS),
                List.of("The bush on its back is shapped like its body to confuse its foes in combat. It spends most of its day sunbathing."),
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
           setLangFileName("Tropiary");

    }


}
