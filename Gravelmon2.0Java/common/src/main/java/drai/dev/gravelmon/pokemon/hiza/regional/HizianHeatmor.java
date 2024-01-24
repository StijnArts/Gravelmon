package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianHeatmor extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianHeatmor() {
        super("Heatmor",
                Type.POISON,Type.FIRE,
                new Stats(85,
                        97,
                        66,
                        105,
                        66,
                        65),
                List.of(Ability.PYROTOXIN), Ability.PYROTOXIN,
                8, 165,
                new Stats(0,0,0,2,0,0), 90,
                0.5,
                169, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It spills flammable gas and strikes its claws together to ignite fires. Using this strategy, Heatmor lures Termunch out of their underground nests."),
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
           setLangFileName("Heatmor");

    }


}
