package com.gravelmon.common.gravelmon.pokemon.sage;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Patama extends Pokemon {
    public Patama() {
        super("Patama",
                Type.GRASS, Type.GHOST,
                new Stats(85, 105, 115, 125, 55, 95),
                List.of(Ability.SOLAR_POWER), Ability.GRASSY_SURGE,
                15, 720,
                new Stats(0,0,1,2,0,0), 3,
                0,
                261, ExperienceGroup.SLOW,
                70,
                200, List.of(EggGroup.UNDISCOVERED),
                List.of("Patama presides over land and forests, caring for the plants and Pokémon. It perpetuates the life cycle, making sure death always brings forth new life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.INGRAIN,1),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,1),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,5),
                        new MoveLearnSetEntry(Move.SYNTHESIS,15),
                        new MoveLearnSetEntry(Move.LEECH_SEED,20),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,30),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,35),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,45),
                        new MoveLearnSetEntry(Move.RECOVER,50),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,60),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,65),
                        new MoveLearnSetEntry(Move.LEAF_STORM,70),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_WILL,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm")
                        ),
                List.of(Label.SAGE),
                3, List.of(
                        new ItemDrop("minecraft:spruce_sapling",90, 3,10)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 50, 55, 0.0005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.33, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
