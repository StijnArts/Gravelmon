package drai.dev.data.pokemon.isiah;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Oweesage extends drai.dev.data.pokemon.Pokemon {
    public Oweesage() {
        super("Oweesage",
                Type.PSYCHIC,
                new Stats(94,
                        69,
                        75,
                        131,
                        124,
                        87
                ),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 165,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.YAWN,4),
                        new MoveLearnSetEntry(Move.CONFUSION,8),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,11),
                        new MoveLearnSetEntry(Move.TELEPORT,15),
                        new MoveLearnSetEntry(Move.PSYBOLT,18),
                        new MoveLearnSetEntry(Move.DISABLE,22),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,25),
                        new MoveLearnSetEntry(Move.STOMP,29),
                        new MoveLearnSetEntry(Move.CALM_MIND,32),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,36),
                        new MoveLearnSetEntry(Move.MIND_READER,39),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,43),
                        new MoveLearnSetEntry(Move.MILK_DRINK,46),
                        new MoveLearnSetEntry(Move.NULL_ROOM,50),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,53),
                        new MoveLearnSetEntry(Move.KARMA_BEAM,57),
                        new MoveLearnSetEntry(Move.AMNESIA,60),
                        new MoveLearnSetEntry(Move.PSYCHIC,64)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Oweesage");

    }


}
