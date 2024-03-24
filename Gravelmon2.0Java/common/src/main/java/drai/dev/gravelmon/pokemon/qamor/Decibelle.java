package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Decibelle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Decibelle() {
        super("Decibelle",
                Type.NORMAL,
                new Stats(50,
                        48,
                        40,
                        61,
                        45,
                        36),
                List.of(Ability.PUNK_ROCK), Ability.PUNK_ROCK,
                5, 165,
                new Stats(0,0,0,1,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.HUMAN_LIKE),
                List.of("Decibelle are very musically gifted pokemon. They learn to play new songs very quickly, and master any instruments with ease."),
                List.of(new EvolutionEntry("ampt", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(new MoveLearnSetEntry(Move.HIDDEN_POWER,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,12),
                        new MoveLearnSetEntry(Move.SECRET_POWER,16),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,18),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,21),
                        new MoveLearnSetEntry(Move.DRAGONFANG,24),
                        new MoveLearnSetEntry(Move.ASSIST,28),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,30),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,33),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,36),
                        new MoveLearnSetEntry(Move.METRONOME,38),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,44),
                        new MoveLearnSetEntry(Move.THRASH,49),
                        new MoveLearnSetEntry(Move.CLANGOROUS_SOUL,53),
                        new MoveLearnSetEntry(Move.OUTRAGE,58),
                        new MoveLearnSetEntry(Move.CLANGOROUS_SOUL,"tm"),
                        new MoveLearnSetEntry(Move.OVERDRIVE,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 2, 28, 3.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Decibelle");

    }


}
