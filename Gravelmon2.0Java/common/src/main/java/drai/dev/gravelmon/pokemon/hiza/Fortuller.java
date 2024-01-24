package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Fortuller extends drai.dev.gravelmon.pokemon.Pokemon {
    public Fortuller() {
        super("Fortuller",
                Type.BUG,Type.PSYCHIC,
                new Stats(44,
                        28,
                        46,
                        67,
                        100,
                        15),
                List.of(Ability.INFILTRATOR), Ability.FOREWARN,
                8, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They gather all sorts of rare minerals to roll up and fuse into a crystal ball, those who look into the ball will see their future."),
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
           setLangFileName("Fortuller");

    }


}
