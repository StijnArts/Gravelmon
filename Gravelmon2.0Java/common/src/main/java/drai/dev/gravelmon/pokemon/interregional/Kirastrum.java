package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Kirastrum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kirastrum() {
        super("Kirastrum",
                Type.DARK, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 165,
                new Stats(0,0,0,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("vitoshum", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"41")))),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,5),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,10),
                        new MoveLearnSetEntry(Move.SING,15),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,20),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,25),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,30),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,35),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,40),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,45),
                        new MoveLearnSetEntry(Move.PARTING_SHOT,50),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,60)
                ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 21, 36, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kirastrum");

    }


}
