package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Javelady extends drai.dev.data.pokemon.Pokemon {
    public Javelady() {
        super("Javelady",
                Type.NORMAL, Type.FIGHTING,
                new Stats(80,
                        120,
                        105,
                        60,
                        75,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.BIDE,4),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,11),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,14),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,18),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,22),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,25),
                        new MoveLearnSetEntry(Move.ENDURE,28),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,32),
                        new MoveLearnSetEntry(Move.FAKE_OUT,36),
                        new MoveLearnSetEntry(Move.FLAIL,39)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(45)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Javelady");

    }


}
