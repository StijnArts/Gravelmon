package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Encantomb extends drai.dev.gravelmon.pokemon.Pokemon {
    public Encantomb() {
        super("Encantomb",
                Type.GROUND,Type.DRAGON,
                new Stats(90,
                        90,
                        120,
                        45,
                        115,
                        38),
                List.of(Ability.PRESSURE), Ability.PRESSURE,
                8, 165,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                174, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MINERAL),
                List.of("Mightiro who have fallen in battle rise up as an Encantomb. Encantomb's body is constructed from surrounding material around it such as dirt, bone, or chalk."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUNNY_DAY,1),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,20),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,25),
                        new MoveLearnSetEntry(Move.STOMP,30),
                        new MoveLearnSetEntry(Move.DIG,35),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,40),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,45),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,50),
                        new MoveLearnSetEntry(Move.STONE_EDGE,55),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,60),
                        new MoveLearnSetEntry(Move.METEOR_BEAM,65),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Encantomb");

    }


}
