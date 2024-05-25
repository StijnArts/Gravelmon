package drai.dev.gravelmon.pokemon.sage;

import drai.dev.gravelmon.*;
import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Foliat extends Pokemon {
    public Foliat() {
        super("Foliat",
                Type.GRASS,
                new Stats(42, 42, 45, 68, 46, 75),
                List.of(Ability.OVERGROW), Ability.GALE_WINGS,
                3, 15,
                new Stats(0,0,0,0,0,1), 45,
                0.875,
                28, ExperienceGroup.MEDIUM_SLOW,
                70,
                41, List.of(EggGroup.GRASS, EggGroup.FLYING),
                List.of("Although Foliat is unable to fly, it still has an extremely high metabolism. It's often found feeding on sugar-rich nectar and sap found in plants."),
                List.of(new EvolutionEntry("florabri", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.ABSORB,7),
                        new MoveLearnSetEntry(Move.PECK,10),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,13),
                        new MoveLearnSetEntry(Move.PLUCK,16),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,19),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,22),
                        new MoveLearnSetEntry(Move.AGILITY,25),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,28),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,31),
                        new MoveLearnSetEntry(Move.WIND_SHEAR,34),
                        new MoveLearnSetEntry(Move.SYNTHESIS,37),
                        new MoveLearnSetEntry(Move.DRILL_PECK,40),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,43),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,46),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,49),
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
                        new MoveLearnSetEntry(Move.BOUNCE,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.GRASS_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SWIFT,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor"),
                        new MoveLearnSetEntry(Move.LEAF_SHIELD,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"egg"),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,"egg"),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,"egg"),
                        new MoveLearnSetEntry(Move.STUN_SPORE,"egg"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"egg"),
                        new MoveLearnSetEntry(Move.DRILL_PECK,"egg"),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.WHIRLWIND,"egg"),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,"egg")),
                List.of(Label.SAGE),
                2, List.of(
                        new ItemDrop("minecraft:melon_seeds",50, 1,2),
                        new ItemDrop("minecraft:feather",50, 1,2)
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.9, 1,
                List.of());
        this.setHasGenderDifferences(true);
        this.setShoulderMountable(true);
        this.setWillSleepOnBed(true);
        this.setPortraitXYZ(0,1.8,0);
        this.setBaseScale(0.9);
        this.setModeled(true);
    }
}
