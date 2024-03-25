package drai.dev.gravelmon.pokemon.dhiome;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Surchin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Surchin() {
        super("Surchin",
                Type.DARK,Type.WATER,
                new Stats(65,
                        35,
                        65,
                        35,
                        95,
                        30),
                List.of(Ability.IRON_BARBS), Ability.STURDY,
                8, 39,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("At night, it scavenges the seafloor for discarded shells to fortify its armor. Its eyes allow it to see in the murky darkness."),
                List.of(),
                List.of(                        ),
                List.of(Label.DHIOME),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Surchin");

    }


}
