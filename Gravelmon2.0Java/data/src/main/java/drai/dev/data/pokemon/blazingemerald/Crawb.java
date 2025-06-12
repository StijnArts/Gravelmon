package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Crawb extends Pokemon {
    public Crawb() {
        super("Crawb",
                Type.STEEL, Type.WATER,
                new Stats(100,120,120,80,100,80),
                List.of(Ability.MAGNET_PULL, Ability.TACTICIAN), Ability.TACTICIAN,
                5, 150,
                new Stats(0,1,1,0,1,0), 3,
                -1,
                540, ExperienceGroup.SLOW,
                70,
                39, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanBreathUnderwater(true);

        setLangFileName("C.R.A.W.B.");
        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("El Pigeon");
        getPosingFileData().setPortraitData(1.92f, new Vector3(0.03, -1.56, 0));
        getPosingFileData().setProfileData(.93f, new Vector3(-0.07, -0.03, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation("El Pigeon").markAsBackupPose()
        ));
    }
}
