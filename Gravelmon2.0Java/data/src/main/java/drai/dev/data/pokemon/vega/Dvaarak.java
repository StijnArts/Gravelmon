package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class Dvaarak extends Pokemon {
    public Dvaarak() {
        super("Dvaarak",
                Type.GROUND, Type.STEEL,
                new Stats(86, 110, 70, 55, 50, 94),
                List.of(Ability.ARENA_TRAP), Ability.SAND_VEIL,
                7, 536,
                new Stats(0,1,0,0,0,0), 75,
                0.5,
                83, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.MINERAL),
                List.of("It uses the drill on its nose to dig burrows and pitfalls. Its eyes are so weak, it can barely see anything."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,6),
                        new MoveLearnSetEntry(Move.SCREECH,10),
                        new MoveLearnSetEntry(Move.METAL_CLAW,15),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,19),
                        new MoveLearnSetEntry(Move.SANDSTORM,24),
                        new MoveLearnSetEntry(Move.SONIC_SAND,28),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,33),
                        new MoveLearnSetEntry(Move.SLASH,37),
                        new MoveLearnSetEntry(Move.DRILL_RUN,42),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,46),
                        new MoveLearnSetEntry(Move.STONE_EDGE,51),
                        new MoveLearnSetEntry(Move.METAL_SOUND,55),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,60),
                        new MoveLearnSetEntry(Move.HORN_DRILL,64),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.POISON_JAB,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.DIAMOND_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.MAGNET_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.RAID,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_RESOLVE,"tutor"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAMP,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_SPARK,"tutor"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.BURROW,"egg"),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,"egg"),
                        new MoveLearnSetEntry(Move.DIG,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"egg"),
                        new MoveLearnSetEntry(Move.FACADE,"egg"),
                        new MoveLearnSetEntry(Move.FAKE_OUT,"egg"),
                        new MoveLearnSetEntry(Move.FISSURE,"egg"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"egg"),
                        new MoveLearnSetEntry(Move.GEO_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,"egg"),
                        new MoveLearnSetEntry(Move.GUNK_SHOT,"egg"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"egg"),
                        new MoveLearnSetEntry(Move.KARATE_CHOP,"egg"),
                        new MoveLearnSetEntry(Move.MAGNITUDE,"egg"),
                        new MoveLearnSetEntry(Move.METAL_BLAST,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,"egg"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"egg"),
                        new MoveLearnSetEntry(Move.SAND_TOMB,"egg"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"egg"),
                        new MoveLearnSetEntry(Move.STARDUST,"egg"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.SWAGGER,"egg"),
                        new MoveLearnSetEntry(Move.WORK_UP,"egg"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"egg")
                        ),
                List.of(Label.DENEB),
                0, List.of(), SpawnContext.GROUNDED, SpawnPool.RARE, 16, 44, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());

        
        this.setBaseScale(0.7);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 1.6f, new Vector3(-.6, .6, 0));
        getPosingFileData().setProfileData( .7f, new Vector3(0, .6, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().markAsBackupPose(),
                AnimationData.walkingAnimation().withLook()
        ));
    }
}
