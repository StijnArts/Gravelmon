package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Icetope extends Pokemon {
    public Icetope() {
        super("Icetope",
                Type.ICE, Type.POISON,
                new Stats(70, 30, 50, 65, 80, 25),
                List.of(Ability.SNOW_WARNING), Ability.ICE_BODY,
                4, 36,
                new Stats(0,0,0,0,1,0), 75,
                0.5,
                64, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Icetope's innards are in the constant danger of overheating and melting down. To counteract this, it maintains an extremely low body temperature."),
                List.of(new EvolutionEntry("chillnobyl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.POISON_GAS,1),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,3),
                        new MoveLearnSetEntry(Move.ICY_WIND,6),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,11),
                        new MoveLearnSetEntry(Move.SLUDGE,13),
                        new MoveLearnSetEntry(Move.MIST,16),
                        new MoveLearnSetEntry(Move.HAZE,16),
                        new MoveLearnSetEntry(Move.BODY_SLAM,21),
                        new MoveLearnSetEntry(Move.FROST_BREATH,23),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,26),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,31),
                        new MoveLearnSetEntry(Move.AMNESIA,33),
                        new MoveLearnSetEntry(Move.TOXIC,36),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,41),
                        new MoveLearnSetEntry(Move.BLIZZARD,43),
                        new MoveLearnSetEntry(Move.RECOVER,46),
                        new MoveLearnSetEntry(Move.EXPLOSION,51),
                        new MoveLearnSetEntry(Move.SHEER_COLD,53),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SNOWY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,"tutor"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.SPITE,"tutor"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,"egg"),
                        new MoveLearnSetEntry(Move.HAZE,"egg"),
                        new MoveLearnSetEntry(Move.MEMENTO,"egg"),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:redstone",90, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 5, 28, 3.0, List.of(
                        new SpawnCondition(SpawnConditionType.MAXY,"20"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.UNDERGROUND),
                0.19, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
