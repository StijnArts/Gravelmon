package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Garglizer extends drai.dev.data.pokemon.Pokemon {
    public Garglizer() {
        super("Garglizer",
                Type.ROCK, Type.DRAGON,
                new Stats(80,
                        120,
                        100,
                        50,
                        60,
                        95),
                List.of(Ability.RIVALRY,Ability.MOXIE,Ability.INTIMIDATE), Ability.INTIMIDATE,
                8, 165,
                new Stats(0,2,0,0,0,0), 25,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("At night, when they are most active, they are known to terrorize small towns. They appear to dwell in abandoned buildings and frighten off intruders with their spine-tingling screeches."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.WING_ATTACK,6),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,11),
                        new MoveLearnSetEntry(Move.HEADBUTT,16),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,21),
                        new MoveLearnSetEntry(Move.CRUNCH,26),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,31),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,32),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,38),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,44),
                        new MoveLearnSetEntry(Move.AGILITY,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,56),
                        new MoveLearnSetEntry(Move.OUTRAGE,62),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.TWISTER,"tm"),
                        new MoveLearnSetEntry(Move.HOWL,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Garglizer");

    }


}
