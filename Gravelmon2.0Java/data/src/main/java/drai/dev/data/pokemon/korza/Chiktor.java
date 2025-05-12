package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chiktor extends drai.dev.data.pokemon.Pokemon {
    public Chiktor() {
        super("Chiktor",
                Type.DARK,
                new Stats(42,
                        72,
                        43,
                        47,
                        36,
                        60),
                List.of(Ability.RELENTLESS), Ability.RIVALRY,
                4, 49,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Chiktor love to play, but can be very competitive and throw fits when they don't get their way. It takes a skilled trainer to keep one from quarreling with its own teammates."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.TWISTER,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.BEAT_UP,14),
                        new MoveLearnSetEntry(Move.SCARY_FACE,19),
                        new MoveLearnSetEntry(Move.PAYBACK,23),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,28),
                        new MoveLearnSetEntry(Move.PLUCK,32),
                        new MoveLearnSetEntry(Move.DARK_PULSE,37),
                        new MoveLearnSetEntry(Move.DRILL_PECK,41),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,46),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,50)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Chiktor");

    }


}
