package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Papillo extends drai.dev.data.pokemon.Pokemon {
    public Papillo() {
        super("Papillo",
                Type.BUG, Type.FAIRY,
                new Stats(180,
                        70,
                        80,
                        50,
                        80,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.COVET,15),
                        new MoveLearnSetEntry(Move.ROLLOUT,17),
                        new MoveLearnSetEntry(Move.BUG_BITE,19),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,23),
                        new MoveLearnSetEntry(Move.SNORE,26),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,30),
                        new MoveLearnSetEntry(Move.FRUITMUNCH,34),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,37),
                        new MoveLearnSetEntry(Move.NATURAL_GIFT,42),
                        new MoveLearnSetEntry(Move.SWALLOW,45),
                        new MoveLearnSetEntry(Move.BELCH,50),
                        new MoveLearnSetEntry(Move.LAST_RESORT,54)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Papillo");

    }


}
