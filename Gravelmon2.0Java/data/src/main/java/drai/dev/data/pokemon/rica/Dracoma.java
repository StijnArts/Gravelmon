package drai.dev.data.pokemon.rica;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Dracoma extends drai.dev.data.pokemon.Pokemon {
    public Dracoma() {
        super("Dracoma",
                Type.ICE, Type.DRAGON,
                new Stats(50,
                        30,
                        30,
                        100,
                        55,
                        90),
                List.of(Ability.ICE_BODY), Ability.ICE_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                72, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.DRAGON),
                List.of("Dracoma are thought to come from outer space. They sometimes fall from the sky unexpectedly, leaving a trail of icy dust behind them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.AGILITY,7),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,12),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,16),
                        new MoveLearnSetEntry(Move.MOONLIGHT,20),
                        new MoveLearnSetEntry(Move.SWIFT,24),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,27),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,31),
                        new MoveLearnSetEntry(Move.STARSTREAM,35),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,40),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,45),
                        new MoveLearnSetEntry(Move.METEORSHOWER,50),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,56),
                        new MoveLearnSetEntry(Move.SHEER_COLD,62),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,70),
                        new MoveLearnSetEntry(Move.WISH,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm")                        ),
                List.of(Label.RICA),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Dracoma");

    }


}
