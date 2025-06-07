package drai.dev.data.pokemon.flux;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chowry extends drai.dev.data.pokemon.Pokemon {
    public Chowry() {
        super("Chowry",
                Type.ROCK,
                new Stats(52,
                        80,
                        85,
                        20,
                        43,
                        36),
                List.of(Ability.SHELL_ARMOR,Ability.STRONG_JAW), Ability.DRY_SKIN,
                5, 210,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                63, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3,EggGroup.MINERAL),
                List.of("When sitting still, it can be mistaken for a small boulder. Its poor eyesight often leads it to bite things far too large to eat."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.ACCELEROCK,4),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,9),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,15),
                        new MoveLearnSetEntry(Move.PROTECT,20),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,26),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,31),
                        new MoveLearnSetEntry(Move.CRUNCH,37),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,42),
                        new MoveLearnSetEntry(Move.JAW_LOCK,48),
                        new MoveLearnSetEntry(Move.CURSE,53),
                        new MoveLearnSetEntry(Move.LIQUIDATION,59),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,64),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,70),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_SPINNER,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm")),
                List.of(Label.FLUX),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Chowry");

    }


}
