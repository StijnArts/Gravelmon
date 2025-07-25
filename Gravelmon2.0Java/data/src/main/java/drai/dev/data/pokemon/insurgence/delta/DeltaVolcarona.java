package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaVolcarona extends Pokemon {
    public DeltaVolcarona(String name, Aspect aspect) {
        super(name, aspect,"DeltaVolcarona",
                Type.DARK, Type.POISON,
                new Stats(85, 60, 65, 135, 105, 100),
                List.of(Ability.LEVITATE), Ability.ABSOLUTION,
                16, 460,
                new Stats(0,0,0,3,0,0), 15,
                0.5,
                275, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("Contact with humans causes it to release lethal toxins into the air for miles. Experiments suggest that it can warp space and summon black holes."),
                List.of(),
                getMoves(),
                List.of(Label.GEN5,Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(50)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Volcarona");

        this.setCanFly();
        this.setBaseScale(0.9);
        this.setHitbox(1,1);


        getSpeciesFileData().addBasicVariation("Iketarou");
        getPosingFileData().setPortraitData( 1.6f, new Vector3(0, .2, 0));
        getPosingFileData().setProfileData( .8f, new Vector3(0, .6, 0));
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().markAsBackupPose()
        ));
    }

    public static List<MoveLearnSetEntry> getMoves(){
        return List.of(
                new MoveLearnSetEntry(Move.HYPERSPACE_HOLE,1),
                new MoveLearnSetEntry(Move.SPACIAL_REND,1),
                new MoveLearnSetEntry(Move.AURA_SPHERE,1),
                new MoveLearnSetEntry(Move.HURRICANE,1),
                new MoveLearnSetEntry(Move.TOXIC_SPIKES,1),
                new MoveLearnSetEntry(Move.SLUDGE_WAVE,1),
                new MoveLearnSetEntry(Move.GUNK_SHOT,1),
                new MoveLearnSetEntry(Move.OUTRAGE,1),
                new MoveLearnSetEntry(Move.TAILWIND,1),
                new MoveLearnSetEntry(Move.DARK_PULSE,1),
                new MoveLearnSetEntry(Move.VENOSHOCK,1),
                new MoveLearnSetEntry(Move.PURSUIT,1),
                new MoveLearnSetEntry(Move.SCARY_FACE,1),
                new MoveLearnSetEntry(Move.GUST,1),
                new MoveLearnSetEntry(Move.ACID_SPRAY,1),
                new MoveLearnSetEntry(Move.ACID_SPRAY,10),
                new MoveLearnSetEntry(Move.GUST,20),
                new MoveLearnSetEntry(Move.INFESTATION,30),
                new MoveLearnSetEntry(Move.WHIRLWIND,40),
                new MoveLearnSetEntry(Move.OMINOUS_WIND,50),
                new MoveLearnSetEntry(Move.AURA_SPHERE,59),
                new MoveLearnSetEntry(Move.SPACIAL_REND,59),
                new MoveLearnSetEntry(Move.HYPERSPACE_HOLE,59),
                new MoveLearnSetEntry(Move.SLUDGE_WAVE,60),
                new MoveLearnSetEntry(Move.DARK_PULSE,70),
                new MoveLearnSetEntry(Move.TOXIC_SPIKES,80),
                new MoveLearnSetEntry(Move.HURRICANE,90),
                new MoveLearnSetEntry(Move.EXPLOSION,100),
                new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                new MoveLearnSetEntry(Move.TOXIC,"tm"),
                new MoveLearnSetEntry(Move.HAIL,"tm"),
                new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                new MoveLearnSetEntry(Move.TAUNT,"tm"),
                new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                new MoveLearnSetEntry(Move.PROTECT,"tm"),
                new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                new MoveLearnSetEntry(Move.SNATCH,"tm"),
                new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                new MoveLearnSetEntry(Move.THUNDER,"tm"),
                new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                new MoveLearnSetEntry(Move.RETURN,"tm"),
                new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                new MoveLearnSetEntry(Move.TORMENT,"tm"),
                new MoveLearnSetEntry(Move.FACADE,"tm"),
                new MoveLearnSetEntry(Move.REST,"tm"),
                new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                new MoveLearnSetEntry(Move.THIEF,"tm"),
                new MoveLearnSetEntry(Move.ROOST,"tm"),
                new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                new MoveLearnSetEntry(Move.NEW_MOON,"tm"),
                new MoveLearnSetEntry(Move.EMBARGO,"tm"),
                new MoveLearnSetEntry(Move.EXPLOSION,"tm"),
                new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                new MoveLearnSetEntry(Move.JET_STREAM,"tm"),
                new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                new MoveLearnSetEntry(Move.VENOSHOCK,"tm"),
                new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                new MoveLearnSetEntry(Move.UTURN,"tm"),
                new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                new MoveLearnSetEntry(Move.DRACO_JET,"tm"),
                new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                new MoveLearnSetEntry(Move.LUNAR_CANNON,"tm"),
                new MoveLearnSetEntry(Move.INCINERATE,"tm"),
                new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                new MoveLearnSetEntry(Move.ROUND,"tm"),
                new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                new MoveLearnSetEntry(Move.SNARL,"tm"),
                new MoveLearnSetEntry(Move.CORRODE,"tm"),
                new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                new MoveLearnSetEntry(Move.QUASH,"tm"),
                new MoveLearnSetEntry(Move.WILDFIRE,"tm"),
                new MoveLearnSetEntry(Move.DARK_MATTER,"tm"),
                new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                new MoveLearnSetEntry(Move.FLASH,"tm"),
                new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                new MoveLearnSetEntry(Move.FLY,"tm"),
                new MoveLearnSetEntry(Move.SURF,"tm"),
                new MoveLearnSetEntry(Move.ACID,"tutor"),
                new MoveLearnSetEntry(Move.AIR_CUTTER,"tutor"),
                new MoveLearnSetEntry(Move.ANCIENT_POWER,"tutor"),
                new MoveLearnSetEntry(Move.AURA_SPHERE,"tutor"),
                new MoveLearnSetEntry(Move.DEFOG,"tutor"),
                new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                new MoveLearnSetEntry(Move.EARTH_POWER,"tutor"),
                new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                new MoveLearnSetEntry(Move.FOUL_PLAY,"tutor"),
                new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                new MoveLearnSetEntry(Move.GRAVITY,"tutor"),
                new MoveLearnSetEntry(Move.GUNK_SHOT,"tutor"),
                new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                new MoveLearnSetEntry(Move.HURRICANE,"tutor"),
                new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                new MoveLearnSetEntry(Move.KNOCK_OFF,"tutor"),
                new MoveLearnSetEntry(Move.METEOR_MASH,"tutor"),
                new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                new MoveLearnSetEntry(Move.MORNING_SUN,"tutor"),
                new MoveLearnSetEntry(Move.OMINOUS_WIND,"tutor"),
                new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                new MoveLearnSetEntry(Move.SELFDESTRUCT,"tutor"),
                new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                new MoveLearnSetEntry(Move.SKY_ATTACK,"tutor"),
                new MoveLearnSetEntry(Move.SNORE,"tutor"),
                new MoveLearnSetEntry(Move.SPACIAL_REND,"tutor"),
                new MoveLearnSetEntry(Move.SPITE,"tutor"),
                new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                new MoveLearnSetEntry(Move.TWISTER,"tutor"),
                new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                new MoveLearnSetEntry(Move.WHIRLPOOL,"tutor"),
                new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tutor")
        );
    }
}
