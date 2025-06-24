package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Akiddo extends drai.dev.data.pokemon.Pokemon {
    public Akiddo() {
        super("Akiddo",
                Type.DARK,Type.NORMAL,
                new Stats(102,
                        172,
                        102,
                        0,
                        102,
                        102),
                List.of(Ability.TOUGH_CLAWS,Ability.NO_GUARD), Ability.SCRAPPY,
                15, 540,
                new Stats(1,2,1,0,1,1), 45,
                1.0,
                300, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("An ancient tale tells about a boy who got corrupted in a realm full of malevolent spirits. A'kiddo's power to eliminate other Pokémon was taken away from it due to its thirst for destruction."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,1),
                        new MoveLearnSetEntry(Move.TAUNT,1),
                        new MoveLearnSetEntry(Move.ENDURE,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,1),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,4),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,9),
                        new MoveLearnSetEntry(Move.DETECT,13),
                        new MoveLearnSetEntry(Move.DISABLE,17),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,22),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,22),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,26),
                        new MoveLearnSetEntry(Move.ENDEAVOR,30),
                        new MoveLearnSetEntry(Move.OBSTRUCT,34),
                        new MoveLearnSetEntry(Move.QUASH,39),
                        new MoveLearnSetEntry(Move.EMBARGO,42),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,47),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,51),
                        new MoveLearnSetEntry(Move.MOONLIGHT,56),
                        new MoveLearnSetEntry(Move.MEMENTO,62)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .mythical()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BAMBOO).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("A'kiddo");

    }


}
