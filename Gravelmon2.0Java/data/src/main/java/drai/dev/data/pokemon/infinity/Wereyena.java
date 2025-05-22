package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wereyena extends Pokemon {
    public Wereyena() {
        super("Wereyena",
                Type.DARK, Type.FAIRY,
                new Stats(80, 136, 70, 77, 70, 102),
                List.of(Ability.INTIMIDATE, Ability.QUICK_FEET), Ability.MOXIE,
                23, 1080,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                197, ExperienceGroup.MEDIUM_SLOW,
                70,
                39, List.of(EggGroup.FIELD),
                List.of("In rare occasion, when Mightyena are exposed to pure moonlight, they will evolve into Wereyena. Legends said that these Pokemon were just transformed humans."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MOONBLAST,1),
                        new MoveLearnSetEntry(Move.EMBARGO,1),
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HOWL,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.SUPER_FANG,5),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,9),
                        new MoveLearnSetEntry(Move.DARK_PULSE,13),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,17),
                        new MoveLearnSetEntry(Move.ROAR,22),
                        new MoveLearnSetEntry(Move.SWAGGER,27),
                        new MoveLearnSetEntry(Move.ASSURANCE,32),
                        new MoveLearnSetEntry(Move.SCARY_FACE,37),
                        new MoveLearnSetEntry(Move.TAUNT,42),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,47),
                        new MoveLearnSetEntry(Move.THRASH,52),
                        new MoveLearnSetEntry(Move.CRUNCH,57),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,62),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,67),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,72),
                        new MoveLearnSetEntry(Move.MOONLIGHT,77),
                        new MoveLearnSetEntry(Move.FAENG_RUSH,82),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FAENG_RUSH,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.MOONBLAST,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.TACKLE,"tutor"),
                        new MoveLearnSetEntry(Move.HOWL,"tutor"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.BITE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,"tutor"),
                        new MoveLearnSetEntry(Move.ASSURANCE,"tutor"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tutor"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tutor"),
                        new MoveLearnSetEntry(Move.THRASH,"tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tutor"),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,"tutor"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"tutor"),
                        new MoveLearnSetEntry(Move.ASTONISH,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"egg"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"egg"),
                        new MoveLearnSetEntry(Move.LEER,"egg"),
                        new MoveLearnSetEntry(Move.ME_FIRST,"egg"),
                        new MoveLearnSetEntry(Move.POISON_FANG,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"egg"),
                        new MoveLearnSetEntry(Move.YAWN,"egg")
                        ),
                List.of(Label.INFINITY),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 34, 47, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.39, 0.3,
                List.of());
        
        this.setPreEvolution("mightyena");
        addAdditionalEvolution("mightyena", new EvolutionEntry("wereyena", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:moon_stone"));

        setBaseScale(.9);
        setHitbox(1,2);
        getSpeciesFileData().addBasicVariation("El Pigeon");
        getPosingFileData().setPortraitData(1f, new Vector3(-.57, 1.64, 0));
        getPosingFileData().setProfileData(.52f, new Vector3(-0.06, 1.04, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose().withLook()
        ));
    }
}
