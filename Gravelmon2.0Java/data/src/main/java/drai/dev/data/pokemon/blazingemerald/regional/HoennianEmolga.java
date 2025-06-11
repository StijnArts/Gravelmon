package drai.dev.data.pokemon.blazingemerald.regional;

import com.cobblemon.mod.common.entity.*;
import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianEmolga extends Pokemon {
    public HoennianEmolga(String name, Aspect aspect) {
        super(name, aspect,"HoennianEmolga",
                Type.GHOST, Type.FLYING,
                new Stats(75, 95, 65, 45, 90, 123),
                List.of(Ability.SKY_SCOURGE), Ability.NEFARIOUS,
                4, 50,
                new Stats(0,0,0,0,0,2), 200,
                0.5,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Emolga swoop down from the sky in an effort to frighten townsfolk. Due to their adorable appearance, however, they are rarely successful."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEECH_LIFE,1),
                        new MoveLearnSetEntry(Move.MIST,3),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,7),
                        new MoveLearnSetEntry(Move.VEILED_SKY,13),
                        new MoveLearnSetEntry(Move.AIR_SLASH,21),
                        new MoveLearnSetEntry(Move.SPECTRAL_SAP,31),
                        new MoveLearnSetEntry(Move.HYPER_FANG,43),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.VEILED_SKY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN5),
                4, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(12)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setCanFly(true);
        this.setLangFileName("Emolga");

        getSpeciesFileData().addBasicVariation("Drai");
        getPosingFileData().setAnimationFileName("emolga_hoennian");
        getPosingFileData().setPortraitData(2.2f, new Vector3(-0.2, 0.3, 0));
        getPosingFileData().setProfileData(0.8f, new Vector3(0.1, 0.8, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().withLook().addPoseType(PoseType.WALK),
                AnimationData.flyingAnimation().withBlink().withLook(),
                AnimationData.hoveringAnimation().withBlink().withLook()
        ));
        
        this.setBaseScale(0.52);
        this.setHitbox(0.6,0.6);
    }
}
