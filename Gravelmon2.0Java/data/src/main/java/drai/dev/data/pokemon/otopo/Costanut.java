package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Costanut extends drai.dev.data.pokemon.Pokemon {
    public Costanut() {
        super("Costanut",
                Type.WATER, Type.GRASS,
                new Stats(40,
                        75,
                        70,
                        60,
                        40,
                        40),
                List.of(Ability.SHELL_ARMOR,Ability.IRON_FIST), Ability.TOUGH_CLAWS,
                5, 68,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("They are spotted excavating tunnels in the sand, waiting for opponents to pass by, then springing from the sand and attacking in the hopes of rapidly defeating its opponent."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PINCH,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.LEAFTURN,6),
                        new MoveLearnSetEntry(Move.WATER_GUN,11),
                        new MoveLearnSetEntry(Move.HEADBUTT,15),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,18),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,22),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,26),
                        new MoveLearnSetEntry(Move.WATER_PULSE,30),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,32),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,35),
                        new MoveLearnSetEntry(Move.CRABHAMMER,38),
                        new MoveLearnSetEntry(Move.SANDSHOT,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Costanut");

    }


}
