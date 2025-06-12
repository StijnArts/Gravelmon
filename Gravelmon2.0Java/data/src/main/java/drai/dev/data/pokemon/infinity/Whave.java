package drai.dev.data.pokemon.infinity;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Whave extends Pokemon {
    public Whave() {
        super("Whave",
                Type.WATER,
                new Stats(90, 80, 75, 50, 60, 70),
                List.of(Ability.HYDRATION, Ability.CLEAR_BODY), Ability.PRANKSTER,
                11, 1240,
                new Stats(2,0,0,0,0,0), 60,
                0.875,
                120, ExperienceGroup.SLOW,
                70,
                62, List.of(EggGroup.WATER_2, EggGroup.FIELD),
                List.of("An outgoing whale Pokemon that generally dwells in the deep seas. It is playful with other Pokemon as long as it's not battling."),
                List.of(new EvolutionEntry("orcabyss", EvolutionType.LEVEL_UP, List.of(new MoveLearnSetEntry(Move.CALM_MIND, "")),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"52")))),
                List.of(
                        new MoveLearnSetEntry(Move.AQUA_JET,1),
                        new MoveLearnSetEntry(Move.FLING,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FORESIGHT,7),
                        new MoveLearnSetEntry(Move.WATER_GUN,11),
                        new MoveLearnSetEntry(Move.AQUA_RING,15),
                        new MoveLearnSetEntry(Move.BUBBLE_BEAM,18),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,22),
                        new MoveLearnSetEntry(Move.MIST,24),
                        new MoveLearnSetEntry(Move.MUDDY_WATER,27),
                        new MoveLearnSetEntry(Move.TAUNT,30),
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,32),
                        new MoveLearnSetEntry(Move.SURF,37),
                        new MoveLearnSetEntry(Move.HAZE,41),
                        new MoveLearnSetEntry(Move.BOUNCE,46),
                        new MoveLearnSetEntry(Move.DIVE,49),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,54),
                        new MoveLearnSetEntry(Move.SOAK,58),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,64),
                        new MoveLearnSetEntry(Move.RECOVER,69),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,75),
                        new MoveLearnSetEntry(Move.MEMENTO,80),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.TORMENT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.QUASH,"tm"),
                        new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                        new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.RETALIATE,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.BRAIN_STORM,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_FLOOD,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DEFOG,"egg"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"egg"),
                        new MoveLearnSetEntry(Move.ENCORE,"egg"),
                        new MoveLearnSetEntry(Move.GUARD_SWAP,"egg"),
                        new MoveLearnSetEntry(Move.ICE_SHARD,"egg"),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,"egg"),
                        new MoveLearnSetEntry(Move.POWER_SWAP,"egg"),
                        new MoveLearnSetEntry(Move.SNARL,"egg")
                        ),
                List.of(Label.SAGE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(5)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_OCEAN)
    .setAntiBiomes(Biome.IS_TEMPERATE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        setCanWalkOnWater(true);

        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("El Pigeon");
        getPosingFileData().setPortraitData(1.84f, new Vector3(-0.5, -1.25, 0));
        getPosingFileData().setProfileData(.68f, new Vector3(.2, 0.5, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().withCry(),
                AnimationData.walkingAnimation().withBlink().withCry(),
                AnimationData.swimmingAnimation().withBlink().withCry(),
                AnimationData.floatingAnimation().withBlink().withCry(),
                AnimationData.surfaceFloatingAnimation().withBlink().withCry(),
                AnimationData.surfaceSwimmingAnimation().withBlink().withCry()
        ));
    }
}
