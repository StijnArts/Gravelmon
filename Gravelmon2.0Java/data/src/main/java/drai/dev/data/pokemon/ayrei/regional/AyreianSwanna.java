package drai.dev.data.pokemon.ayrei.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AyreianSwanna extends Pokemon {
    public AyreianSwanna(String name, Aspect aspect) {
        super(name, aspect,"AyreianSwanna",
                Type.FLYING, Type.FAIRY,
                new Stats(75,117,73,98,57,73),
                List.of(Ability.DANCER, Ability.BIG_PECKS), Ability.FAIRY_AURA,
                13, 242,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                166, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING, EggGroup.WATER_1),
                List.of("Swanna start to dance at dawn. The one dancing in the middle is the leader of the flock."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND, 1),
                        new MoveLearnSetEntry(Move.WATER_SPORT, 3),
                        new MoveLearnSetEntry(Move.DEFOG, 6),
                        new MoveLearnSetEntry(Move.WING_ATTACK, 9),
                        new MoveLearnSetEntry(Move.DRAINING_KISS, 13),
                        new MoveLearnSetEntry(Move.AERIAL_ACE, 17),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE, 21),
                        new MoveLearnSetEntry(Move.MISTY_TERRAIN, 24),
                        new MoveLearnSetEntry(Move.AIR_SLASH, 27),
                        new MoveLearnSetEntry(Move.ROOST, 30),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH, 34),
                        new MoveLearnSetEntry(Move.TAILWIND, 38),
                        new MoveLearnSetEntry(Move.LUNAR_DANCE, 43),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD, 49),
                        new MoveLearnSetEntry(Move.VICTORY_DANCE, 55),

                        new MoveLearnSetEntry(Move.AERIAL_ACE, "tutor"),
                        new MoveLearnSetEntry(Move.ATTRACT, "tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE, "tutor"),
                        new MoveLearnSetEntry(Move.DEFOG, "tutor"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR, "tutor"),
                        new MoveLearnSetEntry(Move.ENDURE, "tutor"),
                        new MoveLearnSetEntry(Move.FACADE, "tutor"),
                        new MoveLearnSetEntry(Move.FLY, "tutor"),
                        new MoveLearnSetEntry(Move.FRUSTRATION, "tutor"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT, "tutor"),
                        new MoveLearnSetEntry(Move.HAIL, "tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER, "tutor"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICE_BEAM, "tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND, "tutor"),
                        new MoveLearnSetEntry(Move.MOONBLAST, "tutor"),
                        new MoveLearnSetEntry(Move.PROTECT, "tutor"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE, "tutor"),
                        new MoveLearnSetEntry(Move.REST, "tutor"),
                        new MoveLearnSetEntry(Move.RETURN, "tutor"),
                        new MoveLearnSetEntry(Move.ROOST, "tutor"),
                        new MoveLearnSetEntry(Move.ROUND, "tutor"),
                        new MoveLearnSetEntry(Move.SCALD, "tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK, "tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK, "tutor"),
                        new MoveLearnSetEntry(Move.SNORE, "tutor"),
                        new MoveLearnSetEntry(Move.STEEL_WING, "tutor"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE, "tutor"),
                        new MoveLearnSetEntry(Move.SURF, "tutor"),
                        new MoveLearnSetEntry(Move.SWAGGER, "tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND, "tutor"),
                        new MoveLearnSetEntry(Move.TOXIC, "tutor"),
                        new MoveLearnSetEntry(Move.UPROAR, "tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE, "tutor"),

                        new MoveLearnSetEntry(Move.BITE, "egg"),
                        new MoveLearnSetEntry(Move.DEFOG, "egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM, "egg"),
                        new MoveLearnSetEntry(Move.HEAD_SMASH, "egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF, "egg"),
                        new MoveLearnSetEntry(Move.SWITCHEROO, "egg")
                ),
                List.of(Label.GEN5,Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 35, 58, 0.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CHERRY_GROVE, Biome.IS_FLORAL, Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"day")
                ), List.of(),
                List.of(SpawnPreset.NEAR_WATER),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Swanna");
        this.setPortraitXYZ(0,1.8,0);
        setCanFly(true);
        setCanSwim(true);
    }
}
