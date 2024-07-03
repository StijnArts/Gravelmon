package drai.dev.gravelmon.pokemon.amavi;


import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Volvyrm extends drai.dev.gravelmon.pokemon.Pokemon {
    public Volvyrm() {
        super("volvyrm",
                Type.ELECTRIC, Type.DRAGON,
                new Stats(50,
                        60,
                        70,
                        150,
                        70,
                        130),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                17, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPARK,1),
                        new MoveLearnSetEntry(Move.BITE,6),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,10),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,15),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,20),
                        new MoveLearnSetEntry(Move.ROAR,24),
                        new MoveLearnSetEntry(Move.CRUNCH,29),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,33),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,38),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,43),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,47),
                        new MoveLearnSetEntry(Move.OUTRAGE,50),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,56),
                        new MoveLearnSetEntry(Move.THUNDER,61)
                ),
                List.of(Label.AMAVI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 55, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
