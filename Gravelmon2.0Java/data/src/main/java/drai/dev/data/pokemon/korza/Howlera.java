package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Howlera extends drai.dev.data.pokemon.Pokemon {
    public Howlera() {
        super("Howlera",
                Type.DARK,Type.STEEL,
                new Stats(90,
                        100,
                        140,
                        60,
                        140,
                        50),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                19, 644,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Believed to be a powerful, ancient mon who drove away all other life on the Lonely Island. People who live along the Hydra Lake's edge claim to hear strange howls from the island on certain nights."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FEINT,1),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.BOLTIN,20),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,29),
                        new MoveLearnSetEntry(Move.PUNISHMENT,38),
                        new MoveLearnSetEntry(Move.IRON_TAIL,47),
                        new MoveLearnSetEntry(Move.METAL_SOUND,57),
                        new MoveLearnSetEntry(Move.SCREECH,75),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,84),
                        new MoveLearnSetEntry(Move.CRUNCH,93)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Howlera");

    }


}
