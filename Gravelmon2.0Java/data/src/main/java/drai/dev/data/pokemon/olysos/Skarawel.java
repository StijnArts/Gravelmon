package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skarawel extends drai.dev.data.pokemon.Pokemon {
    public Skarawel() {
        super("Skarawel",
                Type.STEEL, Type.BUG,
                new Stats(40,
                        70,
                        100,
                        40,
                        100,
                        120),
                List.of(Ability.SWARM), Ability.SWARM,
                2, 150,
                new Stats(0,0,1,0,0,2), 75,
                0.5,
                180, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Skarawel, the Golden Beetle Pokémon. Skarawel is often mistaken for jewelry due to its shimmering, golden body. It is found in the deserts and tombs where it nests inside walls. Although it may seem harmless, its swarms can cause significant damage to wooden structures."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,6),
                        new MoveLearnSetEntry(Move.METAL_CLAW,10),
                        new MoveLearnSetEntry(Move.BUG_BITE,14),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,18),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,22),
                        new MoveLearnSetEntry(Move.POWER_GEM,26),
                        new MoveLearnSetEntry(Move.AGILITY,30),
                        new MoveLearnSetEntry(Move.XSCISSOR,34),
                        new MoveLearnSetEntry(Move.IRON_HEAD,38),
                        new MoveLearnSetEntry(Move.REFLECT,42),
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,46),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,50),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.METAL_SOUND,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.MINIMIZE,"tm")                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Skarawel");

    }


}
