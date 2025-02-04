package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianUrsaring extends Pokemon {
    public HoennianUrsaring(String name, Aspect aspect) {
        super(name, aspect,"HoennianUrsaring",
                Type.NORMAL, Type.FIRE,
                new Stats(70, 120,90,55,85,80),
                List.of(Ability.TOUGH_CLAWS), Ability.GUTS,
                18, 1258,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Ursaring gather food from trees using their lengthy, extendable tongues. It's fearsome claws are actually intended to aid in peeling hard-skinned fruits."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.FURY_SWIPES,7),
                        new MoveLearnSetEntry(Move.MEAN_LOOK,13),
                        new MoveLearnSetEntry(Move.THRASH,19),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,25),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,30),
                        new MoveLearnSetEntry(Move.SLASH,37),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,43),
                        new MoveLearnSetEntry(Move.WILD_ROAR,49),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,"egg")
                ),
                List.of(Label.GEN2,Label.BLAZING_EMERALD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 12, 27, 0.18, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        this.setLangFileName("Ursaring");
        
        this.setHitbox(0.7, 2.14);
        this.setBaseScale(1.1);
        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setAnimationFileName("ursaring_hoennian");
        getPosingFileData().setPortraitData( 2.1f, new Vector3(-0.1, 1.6, 0.0));
        getPosingFileData().setProfileData( .65f, new Vector3(0.0, 0.7, 0.0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().notBattle().withBlink().markAsBackupPose()
        ));
    }
}
