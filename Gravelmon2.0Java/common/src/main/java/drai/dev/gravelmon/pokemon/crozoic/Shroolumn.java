package drai.dev.gravelmon.pokemon.crozoic;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Shroolumn extends drai.dev.gravelmon.pokemon.Pokemon {
    public Shroolumn(Stats stats) {
        super("Shroolumn",
                Type.GRASS,
                stats,
                List.of(Ability.MYCELIUM_MIGHT), Ability.FILTER,
                68, 1650,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It is the tallest of the mushroom Pokémon. It thrives in damp environments, growing massive from ample nutrients in the soil that it siphons out with its tentacles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,1),
                        new MoveLearnSetEntry(Move.SPORE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.LIQUEFACTION,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.CHLOROBLAST,1),
                        new MoveLearnSetEntry(Move.MUD_BOMB,1),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,1)                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 31, 54, .9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MUSHROOM, Biome.IS_LUSH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Shroolumn");

    }


}
