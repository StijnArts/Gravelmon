package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ampelly extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ampelly() {
        super("Ampelly",
                Type.ELECTRIC,
                new Stats(55,
                        45,
                        25,
                        70,
                        55,
                        45),
                List.of(Ability.LEVITATE), Ability.STATIC,
                4, 165,
                new Stats(0,0,0,0,1,0), 190,
                0.5,
                59, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(new EvolutionEntry("jelectric", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))
                ),
                List.of(           new MoveLearnSetEntry(Move.MUDSLAP,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,7),
                        new MoveLearnSetEntry(Move.WATER_GUN,11),
                        new MoveLearnSetEntry(Move.CHARGE,17),
                        new MoveLearnSetEntry(Move.SPARK,21),
                        new MoveLearnSetEntry(Move.MUD_SHOT,24),
                        new MoveLearnSetEntry(Move.FLAIL,25),
                        new MoveLearnSetEntry(Move.DISCHARGE,32),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,36),
                        new MoveLearnSetEntry(Move.ELECTRIC_TERRAIN,40),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,45),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,50)),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 6, 29, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
