package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dewgong extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dewgong() {
        super("Dewgong",
                Type.WATER,Type.GRASS,
                new Stats(90,
                        70,
                        95,
                        70,
                        80,
                        70),
                List.of(Ability.WATER_BUBBLE), Ability.WATER_BUBBLE,
                8, 165,
                new Stats(0,0,2,0,0,0), 75,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("Dewgong in the Qamor region are able to alter the humidity of the air around them to remain comfortable- they prefer the air being very thick and damp. They are an endangered species due to the historical carelessness of Humans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COTTON_GUARD,1),
                        new MoveLearnSetEntry(Move.GROWL,3),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,7),
                        new MoveLearnSetEntry(Move.LEECH_SEED,11),
                        new MoveLearnSetEntry(Move.ENCORE,13),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,17),
                        new MoveLearnSetEntry(Move.REST,21),
                        new MoveLearnSetEntry(Move.LIFE_DEW,23),
                        new MoveLearnSetEntry(Move.SYNTHESIS,27),
                        new MoveLearnSetEntry(Move.AQUA_JET,31),
                        new MoveLearnSetEntry(Move.BRINE,33),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,39),
                        new MoveLearnSetEntry(Move.DIVE,45),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,49),
                        new MoveLearnSetEntry(Move.SOAK,55),
                        new MoveLearnSetEntry(Move.SAFEGUARD,61),
                        new MoveLearnSetEntry(Move.LEAF_STORM,65),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dewgong");

    }


}
