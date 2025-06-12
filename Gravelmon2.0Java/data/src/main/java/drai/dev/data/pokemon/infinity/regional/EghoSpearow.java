package drai.dev.data.pokemon.infinity.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class EghoSpearow extends Pokemon {
    public EghoSpearow(String name, Aspect aspect) {
        super(name, aspect,"EghoSpearow",
                Type.DARK, Type.FIGHTING,
                new Stats(40, 70, 25, 26, 31, 70),
                List.of(Ability.DEFIANT), Ability.ADAPTABILITY,
                4, 28,
                new Stats(0,1,0,0,0,1), 255,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                39, List.of(EggGroup.FLYING),
                List.of("These Spearow became an invasive species because it had no natural predators. In order to stay at the top of the food chain, it adapted into a vicious predator."),
                List.of(new EvolutionEntry("eghofearow", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BEAT_UP,1),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,5),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,13),
                        new MoveLearnSetEntry(Move.PURSUIT,17),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,21),
                        new MoveLearnSetEntry(Move.AGILITY,24),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,29),
                        new MoveLearnSetEntry(Move.JUMP_KICK,30),
                        new MoveLearnSetEntry(Move.AMBUSH,34),
                        new MoveLearnSetEntry(Move.CRUNCH,38),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,42),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.DRILL_RUN,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.ROOST,"tutor"),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ASTONISH,"egg"),
                        new MoveLearnSetEntry(Move.CROSS_POISON,"egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg")
                        ),
                List.of(Label.INFINITY, Label.GEN1),
                4, List.of(
                        new ItemDrop("minecraft:egg",50, 1,2),
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_HILLS, Biome.IS_TEMPERATE)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Spearow");
        
        
        this.setBaseScale(0.8);
        this.setHitbox(0.6,0.8);
        getSpeciesFileData().addBasicVariation("Porous Mist");
        getPosingFileData().setPortraitData( 3.4f, new Vector3(-0.1, -2, 0));
        getPosingFileData().setProfileData( 1.2f, new Vector3(-0.0, .0, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().markAsBackupPose().withBlink()
        ));
        getPosingFileData().setAnimationFileName("spearow_egho");
    }
}
