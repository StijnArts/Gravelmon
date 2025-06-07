package drai.dev.data.pokemon.solarlightlunardark;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Formling extends drai.dev.data.pokemon.Pokemon {
    public Formling() {
        super("Formling",
                Type.NORMAL,
                new Stats(70,
                        20,
                        25,
                        52,
                        43,
                        68),
                List.of(Ability.COLOR_CHANGE,Ability.IMPOSTER), Ability.PROTEAN,
                4, 50,
                new Stats(1,0,0,0,0,0), 35,
                -1.0,
                101, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("A master shapeshifter, Formling are said to be able to take the permanent form of other Pokémon at will. Due to this, they are theorized to have spread to other regions."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.REFLECT_TYPE,2),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,3),
                        new MoveLearnSetEntry(Move.MIMIC,34),
                        new MoveLearnSetEntry(Move.CONVERSION,21),
                        new MoveLearnSetEntry(Move.TRANSFORM,5),
                        new MoveLearnSetEntry(Move.PSYCH_UP,8),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,1),
                        new MoveLearnSetEntry(Move.CONVERSION_2,55),
                        new MoveLearnSetEntry(Move.METRONOME,13)),
                List.of(Label.SOLARLIGHTLUNARDARK),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Formling");

    }


}
