package drai.dev.data.pokemon.infinity.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class EghoHoothoot extends Pokemon {
    public EghoHoothoot(String name, Aspect aspect) {
        super(name, aspect,"EghoHoothoot",
                Type.DARK, Type.FLYING,
                new Stats(60, 30, 40, 56, 36, 40),
                List.of(Ability.UNNERVE), Ability.NO_GUARD,
                9, 235,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.FLYING),
                List.of("The crescent on its head glows brightest when the moon is full. It can confuse prey by convincing them that the moon is coming right at them when it's really just bird."),
                List.of(new EvolutionEntry("eghonoctowl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.GUST,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,5),
                        new MoveLearnSetEntry(Move.CONFUSION,9),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,13),
                        new MoveLearnSetEntry(Move.HORN_ATTACK,17),
                        new MoveLearnSetEntry(Move.NIGHTMARE,21),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,25),
                        new MoveLearnSetEntry(Move.SNARL,29),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,33),
                        new MoveLearnSetEntry(Move.MOONBLAST,36),
                        new MoveLearnSetEntry(Move.SNATCH,41),
                        new MoveLearnSetEntry(Move.NIGHT_DAZE,44),
                        new MoveLearnSetEntry(Move.ROOST,47),
                        new MoveLearnSetEntry(Move.DREAM_EATER,51),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,58),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DEFOG,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.ROOST,"tutor"),
                        new MoveLearnSetEntry(Move.AGILITY,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.MEGAHORN,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"egg"),
                        new MoveLearnSetEntry(Move.MOONLIGHT,"egg"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN2),
                4, List.of(
                        new ItemDrop("minecraft:egg",50, 1,2),
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Hoothoot");
        
        setCanFly(true);
        
        setBaseScale(0.8);
        setHitbox(0.8,1.0);
        this.setNeedsRemodel("Updated animations in cobblemon model repo");
        getSpeciesFileData().addBasicVariation("Drai");
        getPosingFileData().setPortraitData( 1.9f, new Vector3(-0.2, -.5, -10.0));
        getPosingFileData().setProfileData( 1f, new Vector3(0.0, .3, 0.0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().markAsBackupPose(),
                AnimationData.flyingAnimation().clearAnimations()
                        .addAnimation("q.sine_wing_flap(0.9, 0.9, 0, 'z', 'wing_left', 'wing_right')")
                        .withBlink(),
                AnimationData.sleepingAnimation()
        ));
        getPosingFileData().setCry("q.bedrock_stateful('eghohoothoot', 'cry')");
    }
}