package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tullabaloo extends drai.dev.data.pokemon.Pokemon {
    public Tullabaloo(Stats stats) {
        super("Tullabaloo",
                Type.PSYCHIC, Type.POISON,
                stats,
                List.of(Ability.PERPLEXING), Ability.NEUTRALIZING_GAS,
                8, 8,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_2),
                List.of("It was thought that just looking at it was enough to leave a person in a confused stupor, but it's really caused by accidentally breathing in the gas that it uses to float."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EXPLOSION,1),
                        new MoveLearnSetEntry(Move.MINIMIZE,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.DEFOG,1),
                        new MoveLearnSetEntry(Move.STRANGE_STEAM,1),
                        new MoveLearnSetEntry(Move.SMOG,1),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,1),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.HURRICANE,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	

        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tullabaloo");

    }


}
