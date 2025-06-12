package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class GastlyX extends Pokemon {
    public GastlyX(String name, Aspect aspect) {
        super(name, aspect,"GastlyX",
                Type.DRAGON,
                new Stats(30, 35, 30, 100, 65, 35),
                List.of(Ability.OBLIVIOUS, Ability.MOLD_BREAKER), Ability.STURDY,
                13, 210,
                new Stats(0,0,0,1,0,0), 45,
                1,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                26, List.of(EggGroup.XENO),
                List.of("Compressed by an enormous pressure, it body is protected by a shell as hard as steel. Nobody knows how it looks inside this shell."),
                List.of(new EvolutionEntry("haunterx", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,4),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,8),
                        new MoveLearnSetEntry(Move.PAYBACK,12),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,16),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,20),
                        new MoveLearnSetEntry(Move.HEADBUTT,28),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,32),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,36),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,40),
                        new MoveLearnSetEntry(Move.SCARY_FACE,44),
                        new MoveLearnSetEntry(Move.OUTRAGE,48),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE, Label.GEN1),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Gastly");

        
        setBaseScale(1.2);
        setHitbox(0.7,1.45);
        getSpeciesFileData().addBasicVariation("IZetyXX");
        getPosingFileData().setAnimationFileName("gastly_x");
        getPosingFileData().setPortraitData( 1.7f, new Vector3(0, .5, 0));
        getPosingFileData().setProfileData( 1.2f, new Vector3(0, 0.8, -20));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().markAsBackupPose(),
                AnimationData.walkingAnimation().withBlink()
        ));
    }
}
