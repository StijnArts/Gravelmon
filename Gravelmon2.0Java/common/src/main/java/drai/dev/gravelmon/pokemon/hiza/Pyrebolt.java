package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pyrebolt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pyrebolt() {
        super("Pyrebolt",
                Type.FIRE,Type.ELECTRIC,
                new Stats(70,
                        75,
                        60,
                        75,
                        60,
                        80),
                List.of(Ability.BLAZE), Ability.IGNITION,
                8, 165,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                147, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Its body will constantly convert heat into electricity. If hit by a lightning bolt, it will overcharge and become almost unstoppable."),
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
           setLangFileName("Pyrebolt");

    }


}
