package drai.dev.gravelmon.pokemon.lonava;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Wicruet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Wicruet() {
        super("Wicruet",
                Type.FIGHTING, Type.WATER,
                new Stats(40,
                        70,
                        40,
                        35,
                        40,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 165,
                new Stats(0,1,0,0,0,0), 75,
                0.0,
                57, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("A very persistent Mon, Wicruet can gather a following like no other. Its vessel contains water, which is thought to symbolise the sweat and tears it pours into attaining evolution. Legends state that a holy man once visited Tonbury Town with a Wicruet."),
                List.of(new EvolutionEntry("eucharite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))
                ),
                List.of(         new MoveLearnSetEntry(Move.HYPNOSIS,1),
                        new MoveLearnSetEntry(Move.MUD_SHOT,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,24),
                        new MoveLearnSetEntry(Move.BODY_SLAM,32),
                        new MoveLearnSetEntry(Move.EARTH_POWER,40),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,48),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,56),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,66)
                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 13, 33, 5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Wicruet");

    }


}
