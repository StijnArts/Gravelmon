package drai.dev.data.pokemon.sage;

import drai.dev.data.attributes.*;
import drai.dev.data.attributes.assets.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Floressum extends Pokemon {
    public Floressum() {
        super("Floressum",
                Type.GRASS, Type.FLYING,
                new Stats(75, 70, 73, 105, 85, 120),
                List.of(Ability.OVERGROW), Ability.GALE_WINGS,
                14, 179,
                new Stats(0,0,0,1,0,2), 45,
                0.875,
                238, ExperienceGroup.MEDIUM_SLOW,
                70,
                41, List.of(EggGroup.GRASS, EggGroup.FLYING),
                List.of("Floressum can synthesize energy with its symbiotic flower. By rapidly flapping its wings, it can create gusts of wind comparable to a tropical storm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.JET_STRIKE,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.GUST,10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,16),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,20),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,24),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.TEMPEST,32),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,36),
                        new MoveLearnSetEntry(Move.WIND_SHEAR,40),
                        new MoveLearnSetEntry(Move.SYNTHESIS,44),
                        new MoveLearnSetEntry(Move.AIR_SLASH,48),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,52),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,56),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.DREAM_EATER,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor"),
                        new MoveLearnSetEntry(Move.GROWTH,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.ROOST,"egg"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"egg"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg")
                ),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:melon_seeds",50, 1,2),
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 16, 38, 0.2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                1, 0.5,
                List.of());
        this.setHasGenderDifferences(true);
        this.setCanFly(true);


        this.setBaseScale(1);

        getSpeciesFileData().addBasicVariation(this);
        getPosingFileData().setPortraitData( 2.8f, new Vector3(-0.47, -.88, 0));
        getPosingFileData().setProfileData( .9f, new Vector3(0.1, .38, 0));
        getPosingFileData().setBasicHead();
        getPosingFileData().addAnimations(List.of(
                AnimationData.standingAnimation().withLook().withBlink().markAsBackupPose(),
                AnimationData.hoveringAnimation().withLook().withBlink(),
                AnimationData.flyingAnimation().withLook().withBlink(),
                AnimationData.sleepingAnimation()
        ));
    }
}
