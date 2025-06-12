package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Saguartic extends drai.dev.data.pokemon.Pokemon {
    public Saguartic() {
        super("Saguartic",
                Type.ICE, Type.GRASS,
                new Stats(100,
                        86,
                        108,
                        88,
                        90,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                54, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,6),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.ICY_WIND,17),
                        new MoveLearnSetEntry(Move.HAZE,20),
                        new MoveLearnSetEntry(Move.SYNTHESIS,24),
                        new MoveLearnSetEntry(Move.FREEZEDRY,28),
                        new MoveLearnSetEntry(Move.SEED_BOMB,32),
                        new MoveLearnSetEntry(Move.LEECH_SEED,35),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,38),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,42),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,46),
                        new MoveLearnSetEntry(Move.LEAF_STORM,50)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(35)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .setAntiBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Saguartic");

    }


}
