package com.gravelmon.common.gravelmon.pokemon.vega;

import com.gravelmon.common.gravelmon.pokemon.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.*;
import com.gravelmon.common.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Tentyrant extends Pokemon {
    public Tentyrant(int dexNo) {
        super(dexNo, "Tentyrant",
                Type.WATER, Type.DARK,
                new Stats(90, 70, 65, 95, 135, 110),
                List.of(Ability.CLEAR_BODY, Ability.IMMUNITY), Ability.RAIN_DISH,
                23, 785,
                new Stats(0,0,0,0,3,0), 45,
                0.5,
                238, ExperienceGroup.SLOW,
                35,
                50, List.of(EggGroup.WATER_3),
                List.of("It lives in the pitch-black depths of the ocean, so it uses echolocation instead of its vestigial eyes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.SUPERSONIC,1),
                        new MoveLearnSetEntry(Move.CONSTRICT,1),
                        new MoveLearnSetEntry(Move.DELUGE,1),
                        new MoveLearnSetEntry(Move.ACID,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,19),
                        new MoveLearnSetEntry(Move.TAUNT,26),
                        new MoveLearnSetEntry(Move.VENGEANCE,38),
                        new MoveLearnSetEntry(Move.DEVASTATE,47),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,61),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.DEVASTATE,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.BUBBLE,"egg"),
                        new MoveLearnSetEntry(Move.DIVE,"egg"),
                        new MoveLearnSetEntry(Move.FLAIL,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"egg"),
                        new MoveLearnSetEntry(Move.HAIL,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_COAT,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,"egg"),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"egg"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"egg"),
                        new MoveLearnSetEntry(Move.SCALD,"egg"),
                        new MoveLearnSetEntry(Move.SLAM,"egg"),
                        new MoveLearnSetEntry(Move.SNATCH,"egg"),
                        new MoveLearnSetEntry(Move.TICKLE,"egg"),
                        new MoveLearnSetEntry(Move.WATER_GUN,"egg"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"egg")
                        ),
                List.of(Label.VEGA),
                0, List.of(), SpawnContext.SUBMERGED, SpawnPool.RARE, 39, 49, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false"),
                        new SpawnCondition(SpawnConditionType.MAXY, "30")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.4, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setModeled(true);
        this.setBaseScale(1.9);
        this.setCanSwim(true);
        this.setAvoidsLand(true);
        this.setSwimSpeed(0.2);
        this.setCanBreathUnderwater(true);
        this.setHitbox(1.3,1.3);
        //        this.setPreEvolution("tentacruel");
    }
}
