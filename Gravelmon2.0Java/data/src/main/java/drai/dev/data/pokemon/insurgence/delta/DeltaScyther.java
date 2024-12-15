package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaScyther extends Pokemon {
    public DeltaScyther(String name, Aspect aspect) {
        super(name, aspect,"DeltaScyther",
                Type.ICE, Type.FIGHTING,
                new Stats(70, 110, 80, 55, 80, 105),
                List.of(Ability.HUSTLE, Ability.ICE_CLEATS), Ability.SUPER_LUCK,
                15, 560,
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                100, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by EchoTheThird. Its scythes are immensely sharp but also very fragile, and can easily be shattered when hit from the side."),
                List.of(new EvolutionEntry("deltascizor", EvolutionType.LEVEL_UP, true, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "cobblemon:never_melt_ice")))),
                List.of(
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.HAZE,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,5),
                        new MoveLearnSetEntry(Move.PURSUIT,9),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,13),
                        new MoveLearnSetEntry(Move.AGILITY,17),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,21),
                        new MoveLearnSetEntry(Move.ICE_BALL,25),
                        new MoveLearnSetEntry(Move.SLASH,29),
                        new MoveLearnSetEntry(Move.BLIZZARD,33),
                        new MoveLearnSetEntry(Move.HAIL,37),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,41),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,45),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,49),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,53),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,57),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,61),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.JET_STREAM,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.PERMAFROST,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tutor"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor")
                        ),
                List.of(Label.GEN1,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 20, 45, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.34, 0.3,
                List.of());
        this.setLangFileName("Scyther");
        
        this.setBaseScale(0.8);
        this.setHitbox(0.9,2);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 2.3f, new Vector3(-.4, 1.5, 0));
        getPosingFileData().setProfileData( 0.7f, new Vector3(0, .7, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().clearPoseTypes(),
                AnimationData.walkingAnimation().withLook()
        ));
    }
}
