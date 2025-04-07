package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Eruptinon extends drai.dev.data.pokemon.Pokemon {
    public Eruptinon() {
        super("Eruptinon",
                Type.FIRE, Type.ROCK,
                new Stats(90,
                        105,
                        85,
                        120,
                        85,
                        95),
                List.of(Ability.FLAME_BODY), Ability.MAGMA_ARMOR,
                24, 2495,
                new Stats(0,1,0,2,0,0), 45,
                0.5,
                217, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.AMORPHOUS),
                List.of("As Eruptinon grows and matures, it spends more time deep in the heart of volcanoes, basking in the intense heat and absorbing the energy of the molten rock around it. Its rocky skin acts as a natural shield, protecting it from the searing heat of the magma and allowing it to move through the fiery depths with ease. Eruptinon's powerful cannon-like head and fiery eyes strike fear into the hearts of all who dare to challenge it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.INCINERATE,9),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,12),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,17),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,23),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,29),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,35),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,41),
                        new MoveLearnSetEntry(Move.STONE_EDGE,47),
                        new MoveLearnSetEntry(Move.ERUPTION,53),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,59),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"tm")                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(45).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setSpawnPreset(SpawnPreset.NEAR_LAVA).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Eruptinon");

    }


}
