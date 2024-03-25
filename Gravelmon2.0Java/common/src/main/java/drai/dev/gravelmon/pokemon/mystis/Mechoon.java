package drai.dev.gravelmon.pokemon.mystis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Mechoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mechoon() {
        super("Mechoon",
                Type.BUG,Type.ROCK,
                new Stats(60,
                        65,
                        80,
                        25,
                        35,
                        35),
                List.of(Ability.ROCK_HEAD), Ability.TRAMPLE,
                10, 699,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                105, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mechoon");

    }


}
