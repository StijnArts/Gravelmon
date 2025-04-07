package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ryuvern extends drai.dev.data.pokemon.Pokemon {
    public Ryuvern() {
        super("Ryuvern",
                Type.WATER, Type.DRAGON,
                new Stats(110,
                        118,
                        92,
                        70,
                        80,
                        60),
                List.of(Ability.TORRENT), Ability.SWIFT_SWIM,
                33, 0,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.DRAGON),
                List.of("Ryuvern is incredibly rare, and spotting it is often an omen of things to come. It is said that it can transport itself between this world and a world full of water using the orb it wields."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUASLAP,1),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.AQUA_JET,15),
                        new MoveLearnSetEntry(Move.BITE,21),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,23),
                        new MoveLearnSetEntry(Move.DRAGONFANG,25),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,27),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,29),
                        new MoveLearnSetEntry(Move.LIQUIDATION,31),
                        new MoveLearnSetEntry(Move.ROAR,33),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,35),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.DIVE,39),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,41),
                        new MoveLearnSetEntry(Move.BERSERKFURY,45),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,47),
                        new MoveLearnSetEntry(Move.OUTRAGE,49),
                        new MoveLearnSetEntry(Move.ABYSSALDIVE,51),
                        new MoveLearnSetEntry(Move.FLIP_TURN,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.BREAKING_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_RING,"tm"),
                        new MoveLearnSetEntry(Move.NOBLE_ROAR,"tm")                        ),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Ryuvern");

    }


}
