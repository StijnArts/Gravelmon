package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Appendash extends drai.dev.data.pokemon.Pokemon {
    public Appendash() {
        super("Appendash",
                Type.WATER,
                new Stats(73,
                        103,
                        83,
                        103,
                        83,
                        83),
                List.of(Ability.FRIEND_GUARD), Ability.FRIEND_GUARD,
                0, 0,
                new Stats(0,2,0,1,0,0), 45,
                0.5,
                185, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("It travels for miles across the ocean seeking beautiful fish to attach to its body. The followers will put their lives on the line to defend Appendash."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HELPING_HAND,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.ENCORE,6),
                        new MoveLearnSetEntry(Move.AQUA_JET,9),
                        new MoveLearnSetEntry(Move.SUPERSONIC,12),
                        new MoveLearnSetEntry(Move.BRINE,15),
                        new MoveLearnSetEntry(Move.AQUA_RING,18),
                        new MoveLearnSetEntry(Move.DIVE,21),
                        new MoveLearnSetEntry(Move.AFTER_YOU,24),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,27),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,30),
                        new MoveLearnSetEntry(Move.TRIPLE_DIVE,33),
                        new MoveLearnSetEntry(Move.FLIP_TURN,39),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,45),
                        new MoveLearnSetEntry(Move.BEAT_UP,51),
                        new MoveLearnSetEntry(Move.WAVE_CRASH,57),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Appendash");

    }


}
