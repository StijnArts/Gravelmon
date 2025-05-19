package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mawoboll extends drai.dev.data.pokemon.Pokemon {
    public Mawoboll() {
        super("Mawoboll",
                Type.PSYCHIC,
                new Stats(95,
                        40,
                        75,
                        50,
                        65,
                        35),
                List.of(Ability.SHED_SKIN,Ability.FOREWARN), Ability.HEALER,
                10, 23,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                72, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Mawoboll stores berries in its pouch to give to other pokemon. Occasionally, it will shed its hard exterior. The shed shells are stored inside each other and are hidden."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.BESTOW,5),
                        new MoveLearnSetEntry(Move.PLAY_NICE,10),
                        new MoveLearnSetEntry(Move.SWEET_KISS,14),
                        new MoveLearnSetEntry(Move.NUZZLE,19),
                        new MoveLearnSetEntry(Move.BARRIER,23),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,27),
                        new MoveLearnSetEntry(Move.PSYWAVE,31),
                        new MoveLearnSetEntry(Move.FLAIL,36),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,40),
                        new MoveLearnSetEntry(Move.STORED_POWER,45),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,49),
                        new MoveLearnSetEntry(Move.PSYCHIC,53),
                        new MoveLearnSetEntry(Move.PROTECT,58),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mawoboll");

    }


}
