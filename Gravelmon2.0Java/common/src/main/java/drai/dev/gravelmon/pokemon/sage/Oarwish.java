package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Oarwish extends Pokemon {
    public Oarwish() {
        super("Oarwish",
                Type.WATER, Type.PSYCHIC,
                new Stats(99, 55, 88, 94, 127, 77),
                List.of(Ability.HEALER, Ability.REGENERATOR), Ability.NATURAL_CURE,
                26, 547,
                new Stats(0,0,0,0,1,0), 45,
                0.5,
                189, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_2, EggGroup.DRAGON),
                List.of("Oarwish is known to emerge only to help people in need. This has gained it a reputation amongst sailors that it is a sign of luck and can grant wishes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAL_PULSE,1),
                        new MoveLearnSetEntry(Move.HEALING_WISH,1),
                        new MoveLearnSetEntry(Move.ROUND,1),
                        new MoveLearnSetEntry(Move.WATER_GUN,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,7),
                        new MoveLearnSetEntry(Move.COVET,14),
                        new MoveLearnSetEntry(Move.WATER_PULSE,21),
                        new MoveLearnSetEntry(Move.FLAIL,28),
                        new MoveLearnSetEntry(Move.WISH,35),
                        new MoveLearnSetEntry(Move.PSYBEAM,35),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,42),
                        new MoveLearnSetEntry(Move.RECOVER,49),
                        new MoveLearnSetEntry(Move.PSYCHIC,56),
                        new MoveLearnSetEntry(Move.SAFEGUARD,63),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,70),
                        new MoveLearnSetEntry(Move.PSYSHOCK,"tm"),
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
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SKILL_SWAP,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.DEPTH_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.MIRACLE_WILL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.HEAL_BELL,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.WONDER_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.AMNESIA,"egg"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"egg"),
                        new MoveLearnSetEntry(Move.SOAK,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg")
                        ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:raw_cod",90, 1,2)
                ), SpawnContext.SUBMERGED, SpawnPool.ULTRA_RARE, 40, 56, 0.01, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_RIVER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE,Biome.IS_ARID))),
                List.of(SpawnPreset.UNDERWATER),
                0.6, 0.5,
                List.of());
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
        this.setAvoidsLand(true);
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
