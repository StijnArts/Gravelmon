package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Palmfiend extends drai.dev.gravelmon.pokemon.Pokemon {
    public Palmfiend() {
        super("Palmfiend",
                Type.GRASS,Type.FLYING,
                new Stats(69,
                        71,
                        90,
                        90,
                        71,
                        94),
                List.of(Ability.NATURAL_CURE), Ability.SOLAR_POWER,
                13, 366,
                new Stats(0,0,0,1,0,1), 45,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Would it lose one of its tail feathers, it loses all its flying capabilities, making it very agitated and dangerous to approach."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Palmfiend");

    }


}
