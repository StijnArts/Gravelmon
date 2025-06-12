package drai.dev.data.pokemon.qamor.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class QamoranBeartic extends drai.dev.data.pokemon.Pokemon {
    public QamoranBeartic(String name, Aspect aspect) {
        super(name, aspect, "Beartic",
                Type.GHOST, Type.POISON,
                new Stats(95,
                        70,
                        50,
                        130,
                        80,
                        80),
                List.of(Ability.GOOEY), Ability.GOOEY,
                8, 165,
                new Stats(0,0,0,2,0,0), 60,
                0.5,
                177, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,1),
                        new MoveLearnSetEntry(Move.PAYBACK,12),
                        new MoveLearnSetEntry(Move.SPITE,16),
                        new MoveLearnSetEntry(Move.CURSE,20),
                        new MoveLearnSetEntry(Move.HEX,24),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,30),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,36),
                        new MoveLearnSetEntry(Move.DARK_PULSE,42),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,48),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,54),
                        new MoveLearnSetEntry(Move.DREAM_EATER,60)
                ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(37)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY, Biome.IS_NETHER_WASTELAND)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Beartic");

    }


}
