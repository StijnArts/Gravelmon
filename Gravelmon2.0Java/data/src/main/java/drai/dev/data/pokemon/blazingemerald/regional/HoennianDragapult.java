package drai.dev.data.pokemon.blazingemerald.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class HoennianDragapult extends Pokemon {
    public HoennianDragapult(String name, Aspect aspect) {
        super(name, aspect,"HoennianDragapult",
                Type.FIRE, Type.DRAGON,
                new Stats(118, 100, 75, 120, 75, 112),
                List.of(Ability.LEVITATE), Ability.TECHNICIAN,
                UnitConverter.feetToMeters(10, 6), UnitConverter.lbsToKg(1962),
                new Stats(1,0,0,1,0,1), 45,
                0.5,
                300, ExperienceGroup.SLOW,
                70,
                51,  List.of(EggGroup.AMORPHOUS,EggGroup.DRAGON),
                List.of("Explorers of old would often mistake the Dreepy it carries as additional heads. To this day, this Pokemon is still known as the 'Volcanic Hydra'"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
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
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.FLASH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"egg"),
                        new MoveLearnSetEntry(Move.REVENGE,"egg"),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,4),
                        new MoveLearnSetEntry(Move.TWISTER,7),
                        new MoveLearnSetEntry(Move.BITE,14),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,17),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,26),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,34),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,39),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,42),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,46),
                        new MoveLearnSetEntry(Move.DEVIL_DARTS,50),
                        new MoveLearnSetEntry(Move.BLAST_BURN,62)
                        ),
                List.of(Label.BLAZING_EMERALD, Label.GEN8),
                0, List.of(),
                SpawnContext.GROUNDED, SpawnPool.RARE, 50, 68, 0.054, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER_BASALT, Biome.IS_NETHER_SOUL_FIRE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.19, 0.3,
                List.of());
        this.setLangFileName("Dragapult");

        setCanFly(true);
        setModeled(true);
        setBaseScale(0.8);
        setHitbox(1,1);
    }
}
