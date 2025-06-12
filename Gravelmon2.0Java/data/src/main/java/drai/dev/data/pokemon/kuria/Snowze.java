package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snowze extends drai.dev.data.pokemon.Pokemon {
    public Snowze() {
        super("Snowze",
                Type.ICE, Type.NORMAL,
                new Stats(140,
                        120,
                        80,
                        70,
                        110,
                        30),
                List.of(Ability.FUR_COAT), Ability.FUR_COAT,
                20, 1231,
                new Stats(3,1,0,0,0,0), 45,
                0.875,
                328, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MONSTER),
                List.of("Snowze have very thick fur, so they never truly get cold. They go to desolate snow-covered mountains so they can sleep without being disturbed."),
                List.of(),
                List.of(       new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.MIST,7),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,10),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,13),
                        new MoveLearnSetEntry(Move.STOMP,16),
                        new MoveLearnSetEntry(Move.ICE_SHARD,20),
                        new MoveLearnSetEntry(Move.ASSURANCE,24),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,28),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,32),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,36),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,38),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,41),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,46),
                        new MoveLearnSetEntry(Move.MEGAHORN,50)                 ),
                List.of(Label.KURIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Snowze");

    }


}
