package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Meowdow extends drai.dev.data.pokemon.Pokemon {
    public Meowdow() {
        super("Meowdow",
                Type.GRASS,
                new Stats(45,
                        70,
                        50,
                        55,
                        50,
                        55),
                List.of(Ability.OVERGROW), Ability.DEFIANT,
                6, 45,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Meowdow, known for their feisty nature, constantly hones their claws on rocks and trees, sharpening them into formidable weapons."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LEAFAGE,4),
                        new MoveLearnSetEntry(Move.LICK,6),
                        new MoveLearnSetEntry(Move.DETECT,9),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,13),
                        new MoveLearnSetEntry(Move.BITE,15),
                        new MoveLearnSetEntry(Move.METAL_CLAW,20),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,25),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,30)                        ),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Meowdow");

    }


}
