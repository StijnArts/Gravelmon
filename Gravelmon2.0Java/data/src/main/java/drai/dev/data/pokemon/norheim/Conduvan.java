package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Conduvan extends drai.dev.data.pokemon.Pokemon {
    public Conduvan() {
        super("Conduvan",
                Type.STEEL, Type.NORMAL,
                new Stats(157,
                        81,
                        101,
                        57,
                        113,
                        61),
                List.of(Ability.BEAST_BOOST), Ability.BEAST_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,0), 20,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Conduvan (UB Cluster) was first seen on the night skies of the Northern Hemisphere. A parent of multiple star clusters and a bringer of eggs; this outlandish Pokemon may occasionally sacrifice bad eggs."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,8),
                        new MoveLearnSetEntry(Move.STEEL_WING,16),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,26),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,34),
                        new MoveLearnSetEntry(Move.MEMENTO,40),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,48),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,58),
                        new MoveLearnSetEntry(Move.EXPLOSION,68),
                        new MoveLearnSetEntry(Move.METEOR_MASH,78),
                        new MoveLearnSetEntry(Move.DOOM_DESIRE,88),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,98)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);

    }


}
