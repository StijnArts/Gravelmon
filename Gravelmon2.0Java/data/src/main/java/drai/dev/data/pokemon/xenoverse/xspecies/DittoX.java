package drai.dev.data.pokemon.xenoverse.xspecies;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DittoX extends Pokemon {
    public DittoX(String name, Aspect aspect) {
        super(name, aspect,"DittoX",
                Type.DARK,
                new Stats(48, 48,48,48,48,48),
                List.of(Ability.LIMBER), Ability.IMPOSTER,
                3, 40,
                new Stats(1,0,0,0,0,0), 35,
                0.875,
                101, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.DITTO_X),
                List.of("Following a great number of experiments, it became extremely unstable, but it developed the ability to Transform even without seeing its target."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.X_TRANSFORM,1),
                        new MoveLearnSetEntry(Move.TRANSFORM,1)
                        ),
                List.of(Label.XENOVERSE, Label.GEN1),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 70, 75, 3.3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.21, 0.3,
                List.of());
        this.setLangFileName("Ditto");

        
        this.setBaseScale(1);
        this.setHitbox(0.5,0.6);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setAnimationFileName("ditto_x");
        getPosingFileData().setPortraitData( 1.9f, new Vector3(0, .5, 0));
        getPosingFileData().setProfileData( .72f, new Vector3(0, 0.6, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().clearPoseTypes(),
                AnimationData.walkingAnimation().withLook()
        ));
    }
}
