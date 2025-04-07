package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class hakid extends drai.dev.data.pokemon.Pokemon {
    public hakid() {
        super("hakid",
                Type.FIGHTING,
                new Stats(80,
                        85,
                        50,
                        20,
                        30,
                        40),
                List.of(Ability.HYPER_CUTTER,Ability.SHEER_FORCE), Ability.MOLD_BREAKER,
                0, 122,
                new Stats(0,1,0,0,0,0), 180,
                0.75,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Needs a idea. Idk, something lumberjack related I guess"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SLASH,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.SUPERPOWER,1),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,1)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("hakid");

    }


}
