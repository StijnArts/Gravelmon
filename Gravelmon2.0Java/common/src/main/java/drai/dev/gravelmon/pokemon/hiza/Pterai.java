package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Pterai extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pterai() {
        super("Pterai",
                Type.ELECTRIC,Type.FLYING,
                new Stats(45,
                        55,
                        65,
                        80,
                        40,
                        75),
                List.of(Ability.MAGNET_PULL), Ability.ELECTRIC_SURGE,
                8, 165,
                new Stats(0,0,0,1,0,0), 70,
                0.5,
                72, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("By flapping its wings it shocks small insects that it feeds on. It is able to fly close to the floor at high speeds even with its poor eyesight"),
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
           setLangFileName("Pterai");

    }


}
