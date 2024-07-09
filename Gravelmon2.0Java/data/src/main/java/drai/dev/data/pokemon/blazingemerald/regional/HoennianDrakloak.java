package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;

import java.util.*;

public class HoennianDrakloak extends Pokemon {
    public HoennianDrakloak(String name, Aspect aspect) {
        super(name, aspect,"HoennianDrakloak",
                Type.FIRE, Type.DRAGON,
                new Stats(83, 60, 50, 85, 50, 82),
                List.of(Ability.LEVITATE), Ability.TECHNICIAN,
                UnitConverter.feetToMeters(4, 11), UnitConverter.lbsToKg(860),
                new Stats(1,0,0,1,0,0), 45,
                0.5,
                144, ExperienceGroup.SLOW,
                70,
                51,  List.of(EggGroup.AMORPHOUS,EggGroup.DRAGON),
                List.of("Nurturing to a fault, this Pokemon will fervently watch over young Dreepy to keep them out of trouble. It becomes anxious if it has no Dreepy to care for."),
                List.of(new EvolutionEntry("hoenniandragapult", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"50")))),
                List.of(
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SHIMMER_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,4),
                        new MoveLearnSetEntry(Move.TWISTER,7),
                        new MoveLearnSetEntry(Move.BITE,14),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,17),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,26),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,34),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,39),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,42),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,46),
                        new MoveLearnSetEntry(Move.OVERHEAT,53)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN8),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 35, 48, 0.54, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT, Biome.IS_NETHER_SOUL_FIRE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Drakloak");
        this.setPortraitXYZ(0.1,2.0,0.0);
        setModeled(true);
        setCanFly(true);
        setBaseScale(1);
        setHitbox(1,1);
    }
}
