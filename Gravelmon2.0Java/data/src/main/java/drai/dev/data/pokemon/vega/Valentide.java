package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Valentide extends Pokemon {
    public Valentide() {
        super( "Valentide",
                Type.WATER, Type.NORMAL,
                new Stats(73	,
                        45	,
                        65	,
                        75,
                        75	,
                        127),
                List.of(Ability.SWIFT_SWIM), Ability.HEALER,
                12, 174,
                new Stats(0,0,0,0,0,2), 95,
                0.5,
                190, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.WATER_2),
                List.of("The power of love caused it to grow. Seeing one is a sign that you will soon meet the love of your life."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.WEATHER_BALL,1),
                        new MoveLearnSetEntry(Move.CHARM,4),
                        new MoveLearnSetEntry(Move.WATER_GUN,7),
                        new MoveLearnSetEntry(Move.AGILITY,9),
                        new MoveLearnSetEntry(Move.TONEDEAF,14),
                        new MoveLearnSetEntry(Move.PSYCH_UP,17),
                        new MoveLearnSetEntry(Move.UPROAR,22),
                        new MoveLearnSetEntry(Move.ATTRACT,27),
                        new MoveLearnSetEntry(Move.HEART_STAMP,31),
                        new MoveLearnSetEntry(Move.CALM_MIND,37),
                        new MoveLearnSetEntry(Move.FROSTBITE,40),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46),
                        new MoveLearnSetEntry(Move.SAFEGUARD,51),
                        new MoveLearnSetEntry(Move.BLIZZARD,55),
                        new MoveLearnSetEntry(Move.DELUGE,59),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.AQUA_BOLT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.BATON_PASS,"tm"),
                        new MoveLearnSetEntry(Move.DISCHARGE,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,"tutor"),
                        new MoveLearnSetEntry(Move.REST,"tutor"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.WAVE_SPLASH,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_NOISE,"tutor"),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_JET,"egg"),
                        new MoveLearnSetEntry(Move.BOUNCE,"egg"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"egg"),
                        new MoveLearnSetEntry(Move.DIVE,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"egg"),
                        new MoveLearnSetEntry(Move.HAIL,"egg"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"egg"),
                        new MoveLearnSetEntry(Move.MIST,"egg"),
                        new MoveLearnSetEntry(Move.MUD_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.PROTECT,"egg"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"egg"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.SPLASH,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.SWIFT,"egg"),
                        new MoveLearnSetEntry(Move.UPROAR,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPORT,"egg"),
                        new MoveLearnSetEntry(Move.WATER_SPOUT,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(29)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.REEF)
    .build(), List.of());
	
        this.setPreEvolution("luvdisc");
        setAvoidsLand(true);
        setCanBreathUnderwater(true);
        setCanSwim(true);
        addAdditionalEvolution("luvdisc", new EvolutionEntry("valentide", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"160"))));
        setAvoidsLand(true);
        setCanBreathUnderwater(true);
        setCanSwim(true);
        
        setBaseScale(1);
        setHitbox(1,1);
        getSpeciesFileData().addBasicVariation("SodaPhillium");
        getPosingFileData().setAnimationFileName("luvdisc");
        getPosingFileData().setPortraitData( 1f, new Vector3(0.1, 0, 0));
        getPosingFileData().setProfileData( 1f, new Vector3(0.1, 0, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withBlink().markAsBackupPose(),
                AnimationData.walkingAnimation().withBlink(),
                AnimationData.sleepingAnimation().notInWater(),
                AnimationData.waterSleepingAnimation(),
                AnimationData.swimmingAnimation().withBlink(),
                AnimationData.floatingAnimation().withBlink()
        ));
        getPosingFileData().setFaint("q.bedrock_primary('luvdisc', 'water_faint', q.curve('one'))");
        getPosingFileData().setPhysical("q.bedrock_primary('luvdisc', 'physical', q.curve('symmetrical_wide'))");
        getPosingFileData().setSpecial("q.bedrock_primary('luvdisc', 'special', q.curve('symmetrical_wide'))");

    }
}
