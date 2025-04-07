package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Purrleo extends drai.dev.data.pokemon.Pokemon {
    public Purrleo() {
        super("Purrleo",
                Type.GRASS, Type.FIGHTING,
                new Stats(55,
                        95,
                        75,
                        55,
                        50,
                        80),
                List.of(Ability.OVERGROW), Ability.DEFIANT,
                12, 122,
                new Stats(0,2,0,0,0,0), 45,
                0.75,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Purrleo dedicate their days to rigorous training within the heart of dense jungles of Theos."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,4),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.DETECT,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,20),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,25),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,30),
                        new MoveLearnSetEntry(Move.SWAGGER,35),
                        new MoveLearnSetEntry(Move.THRASH,40),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,45)                        ),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Purrleo");

    }


}
