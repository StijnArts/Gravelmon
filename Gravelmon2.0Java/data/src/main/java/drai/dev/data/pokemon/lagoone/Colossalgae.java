package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Colossalgae extends drai.dev.data.pokemon.Pokemon {
    public Colossalgae() {
        super("Colossalgae",
                Type.GRASS,
                new Stats(150,
                        120,
                        70,
                        60,
                        90,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                41, 3900,
                new Stats(3,0,0,0,0,0), 35,
                0.5,
                265, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(               new MoveLearnSetEntry(Move.DESTINY_BOND,1),
                        new MoveLearnSetEntry(Move.SPITE,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,1),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,5),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,8),
                        new MoveLearnSetEntry(Move.LEECH_SEED,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,15),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,19),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,22),
                        new MoveLearnSetEntry(Move.ATTRACT,26),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,29),
                        new MoveLearnSetEntry(Move.TAUNT,33),
                        new MoveLearnSetEntry(Move.AFTER_YOU,36),
                        new MoveLearnSetEntry(Move.SYNTHESIS,40),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,43),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,47),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,50),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,54),
                        new MoveLearnSetEntry(Move.GRUDGE,57)         ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.FOLIAGE, SpawnPreset.UNDERWATER)
    .build(), List.of());
	
           setLangFileName("Colossalgae");

    }


}
