package drai.dev.data.pokemon.cyare;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tinguano extends drai.dev.data.pokemon.Pokemon {
    public Tinguano() {
        super("Tinguano",
                Type.FIGHTING, Type.ROCK,
                new Stats(86,
                        70,
                        82,
                        34,
                        40,
                        50),
                List.of(Ability.GUTS), Ability.SKILL_LINK,
                8, 447,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Although clumsy, their hardened fists and thumb spikes allow them to fight off predators larger than them. Tinguano lived 125 million years ago, and was revived by modern science."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,6),
                        new MoveLearnSetEntry(Move.ARM_THRUST,11),
                        new MoveLearnSetEntry(Move.ROCK_THROW,14),
                        new MoveLearnSetEntry(Move.MIND_READER,17),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,21),
                        new MoveLearnSetEntry(Move.FEINT,23),
                        new MoveLearnSetEntry(Move.ROAR,28),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,32),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,33),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,36),
                        new MoveLearnSetEntry(Move.STONE_EDGE,40),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,44),
                        new MoveLearnSetEntry(Move.TITLEMATCH,48)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tinguano");

    }


}
