package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Galliente extends drai.dev.gravelmon.pokemon.Pokemon {
    public Galliente() {
        super("Galliente",
                Type.FIRE,Type.ROCK,
                new Stats(67,
                        70,
                        102,
                        120,
                        59,
                        112),
                List.of(Ability.BLAZE), Ability.BLAZE,
                25, 420,
                new Stats(0,0,0,1,0,2), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They are slow and laid back Pokémon who spend most of their time resting, but when wind currents blow, its sail lits up allowing it to move at an impressive high speed."),
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
           setLangFileName("Galliente");

    }


}
