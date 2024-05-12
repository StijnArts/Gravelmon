package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class ShyleonTerrestrial extends Pokemon {
    public ShyleonTerrestrial(int dexNo) {
        super(dexNo,"ShyleonTerrestrial",
                Type.GRASS, Type.FAIRY,
                new Stats(88, 49, 63, 78, 68, 104),
                List.of(Ability.QUICK_FEET), Ability.JUNGLE_SPIRIT,
                8, 225,
                new Stats(0,0,0,0,0,2), 45,
                -1,
                64, ExperienceGroup.SLOW,
                70,
                41, List.of(EggGroup.UNDISCOVERED),
                List.of("The Red Energy enhanced its ability to camouflage. It is almost impossible to detect Shyleon in its habitat."),
                List.of(new EvolutionEntry("shyleon", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of()),
                        new EvolutionEntry("shyleonxenoversal", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"gravelmon:xenoversal_ring\""))),
                        new EvolutionEntry("shyleonastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"gravelmon:terrestrial_ring\""),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50"))),new EvolutionEntry("shyleonastral", EvolutionType.LEVEL_UP, false, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM, "\"gravelmon:xenoversal_ring\""),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL, "50")))),
                List.of(
                        new MoveLearnSetEntry(Move.TEETER_DANCE,1),
                        new MoveLearnSetEntry(Move.PSYCH_UP,1),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,1),
                        new MoveLearnSetEntry(Move.LUNAR_DANCE,1),
                        new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,8),
                        new MoveLearnSetEntry(Move.GROWTH,13),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,17),
                        new MoveLearnSetEntry(Move.LEAF_TORNADO,21),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,25),
                        new MoveLearnSetEntry(Move.AGILITY,28),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,32),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,36),
                        new MoveLearnSetEntry(Move.MAGIC_WALL,38),
                        new MoveLearnSetEntry(Move.SYNTHESIS,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,45),
                        new MoveLearnSetEntry(Move.EARTH_POWER,48),
                        new MoveLearnSetEntry(Move.LUNAR_DANCE,51),
                        new MoveLearnSetEntry(Move.GRASS_WHISTLE,56),
                        new MoveLearnSetEntry(Move.LEAF_STORM,61),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.PSYCH_UP,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.BENEVOLENCE,"tutor"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.FAIRY_PLEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.FRENZY_PLANT,"tutor"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tutor"),
                        new MoveLearnSetEntry(Move.HAWTHORNS,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_ROOM,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_WALL,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.STAR_BURST,"tutor"),
                        new MoveLearnSetEntry(Move.SYNTHESIS,"tutor"),
                        new MoveLearnSetEntry(Move.WORRY_SEED,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 3, 22, 0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.9, 1,
                List.of());
        this.setLangFileName("Shyleon");
        this.setPortraitXYZ(0.1,2.0,0.0);
        this.setCanFly(true);
        this.setModeled(true);
        this.setHitbox(0.7, 1.1);
        this.setBaseScale(1);
    }
}
