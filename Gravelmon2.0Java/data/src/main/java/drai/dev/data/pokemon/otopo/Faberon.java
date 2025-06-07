package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Faberon extends drai.dev.data.pokemon.Pokemon {
    public Faberon() {
        super("Faberon",
                Type.DRAGON,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.MAGIC_GUARD), Ability.MAGIC_GUARD,
                6, 823,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("An egg which contains Faberon, is said to be hatched under a mountain of discarded Dragon Scales. It is incredibly delicate, and shy towards trainers and Pokémon alike. It hides under the casing of its shell at all times."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.PLAY_NICE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,6),
                        new MoveLearnSetEntry(Move.WITHDRAW,10),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,19),
                        new MoveLearnSetEntry(Move.CHARM,23),
                        new MoveLearnSetEntry(Move.RAINBOWGUST,28),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,34),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,40),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,44),
                        new MoveLearnSetEntry(Move.RAINBOWRUSH,50),
                        new MoveLearnSetEntry(Move.MOONLIGHT,53),
                        new MoveLearnSetEntry(Move.MOONBLAST,59),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm")                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Faberon");

    }


}
