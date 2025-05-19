package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tiamond extends drai.dev.data.pokemon.Pokemon {
    public Tiamond(Stats stats) {
        super("Tiamond",
                Type.ROCK, Type.DRAGON,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its head jewel is the toughest horn of all known of Pokemon, and it cannot be broken. By compressing the carbon it consumes in its stomach, it can produce a large number of diamonds in a short amount of time which it gifts its trainer."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,4),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,7),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,10),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,13),
                        new MoveLearnSetEntry(Move.HARDEN,16),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,19),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,22),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,25),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,31),
                        new MoveLearnSetEntry(Move.STONE_EDGE,34),
                        new MoveLearnSetEntry(Move.REFLECT,37),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,40),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,52)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tiamond");

    }


}
