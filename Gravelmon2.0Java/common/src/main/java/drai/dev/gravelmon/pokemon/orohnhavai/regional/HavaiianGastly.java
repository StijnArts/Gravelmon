package drai.dev.gravelmon.pokemon.orohnhavai.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class HavaiianGastly extends drai.dev.gravelmon.pokemon.Pokemon {
    public HavaiianGastly() {
        super("Gastly",
                Type.GHOST,Type.FIRE,
                new Stats(30,
                        30,
                        35,
                        100,
                        35,
                        80),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It attracts victims with its warm enthralling fire, then puts them under a trance. It will then suck their energy while the victim feels nothing at all. Victims wake up afterward, feeling very chilled. The fire surrounding it burns brighter the more energy it has consumed."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gastly");

    }


}
