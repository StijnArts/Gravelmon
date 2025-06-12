package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boulblin extends drai.dev.data.pokemon.Pokemon {
    public Boulblin() {
        super("Boulblin",
                Type.ROCK, Type.GROUND,
                new Stats(75,
                        112,
                        62,
                        60,
                        89,
                        102),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 1120,
                new Stats(0,0,0,0,0,2), 70,
                0.5,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.HARDEN,6),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,10),
                        new MoveLearnSetEntry(Move.ROCK_THROW,14),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,17),
                        new MoveLearnSetEntry(Move.MAGNITUDE,20),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,24),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,28),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,33),
                        new MoveLearnSetEntry(Move.RELICPILLAR,38),
                        new MoveLearnSetEntry(Move.MORNING_SUN,43),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,48)                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(26)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_CAVE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Boulblin");

    }


}
