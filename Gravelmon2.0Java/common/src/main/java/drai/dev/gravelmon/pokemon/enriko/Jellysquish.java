package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Jellysquish extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jellysquish() {
        super("Jellysquish",
                Type.WATER,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 140,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The bell and its tentacles are two separate organisms. Its bell keeps it floating on the surface of the water as the tentacles consume food particles below."),
                List.of(new EvolutionEntry("phonowar", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.TIME, "\"night\"")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.MUD_SPORT,9),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,12),
                        new MoveLearnSetEntry(Move.HEADBUTT,15),
                        new MoveLearnSetEntry(Move.WATER_PULSE,20),
                        new MoveLearnSetEntry(Move.ASSURANCE,25),
                        new MoveLearnSetEntry(Move.SWAGGER,29),
                        new MoveLearnSetEntry(Move.BODY_SLAM,33),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,39),
                        new MoveLearnSetEntry(Move.WORK_UP,42),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,47),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,53),
                        new MoveLearnSetEntry(Move.THRASH,59)
                ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Jellysquish");

    }


}
