package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Rubee extends drai.dev.gravelmon.pokemon.Pokemon {
    public Rubee() {
        super("Rubee",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(70,
                        30,
                        30,
                        100,
                        45,
                        30),
                List.of(Ability.PRANKSTER), Ability.PRANKSTER,
                8, 165,
                new Stats(0,0,0,1,0,0), 120,
                0.5,
                61, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.MONSTER),
                List.of("Rubee are mischievous Pokemon primarily found living inside factories, and love playing around mechanical parts and sometimes messing them up."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.EERIE_IMPULSE,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,4),
                        new MoveLearnSetEntry(Move.CHARGE,7),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,11),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,16),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,20),
                        new MoveLearnSetEntry(Move.PSYSHOCK,23),
                        new MoveLearnSetEntry(Move.ELECTRIFY,28),
                        new MoveLearnSetEntry(Move.PSYCHIC,33),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Rubee");

    }


}
