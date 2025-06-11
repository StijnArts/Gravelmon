package drai.dev.data.pokemon.blazingemerald;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Muramoth extends Pokemon {
    public Muramoth() {
        super("Muramoth",
                Type.BUG, Type.DARK,
                new Stats(60, 80, 50, 115, 75, 105),
                List.of(Ability.ELUSIVE), Ability.ILLUMINATE,
                UnitConverter.feetToMeters(2, 7), UnitConverter.lbsToKg(836),
                new Stats(0,0,0,1,0,1), 70,
                0.5,
                161, ExperienceGroup.MEDIUM_FAST,
                70,
                51, List.of(EggGroup.BUG),
                List.of("Lucemoth are social and friendly, often times forming close bonds with trainers and Pokemon. They are drawn to bright lights and shiny objects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAKE_TEARS,1),
                        new MoveLearnSetEntry(Move.HYPNOSIS,4),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,12),
                        new MoveLearnSetEntry(Move.ATTRACT,16),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,24),
                        new MoveLearnSetEntry(Move.MOONRAZER,31),
                        new MoveLearnSetEntry(Move.HIVEMIND,36),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,43),
                        new MoveLearnSetEntry(Move.DAZZLE_DUST,49),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm")
                        ),
                List.of(Label.BLAZING_EMERALD),
                0, List.of(),
                new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(31)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SWAMP)
    .duringDaytime()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setBaseScale(1);
        setHitbox(1,1.5);
        getSpeciesFileData().addBasicVariation("El Pigeon");
        getPosingFileData().setPortraitData(1.25f, new Vector3(0.14, 0.67, 0));
        getPosingFileData().setProfileData(.65f, new Vector3(0, 0.77, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose().withLook()
        ));
    }
}
