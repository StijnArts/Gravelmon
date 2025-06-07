package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scurley extends drai.dev.data.pokemon.Pokemon {
    public Scurley() {
        super("Scurley",
                Type.GRASS,
                new Stats(46,
                        63,
                        49,
                        45,
                        45,
                        62),
                List.of(Ability.OVERGROW), Ability.CHEEK_POUCH,
                5, 40,
                new Stats(0,1,0,0,0,0), 45,
                0.875,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.FIELD),
                List.of("Scurley likes hopping around in fields and forests. It loves to occasionally dig holes and bury things in them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.SEEDSHOT,7),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,9),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,12),
                        new MoveLearnSetEntry(Move.DETECT,17),
                        new MoveLearnSetEntry(Move.BITE,19),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,22),
                        new MoveLearnSetEntry(Move.SLASH,25),
                        new MoveLearnSetEntry(Move.DIG,28),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,33),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.BRAMBLEUP,45),
                        new MoveLearnSetEntry(Move.SEED_BOMB,50),
                        new MoveLearnSetEntry(Move.LEAF_STORM,56),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tm")                        ),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Scurley");

    }


}
