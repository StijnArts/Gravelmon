package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Mudrake extends drai.dev.data.pokemon.Pokemon {
    public Mudrake() {
        super("Mudrake",
                Type.GROUND, Type.DRAGON,
                new Stats(65,
                        80,
                        75,
                        55,
                        50,
                        65),
                List.of(Ability.MOLD_BREAKER,Ability.SAND_RUSH,Ability.SKILL_LINK), Ability.SKILL_LINK,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("One of the earliest Pokemon found in the mountains of Migard. The intelligence of a Mudrake can be seen from its ability to carve symbols on cave walls. The bone-like horns on its head may break after aggressive fights with its opponents."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.RAGE,8),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,11),
                        new MoveLearnSetEntry(Move.BIDE,16),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,20),
                        new MoveLearnSetEntry(Move.BONE_CLUB,26),
                        new MoveLearnSetEntry(Move.SANDSTORM,30),
                        new MoveLearnSetEntry(Move.BONE_RUSH,36),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,40),
                        new MoveLearnSetEntry(Move.TAUNT,46),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,50),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,62)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mudrake");

    }


}
