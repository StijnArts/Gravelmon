package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Symphonia extends drai.dev.gravelmon.pokemon.Pokemon {
    public Symphonia() {
        super("Symphonia",
                Type.NORMAL, Type.BUG,
                new Stats(80,
                        70,
                        70,
                        135,
                        90,
                        60),
                List.of(Ability.MAGIC_BOUNCE), Ability.TECHNICIAN,
                8, 165,
                new Stats(0,0,0,3,0,0), 45,
                0.5,
                227, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Symphonia");

    }


}
