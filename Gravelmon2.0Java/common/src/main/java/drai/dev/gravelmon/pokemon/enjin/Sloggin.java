package drai.dev.gravelmon.pokemon.enjin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Sloggin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Sloggin() {
        super("Sloggin",
                Type.POISON,Type.PSYCHIC,
                new Stats(55,
                        35,
                        45,
                        55,
                        80,
                        25),
                List.of(Ability.STICKY_HOLD,Ability.REGENERATOR), Ability.CONTAMINATE,
                3, 90,
                new Stats(0,0,0,0,1,0), 180,
                0.5,
                59, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.WATER_3),
                List.of("If it feels threatened, it will emit psychedelic flashes from its eyes to disorient the opponent. It seems that the strange appendage emerging from its shell is a kind of parasite that controls some of its movements."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.PSYWAVE,4),
                        new MoveLearnSetEntry(Move.ACID,7),
                        new MoveLearnSetEntry(Move.SUPERSONIC,11),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,13),
                        new MoveLearnSetEntry(Move.PSYBEAM,17),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,20),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,23),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,27),
                        new MoveLearnSetEntry(Move.RECOVER,32),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,35),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,39),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,44),
                        new MoveLearnSetEntry(Move.BREAKDOWN,50),
                        new MoveLearnSetEntry(Move.TRUMP_CARD,"tm"),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,"tm"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"tm"),
                        new MoveLearnSetEntry(Move.ACID_SPRAY,"tm"),
                        new MoveLearnSetEntry(Move.STOCKPILE,"tm"),
                        new MoveLearnSetEntry(Move.SWALLOW,"tm"),
                        new MoveLearnSetEntry(Move.SPIT_UP,"tm"),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,"tm"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"tm"),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,"tm"),
                        new MoveLearnSetEntry(Move.DISABLE,"tm"),
                        new MoveLearnSetEntry(Move.FLAIL,"tm"),
                        new MoveLearnSetEntry(Move.STEAMROLLER,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Sloggin");

    }


}
