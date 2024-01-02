package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Yacuma extends Pokemon {
    public Yacuma() {
        super("Yacuma",
                Type.WATER, Type.GHOST,
                new Stats(125, 95, 105, 105, 115, 55),
                List.of(Ability.HYDRATION), Ability.DRIZZLE,
                15, 390,
                new Stats(2,0,0,0,1,2), 3,
                0,
                261, ExperienceGroup.SLOW,
                70,
                200, List.of(EggGroup.UNDISCOVERED),
                List.of("Seeing Yacuma's lights floating in the deep is a bad omen for sailors. Ships that pollute the sea are unlikely to escape its wrath and return to shore."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_RING,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,5),
                        new MoveLearnSetEntry(Move.BRINE,15),
                        new MoveLearnSetEntry(Move.SOAK,20),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,30),
                        new MoveLearnSetEntry(Move.SCALD,35),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,45),
                        new MoveLearnSetEntry(Move.RECOVER,50),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,60),
                        new MoveLearnSetEntry(Move.AURA_SPHERE,65),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,70),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.TELEKINESIS,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.STANDOFF,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_WILL,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm")
                        ),
                List.of(Label.SAGE),
                3, List.of(
                        new ItemDrop("minecraft:prismarine",90, 3,10)
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 50, 55, 0.0005, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.MAXY,"10"),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.33, 0.5,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
