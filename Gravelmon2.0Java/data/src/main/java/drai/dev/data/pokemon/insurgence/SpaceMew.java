package drai.dev.data.pokemon.insurgence;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class SpaceMew  extends Pokemon {
    public SpaceMew(String name, Aspect aspect) {
        super(name, aspect, "SpaceMew",
                Type.PSYCHIC,
                new Stats(600, StatArchetype.ALL_ROUND, List.of()),
                List.of(Ability.SYNCHRONIZE), Ability.SYNCHRONIZE,
                4, 40,
                new Stats(3, 0, 0, 0, 0, 0), 45,
                -1,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.GEN1, Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        setCanFly(true);
        setSkipMoves(true);

        this.setBaseScale(1);
        this.setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("Maliant");
        getPosingFileData().setPortraitData( 3.5f, new Vector3(-.8, -.25, 0));
        getPosingFileData().setProfileData( .85f, new Vector3(0, .4, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose()
        ));
    }
}
