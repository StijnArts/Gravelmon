package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cragweise extends drai.dev.data.pokemon.Pokemon {
    public Cragweise() {
        super("Cragweise",
                Type.GRASS,Type.NORMAL,
                new Stats(80,
                        120,
                        80,
                        92,
                        75,
                        85),
                List.of(Ability.OVERGROW), Ability.SHEER_FORCE,
                17, 880,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Cragweise climbs trees and scales mountains in order to witness the vast horizon. It takes its time to appreciate the pauses in life; a way to connect with the world. The use of its ocarina has multiple effects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.UPROAR,1),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,1),
                        new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FAKE_OUT,1),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,1),
                        new MoveLearnSetEntry(Move.HYPER_FANG,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,1),
                        new MoveLearnSetEntry(Move.EARTH_POWER,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.BULLDOZE,1),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,1)),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cragweise");

    }


}
