package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaDitto extends Pokemon {
    public DeltaDitto(String name, Aspect aspect) {
        super(name, aspect,"DeltaDitto",
                Type.WATER,
                new Stats(48, 48,48,48,48,48),
                List.of(Ability.PROTEAN), Ability.PROTEAN,
                3, 40,
                new Stats(1, 0, 0, 0, 0, 0), 35,
                0.5,
                100, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DELTA_DITTO, EggGroup.DITTO),
                List.of("A Delta Species discovered by EchoTheThird. When rearranging its cell structure to transform itself, it sometimes makes a mistake and becomes a different type."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TRANSFORM,1),
                        new MoveLearnSetEntry(Move.MORPH,1),
                        new MoveLearnSetEntry(Move.RETROGRADE,1),
                        new MoveLearnSetEntry(Move.METRONOME,10),
                        new MoveLearnSetEntry(Move.COPYCAT,20),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,30),
                        new MoveLearnSetEntry(Move.ME_FIRST,40),
                        new MoveLearnSetEntry(Move.MIMIC,50),
                        new MoveLearnSetEntry(Move.METRONOME,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor")
                        ),
                List.of(Label.GEN1, Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(12)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Ditto");
        
        
        this.setBaseScale(1);
        this.setHitbox(0.5,0.6);
        getSpeciesFileData().addBasicVariation("Maliant");
        getPosingFileData().setPortraitData( 2.1f, new Vector3(-0, -1.5, 0));
        getPosingFileData().setProfileData( 1f, new Vector3(0, .2, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().markAsBackupPose().withBlink(),
                AnimationData.walkingAnimation().withLook().withBlink()
        ));
        getPosingFileData().setFaint("bedrock(deltaditto, faint)");
    }
}
