package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Scyllagon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scyllagon() {
        super("Scyllagon",
                Type.WATER, Type.DRAGON,
                new Stats(105,
                        50,
                        75,
                        150,
                        75,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 1565,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.MONSTER),
                List.of(""),
                List.of(),
                List.of(      new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.FIRE_FANG,1),
                        new MoveLearnSetEntry(Move.BUBBLE,1),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,1),
                        new MoveLearnSetEntry(Move.ICE_FANG,1),
                        new MoveLearnSetEntry(Move.AIRBUBBLE,1),
                        new MoveLearnSetEntry(Move.HAZE,1),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,5),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,7),
                        new MoveLearnSetEntry(Move.YAWN,10),
                        new MoveLearnSetEntry(Move.AQUASLAP,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,18),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,21),
                        new MoveLearnSetEntry(Move.SCALD,26),
                        new MoveLearnSetEntry(Move.SMOG,29),
                        new MoveLearnSetEntry(Move.TWISTER,34),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,39),
                        new MoveLearnSetEntry(Move.BEACHTIDE,43),
                        new MoveLearnSetEntry(Move.BODY_PRESS,47),
                        new MoveLearnSetEntry(Move.CAUSTIC_BREATH,52),
                        new MoveLearnSetEntry(Move.POISON_FANG,56),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,61),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,65),
                        new MoveLearnSetEntry(Move.HURRICANE,69),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,74),
                        new MoveLearnSetEntry(Move.MYSTICSONG,79)                  ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 21, 45, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);

    }


}
