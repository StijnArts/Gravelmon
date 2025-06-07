package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Reefam extends drai.dev.data.pokemon.Pokemon {
    public Reefam() {
        super("Reefam",
                Type.WATER,
                new Stats(43,
                        53,
                        43,
                        53,
                        43,
                        83),
                List.of(Ability.FRIEND_GUARD), Ability.FRIEND_GUARD,
                0, 0,
                new Stats(0,0,0,0,0,2), 255,
                0.5,
                64, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("There is always one leader and two followers. Should the completely dependant followers lose their leader, they will wander aimlessly and starve."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,3),
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
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Reefam");

    }


}
