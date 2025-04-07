package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Roostor extends drai.dev.data.pokemon.Pokemon {
    public Roostor() {
        super("Roostor",
                Type.DARK,
                new Stats(40,
                        90,
                        50,
                        82,
                        62,
                        86),
                List.of(Ability.RELENTLESS), Ability.RIVALRY,
                10, 230,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Roostor are full of aggression and will fighting everything, even their own shadows. Large claws on their feet are used to help climb vertical ledges."),
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
                        new MoveLearnSetEntry(Move.PLUCK,34),
                        new MoveLearnSetEntry(Move.DARK_PULSE,41),
                        new MoveLearnSetEntry(Move.DRILL_PECK,47),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,54),
                        new MoveLearnSetEntry(Move.SLASH,60)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Roostor");

    }


}
