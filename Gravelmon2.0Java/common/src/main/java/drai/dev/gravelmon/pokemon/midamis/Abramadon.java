package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Abramadon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Abramadon() {
        super("Abramadon",
                Type.PSYCHIC, Type.ROCK,
                new Stats(70,
                        90,
                        80,
                        85,
                        130,
                        40),
                List.of(Ability.SAP_SIPPER), Ability.STURDY,
                27, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.LOCKON,1),
                        new MoveLearnSetEntry(Move.MIRACLE_EYE,4),
                        new MoveLearnSetEntry(Move.BARRIER,6),
                        new MoveLearnSetEntry(Move.PROTECT,10),
                        new MoveLearnSetEntry(Move.PSYWAVE,12),
                        new MoveLearnSetEntry(Move.ROCK_THROW,16),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,18),
                        new MoveLearnSetEntry(Move.SYNCHRONOISE,22),
                        new MoveLearnSetEntry(Move.SUBMISSION,24),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,28),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,30),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,34),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,36),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,42)
                ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 56, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Abramadon");

    }


}
