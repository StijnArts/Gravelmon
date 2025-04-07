package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Garbadjinn extends drai.dev.data.pokemon.Pokemon {
    public Garbadjinn() {
        super("Garbadjinn",
                Type.FAIRY, Type.POISON,
                new Stats(125,
                        75,
                        90,
                        75,
                        90,
                        15),
                List.of(Ability.GLUTTONY,Ability.STICKY_HOLD,Ability.SWEET_VEIL), Ability.SWEET_VEIL,
                8, 165,
                new Stats(2,0,0,0,0,0), 225,
                0.0,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.FAIRY),
                List.of("The large Garbadjinn springs to life from its small trashcan to rain sickeningly-sweet junk food on foes. Despite its size, its body is light and covered in sugar that sparkles like stars."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.FAIRY_WIND,3),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SLUDGE,9),
                        new MoveLearnSetEntry(Move.RECYCLE,12),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,15),
                        new MoveLearnSetEntry(Move.SPIT_UP,17),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,20),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,23),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,27),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,35),
                        new MoveLearnSetEntry(Move.BELCH,38),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,42),
                        new MoveLearnSetEntry(Move.SPIRIT_BREAK,46),
                        new MoveLearnSetEntry(Move.WISH,48),
                        new MoveLearnSetEntry(Move.SEED_BOMB,50),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,60),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,65),
                        new MoveLearnSetEntry(Move.METEOR_MASH,70)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Garbadjinn");

    }


}
