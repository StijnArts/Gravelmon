package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lavrassire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lavrassire() {
        super("Lavrassire",
                Type.FIRE,
                new Stats(101,
                        43,
                        34,
                        87,
                        54,
                        20),
                List.of(Ability.CUTE_CHARM), Ability.ANGER_POINT,
                8, 165,
                new Stats(1,0,0,0,0,0), 0,
                0.0,
                68, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("- Warm EmbraceSTAB Fire"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WARMEMBRACE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lavrassière");

    }


}
