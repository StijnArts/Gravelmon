package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Corabdis extends drai.dev.data.pokemon.Pokemon {
    public Corabdis() {
        super("Corabdis",
                Type.WATER,Type.ROCK,
                new Stats(120,
                        120,
                        120,
                        70,
                        100,
                        70),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                69, 7400,
                new Stats(0,3,0,0,0,0), 3,
                0.0,
                290, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Many sailors don't acknowledge it as a Pokemon but as a sea devil. As it opens its massive claw, the vacuum creates huge whirlpools sinking down even the mightiest ships to the bottom of the sea."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.ULTRA_RARE, 65, 75, .0006, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Corabdis");

    }


}
