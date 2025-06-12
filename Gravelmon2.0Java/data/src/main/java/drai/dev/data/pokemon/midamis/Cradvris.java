package drai.dev.data.pokemon.midamis;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Cradvris extends drai.dev.data.pokemon.Pokemon {
    public Cradvris() {
        super("Cradvris",
                Type.WATER, Type.BUG,
                new Stats(85,
                        105,
                        90,
                        105,
                        75,
                        35),
                List.of(Ability.SWARM), Ability.BOMBARDIER,
                16, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(   new MoveLearnSetEntry(Move.PROTECT,1),
                        new MoveLearnSetEntry(Move.WATER_SPORT,10),
                        new MoveLearnSetEntry(Move.CHILLING_WATER,13),
                        new MoveLearnSetEntry(Move.LIFE_DEW,16),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.VIOLENTSWARM,24),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,28),
                        new MoveLearnSetEntry(Move.BEACHTIDE,32),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,36),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,40),
                        new MoveLearnSetEntry(Move.SWARMINGTERRAIN,44),
                        new MoveLearnSetEntry(Move.NATURE_POWER,48),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,52)                     ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(28)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setCanSwim(true);

    }


}
