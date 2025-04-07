package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hoodrikus extends drai.dev.data.pokemon.Pokemon {
    public Hoodrikus() {
        super("Hoodrikus",
                Type.GHOST,
                new Stats(85,
                        55,
                        50,
                        123,
                        80,
                        100),
                List.of(Ability.MAGICIAN), Ability.CLEAR_BODY,
                14, 250,
                new Stats(0,0,0,2,1,0), 25,
                0.5,
                235, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("- Confusion Psychic - Confuse Ray Ghost 6 Trick Psychic 14 Curse Ghost 16 Psywave Psychic 21 Ominous WindSTAB Ghost 23 Psyshock Psychic 24 Trick Room Psychic 27 Trick Room Psychic 30 Switcheroo Dark 31 Teleport Psychic 34 Reflect Psychic 37 Destiny Bond Ghost 41 Light Screen Psychic 43 Shadow BallSTAB Ghost 47 Night Daze Dark"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.TRICK,6),
                        new MoveLearnSetEntry(Move.CURSE,14),
                        new MoveLearnSetEntry(Move.PSYWAVE,16),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,21),
                        new MoveLearnSetEntry(Move.PSYSHOCK,23),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,27),
                        new MoveLearnSetEntry(Move.SWITCHEROO,30),
                        new MoveLearnSetEntry(Move.TELEPORT,31),
                        new MoveLearnSetEntry(Move.REFLECT,34),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,37),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,41),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,43),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,47)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoodrikus");

    }


}
