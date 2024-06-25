package drai.dev.gravelmon.pokemon.blazingemerald.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;
import drai.dev.gravelmon.util.*;

import java.util.*;

public class HoennianDreepy extends Pokemon {
    public HoennianDreepy(String originalMon, Aspect aspect) {
        super(originalMon, aspect,"HoennianDreepy",
                Type.FIRE, Type.DRAGON,
                new Stats(52, 40, 30, 60, 30, 58),
                List.of(Ability.LEVITATE), Ability.TECHNICIAN,
                UnitConverter.feetToMeters(2, 0), UnitConverter.lbsToKg(176),
                new Stats(0,0,0,1,0,0), 45,
                0.5,
                54, ExperienceGroup.SLOW,
                70,
                51,  List.of(EggGroup.AMORPHOUS,EggGroup.DRAGON),
                List.of("Dreepy are notorious pranksters. They often dart around in packs, looking for humans or Pokemon to play tricks on. It's den is littered with stolen valuables."),
                List.of(new EvolutionEntry("hoenniandrakloak", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,4),
                        new MoveLearnSetEntry(Move.TWISTER,7),
                        new MoveLearnSetEntry(Move.BITE,9),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,14),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,19),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,25),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,29),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,33),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,39),
                        new MoveLearnSetEntry(Move.OVERHEAT,44),
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
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg")
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN8),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 12, 30, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT, Biome.IS_NETHER_SOUL_FIRE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Dreepy");
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
