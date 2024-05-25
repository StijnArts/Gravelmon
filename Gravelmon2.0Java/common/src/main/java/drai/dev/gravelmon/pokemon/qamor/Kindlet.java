package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kindlet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kindlet() {
        super("Kindlet",
                Type.FIRE,
                new Stats(48,
                        50,
                        50,
                        65,
                        54,
                        53),
                List.of(Ability.BLAZE), Ability.WANDERING_SPIRIT,
                5, 165,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                62, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Despite their usual timidness and general fragility, Kindlet are very curious and often stray from their herds when their mind is left to wander."),
                List.of(new EvolutionEntry("occultlet", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,6),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,8),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,10),
                        new MoveLearnSetEntry(Move.STOMP,13),
                        new MoveLearnSetEntry(Move.WIDE_GUARD,15),
                        new MoveLearnSetEntry(Move.POWER_GEM,17),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,21),
                        new MoveLearnSetEntry(Move.HEX,25),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,29),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,33),
                        new MoveLearnSetEntry(Move.DARK_PULSE,38),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,42),
                        new MoveLearnSetEntry(Move.NIGHTMARE,48),
                        new MoveLearnSetEntry(Move.YAWN,"tm"),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,"tm"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.FLATTER,"tm"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,"tm"),
                        new MoveLearnSetEntry(Move.CURSE,"tm"),
                        new MoveLearnSetEntry(Move.GRUDGE,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_GRASSLAND)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kindlet");

    }


}
