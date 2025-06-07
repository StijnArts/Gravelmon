package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Apolalgae extends drai.dev.data.pokemon.Pokemon {
    public Apolalgae() {
        super("Apolalgae",
                Type.GRASS, Type.WATER,
                new Stats(95,
                        30,
                        80,
                        60,
                        110,
                        25),
                List.of(Ability.HYDRATION,Ability.WATER_ABSORB), Ability.WATER_COMPACTION,
                5, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Squishy and full of nutrients and water, Apolalgae make a loud wailing noise to deter predators. This usually ends up backfiring, attracting even more."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1)                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.FOLIAGE, SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Apolalgae");

    }


}
