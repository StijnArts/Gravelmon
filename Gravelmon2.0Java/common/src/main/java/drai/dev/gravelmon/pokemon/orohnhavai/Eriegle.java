package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Eriegle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eriegle() {
        super("Eriegle",
                Type.NORMAL, Type.FLYING,
                new Stats(49,
                        65,
                        38,
                        30,
                        38,
                        45),
                List.of(Ability.KEEN_EYE,Ability.BIG_PECKS,Ability.RIVALRY), Ability.RIVALRY,
                8, 165,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                54, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Born with fairly weak wings, Eriegle love to stay in their nest and be nurtured by their parents until it's strong enough to fly from its roost. They become more hostile as they grow."),
                List.of(),
                List.of(                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eriegle");

    }


}
