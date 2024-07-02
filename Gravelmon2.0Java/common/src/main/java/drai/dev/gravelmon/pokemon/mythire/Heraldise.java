package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Heraldise extends drai.dev.gravelmon.pokemon.Pokemon {
    public Heraldise() {
        super("Heraldise",
                Type.GRASS, Type.FLYING,
                new Stats(70,
                        109,
                        86,
                        65,
                        85,
                        114),
                List.of(Ability.OVERGROW), Ability.JUSTIFIED,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.875,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("With a burst of speed, it can gracefully sprint across the forest canopy, as if flying. The gold leaves on its body gather in sunlight to become more luminous, the energy allowing it to run even faster."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.MALICESTRIKE,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BOLTIN,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,"tm"),
                        new MoveLearnSetEntry(Move.DRAGONFANG,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                new MoveLearnSetEntry(Move.SCRATCH,1),
                new MoveLearnSetEntry(Move.SLASH,1),
                new MoveLearnSetEntry(Move.GROWL,1),
                new MoveLearnSetEntry(Move.LEAFAGE,1),
                new MoveLearnSetEntry(Move.RAZOR_LEAF,1),
                new MoveLearnSetEntry(Move.LEAF_BLADE,1),
                new MoveLearnSetEntry(Move.AIR_CUTTER,1),
                new MoveLearnSetEntry(Move.GUST,1),
                new MoveLearnSetEntry(Move.ACROBATICS,1),
                new MoveLearnSetEntry(Move.METAL_CLAW,1),
                new MoveLearnSetEntry(Move.REVENGE,1),
                new MoveLearnSetEntry(Move.COVET,1),
                new MoveLearnSetEntry(Move.FURY_SWIPES,1),
                new MoveLearnSetEntry(Move.HOWL,1),
                new MoveLearnSetEntry(Move.ROAR,1),
                new MoveLearnSetEntry(Move.NATURE_POWER,1),
                new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                new MoveLearnSetEntry(Move.AGILITY,1)
                        ),
        List.of(Label.MYTHIRE),
                0, List.of(
        ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
        ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Heraldise");

    }


}
