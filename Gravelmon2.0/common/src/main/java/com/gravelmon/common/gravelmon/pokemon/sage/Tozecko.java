package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Tozecko extends Pokemon {
    public Tozecko() {
        super("Tozecko",
                Type.GRASS, Type.DRAGON,
                new Stats(85, 100, 65, 100, 75, 115),
                List.of(Ability.LEAF_GUARD, Ability.OVERGROW), Ability.WONDER_SKIN,
                29, 590,
                new Stats(0,0,0,0,0,2), 25,
                0.5,
                189, ExperienceGroup.SLOW,
                70,
                100, List.of(EggGroup.DRAGON, EggGroup.GRASS),
                List.of("Tozecko was worshipped as a god of wind and harvest in ancient times. When offered tribute, it would ensure clear skies and bountiful crops."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.TWISTER,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.GLARE,10),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,15),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,19),
                        new MoveLearnSetEntry(Move.POISON_FANG,24),
                        new MoveLearnSetEntry(Move.GROWTH,29),
                        new MoveLearnSetEntry(Move.TEMPEST,33),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,38),
                        new MoveLearnSetEntry(Move.AGILITY,43),
                        new MoveLearnSetEntry(Move.DRAGON_RUSH,43),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,48),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,54),
                        new MoveLearnSetEntry(Move.COIL,60),
                        new MoveLearnSetEntry(Move.LEAF_STORM,66),
                        new MoveLearnSetEntry(Move.OUTRAGE,71),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,"egg"),
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:seeds",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 43, 58, 0.05, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.89, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
