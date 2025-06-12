package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rudeworm extends drai.dev.data.pokemon.Pokemon {
    public Rudeworm() {
        super("Rudeworm",
                Type.DRAGON, Type.ROCK,
                new Stats(64,
                        113,
                        112,
                        103,
                        40,
                        68),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 940,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                180, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(              new MoveLearnSetEntry(Move.ANCIENT_POWER,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.BITE,16),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,20),
                        new MoveLearnSetEntry(Move.STOMP,24),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,28),
                        new MoveLearnSetEntry(Move.CRUNCH,32),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,36),
                        new MoveLearnSetEntry(Move.THRASH,42),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,48),
                        new MoveLearnSetEntry(Move.HORN_DRILL,54),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,60),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,66)          ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(33)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Rudeworm");

    }


}
