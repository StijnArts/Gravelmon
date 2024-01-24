package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Balacier extends drai.dev.gravelmon.pokemon.Pokemon {
    public Balacier() {
        super("Balacier",
                Type.ICE,
                new Stats(91,
                        84,
                        91,
                        85,
                        72,
                        72),
                List.of(Ability.SNOWPLOW), Ability.ROUGH_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                173, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_2),
                List.of("A filter feeder, it inhales water and blows it out in the form of snow from its blow-hole. Because of this, their pods are always enshrouded in misty, underwater snowstorms. The cold surroundings freeze their prey and leave them unable to escape their giant, gaping mouths."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Balacier");

    }


}
