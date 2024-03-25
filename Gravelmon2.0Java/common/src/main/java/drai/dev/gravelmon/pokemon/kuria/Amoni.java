package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Amoni extends drai.dev.gravelmon.pokemon.Pokemon {
    public Amoni() {
        super("Amoni",
                Type.ICE,Type.FIRE,
                new Stats(35,
                        60,
                        30,
                        82,
                        30,
                        73),
                List.of(Ability.BLAST), Ability.THERMALPOWER,
                2, 168,
                new Stats(0,0,0,1,0,0), 60,
                0.0,
                88, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Amoni");

    }


}
