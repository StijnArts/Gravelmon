package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gargantune extends drai.dev.data.pokemon.Pokemon {
    public Gargantune() {
        super("Gargantune",
                Type.PSYCHIC,Type.POISON,
                new Stats(90,
                        50,
                        50,
                        135,
                        110,
                        75),
                List.of(Ability.LEVITATE), Ability.CURSED_BODY,
                25, 343,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                230, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Capable of telepathic communication, and are known to speak in riddles with a penchant for lying. This mon is best known from an old story, where one is responsible for a king's overthrowing."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_POWDER,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.PSYBEAM,8),
                        new MoveLearnSetEntry(Move.POISON_GAS,14),
                        new MoveLearnSetEntry(Move.PSYWAVE,20),
                        new MoveLearnSetEntry(Move.HAZARDCLOUD,25),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,29),
                        new MoveLearnSetEntry(Move.VENOSHOCK,34),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,38),
                        new MoveLearnSetEntry(Move.TOXIC,42),
                        new MoveLearnSetEntry(Move.VENOM_DRENCH,46),
                        new MoveLearnSetEntry(Move.HYPNOSIS,50),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,55),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,59)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Gargantune");

    }


}
