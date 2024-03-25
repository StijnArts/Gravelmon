package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cregg extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cregg() {
        super("Cregg",
                Type.NORMAL,
                new Stats(70,
                        70,
                        50,
                        20,
                        50,
                        45),
                List.of(Ability.PICKPOCKET), Ability.WEAK_ARMOR,
                5, 145,
                new Stats(0,1,0,0,0,0), 120,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("This crafty Pokémon that pretends to be an egg so it can hide inside bird nests. Getting protetion from predators by the birds and warmed up during the night."),
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
           setLangFileName("Cregg");

    }


}
