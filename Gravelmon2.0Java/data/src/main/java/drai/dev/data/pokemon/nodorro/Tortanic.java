package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tortanic extends drai.dev.data.pokemon.Pokemon {
    public Tortanic() {
        super("Orcawhale",
                Type.WATER, Type.ICE,
                new Stats(150,
                        64,
                        135,
                        41,
                        100,
                        10),
                List.of(Ability.MOLD_BREAKER), Ability.MOLD_BREAKER,
                75, 7890,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Nobody knows how this Pokémon got into the region, nor has anyone ever seen it before. The iceberg on its back is large enough to house a Snolem"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,1),
                        new MoveLearnSetEntry(Move.AVALANCHE,1),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,1),
                        new MoveLearnSetEntry(Move.SURF,1),
                        new MoveLearnSetEntry(Move.SHEER_COLD,1),
                        new MoveLearnSetEntry(Move.WATER_PULSE,1),
                        new MoveLearnSetEntry(Move.IRON_TAIL,1),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,1),
                        new MoveLearnSetEntry(Move.BODY_SLAM,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,1),
                        new MoveLearnSetEntry(Move.ICE_BEAM,1),
                        new MoveLearnSetEntry(Move.BLIZZARD,1)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(38).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SURFACE)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Orcawhale");

    }


}
