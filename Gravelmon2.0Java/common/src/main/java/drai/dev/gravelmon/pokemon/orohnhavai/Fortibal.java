package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Fortibal extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fortibal() {
        super("Fortibal",
                Type.STEEL,
                new Stats(50,
                        50,
                        120,
                        30,
                        75,
                        25),
                List.of(Ability.STURDY,Ability.HEATPROOF,Ability.IRON_BARBS), Ability.IRON_BARBS,
                8, 165,
                new Stats(0,0,1,0,0,0), 120,
                0.5,
                92, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Fortibal can use both defense and offense at the same time by rolling up in a spiked ball and charging at its enemies."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fortibal");

    }


}
