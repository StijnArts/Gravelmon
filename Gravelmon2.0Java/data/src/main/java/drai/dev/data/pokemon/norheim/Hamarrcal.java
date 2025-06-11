package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Hamarrcal extends drai.dev.data.pokemon.Pokemon {
    public Hamarrcal() {
        super("Hamarrcal",
                Type.ELECTRIC, Type.ROCK,
                new Stats(110,
                        140,
                        120,
                        120,
                        110,
                        80),
                List.of(Ability.LIGHTNING_ROD), Ability.ELECTRIC_SURGE,
                27, 165,
                new Stats(0,2,2,0,0,0), 45,
                0.0,
                306, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Once worshipped by agricultural people for centuries in hope of rain and a successful harvest. Little did they know however how this Pokemon once drained multiple seas; creating stormy, cosmic clouds. Hamarrcal's precison when striking is out of this world."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STOMP,1),
                        new MoveLearnSetEntry(Move.CHARGE,8),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,22),
                        new MoveLearnSetEntry(Move.GRAVITY,28),
                        new MoveLearnSetEntry(Move.ACCELEROCK,36),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,42),
                        new MoveLearnSetEntry(Move.STONE_EDGE,46),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,50),
                        new MoveLearnSetEntry(Move.DRAGON_HAMMER,56),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,62),
                        new MoveLearnSetEntry(Move.THUNDER,72),
                        new MoveLearnSetEntry(Move.METEOR_MASH,80),
                        new MoveLearnSetEntry(Move.CRABHAMMER,"tm"),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_HAMMER,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .legend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_COAST)
    .setAntiBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
