package drai.dev.data.pokemon.avalos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Harebinger extends drai.dev.data.pokemon.Pokemon {
    public Harebinger() {
        super("Harebinger",
                Type.GRASS, Type.FIRE,
                new Stats(81,
                        110,
                        79,
                        111,
                        72,
                        82),
                List.of(Ability.OVERGROW), Ability.BOMBARDIER,
                19, 1474,
                new Stats(0,0,0,3,0,0), 45,
                0.875,
                241, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("Aggressive by nature, Harebinger dig burrows in enemy territory as a display of superiority. They only show kindness to their own family, biological or chosen, and blast other dens with kernel missiles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SEEDSHOT,5),
                        new MoveLearnSetEntry(Move.SCREECH,8),
                        new MoveLearnSetEntry(Move.BITE,11),
                        new MoveLearnSetEntry(Move.LEECH_SEED,15),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,18),
                        new MoveLearnSetEntry(Move.GROWTH,24),
                        new MoveLearnSetEntry(Move.CRUNCH,27),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,39),
                        new MoveLearnSetEntry(Move.BERSERKFURY,42),
                        new MoveLearnSetEntry(Move.PYRO_BALL,45),
                        new MoveLearnSetEntry(Move.SEED_BOMB,48),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,54),
                        new MoveLearnSetEntry(Move.SYNTHESIS,58)                        ),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Harebinger");

    }


}
