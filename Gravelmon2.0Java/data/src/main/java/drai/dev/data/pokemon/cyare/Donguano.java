package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Donguano extends drai.dev.data.pokemon.Pokemon {
    public Donguano() {
        super("Donguano",
                Type.FIGHTING, Type.ROCK,
                new Stats(105,
                        96,
                        110,
                        65,
                        60,
                        85),
                List.of(Ability.IRON_FIST), Ability.SKILL_LINK,
                18, 727,
                new Stats(1,0,2,0,0,0), 45,
                0.875,
                185, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("A Pokémon that first lived 125 million years ago, Donguano strive to be the best in one-on-one combat, usually challenging stronger Donguano both inside and outside their social circles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,11),
                        new MoveLearnSetEntry(Move.ROCK_THROW,14),
                        new MoveLearnSetEntry(Move.MIND_READER,17),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,21),
                        new MoveLearnSetEntry(Move.FEINT,23),
                        new MoveLearnSetEntry(Move.ROAR,28),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,33),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,38),
                        new MoveLearnSetEntry(Move.STONE_EDGE,42),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,46),
                        new MoveLearnSetEntry(Move.TITLEMATCH,52),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,57)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Donguano");

    }


}
