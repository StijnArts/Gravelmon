package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pappybara extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pappybara() {
        super("Pappybara",
                Type.NORMAL,
                new Stats(102,
                        92,
                        88,
                        70,
                        79,
                        67),
                List.of(Ability.PARENTAL_BOND), Ability.PARENTAL_BOND,
                11, 165,
                new Stats(2,0,0,0,0,0), 30,
                1.0,
                175, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Pappybara always have litters of 3, and will often adopt different species of Pokemon into its family."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,12),
                        new MoveLearnSetEntry(Move.FLAIL,15),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,20),
                        new MoveLearnSetEntry(Move.CRUNCH,24),
                        new MoveLearnSetEntry(Move.SUPER_FANG,30),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,35),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,37),
                        new MoveLearnSetEntry(Move.PUNISHMENT,42),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,46),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,51),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,55),
                        new MoveLearnSetEntry(Move.SURF,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 43, 1.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPRING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
           setLangFileName("Pappybara");

    }


}
