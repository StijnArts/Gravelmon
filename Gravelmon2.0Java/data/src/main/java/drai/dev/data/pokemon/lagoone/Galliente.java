package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Galliente extends drai.dev.data.pokemon.Pokemon {
    public Galliente() {
        super("Galliente",
                Type.FIRE, Type.ROCK,
                new Stats(67,
                        70,
                        102,
                        120,
                        59,
                        112),
                List.of(Ability.BLAZE), Ability.BLAZE,
                25, 420,
                new Stats(0,0,0,1,0,2), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("They are slow and laid back Pokémon who spend most of their time resting, but when wind currents blow, its sail lits up allowing it to move at an impressive high speed."),
                List.of(),
                List.of(     new MoveLearnSetEntry(Move.TACKLE, 1),
                        new MoveLearnSetEntry(Move.HARDEN, 1),
                        new MoveLearnSetEntry(Move.METAL_CLAW, 1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE, 1),
                        new MoveLearnSetEntry(Move.ROAR, 12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER, 16),
                        new MoveLearnSetEntry(Move.PROTECT, 20),
                        new MoveLearnSetEntry(Move.LAVA_PLUME, 24),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE, 28),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK, 35),
                        new MoveLearnSetEntry(Move.BODY_PRESS, 40),
                        new MoveLearnSetEntry(Move.ROCK_POLISH, 48),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM, 56),
                        new MoveLearnSetEntry(Move.STONE_EDGE, 64),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ, 72),
                        new MoveLearnSetEntry(Move.METEOR_BEAM, 80),
                        new MoveLearnSetEntry(Move.ERUPTION, 88)            ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Galliente");

    }


}
