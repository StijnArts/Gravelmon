package drai.dev.gravelmon.pokemon.interregional.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class InterianArceus extends drai.dev.gravelmon.pokemon.Pokemon {
    public InterianArceus(String name, Aspect aspect) {
        super(name, aspect,"Arceus",
                Type.NORMAL,
                new Stats(120,
                        100,
                        120,
                        160,
                        120,
                        140),
                List.of(Ability.HOLY_GUARD), Ability.HOLY_GUARD,
                28, 165,
                new Stats(0,0,0,0,0,0), 1,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.COSMIC_POWER,1),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,1),
                        new MoveLearnSetEntry(Move.GRAVITY,10),
                        new MoveLearnSetEntry(Move.EARTH_POWER,20),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,30),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,40),
                        new MoveLearnSetEntry(Move.HEALING_WISH,50),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,60),
                        new MoveLearnSetEntry(Move.RECOVER,70),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,80),
                        new MoveLearnSetEntry(Move.PERISH_SONG,90),
                        new MoveLearnSetEntry(Move.JUDGMENT,100)
                        ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 70, 70, 0.00001, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PEAK)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arceus");
           setCanFly(true);

    }


}
