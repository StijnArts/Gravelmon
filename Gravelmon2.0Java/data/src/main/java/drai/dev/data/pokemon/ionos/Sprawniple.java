package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sprawniple extends drai.dev.data.pokemon.Pokemon {
    public Sprawniple(Stats stats) {
        super("Sprawniple",
                Type.BUG, Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It investigates gruesome scenes in the depths of the ocean by itself. Outside of work, they are seen in large numbers."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 13, 32, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Sprawniple");

    }


}
