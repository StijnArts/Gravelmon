package drai.dev.gravelmon.pokemon.mastenia;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Obspeedian extends drai.dev.gravelmon.pokemon.Pokemon {
    public Obspeedian() {
        super("Obspeedian",
                Type.FIRE,Type.ROCK,
                new Stats(44,
                        98,
                        98,
                        88,
                        44,
                        126),
                List.of(Ability.LEVITATE), Ability.SPEED_BOOST,
                0, 0,
                new Stats(0,0,0,0,0,2), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("- Sharpen Normal - Lava PlumeSTAB Fire - Wild Charge Electric - Flame ChargeSTAB Fire - AccelerockSTAB Rock - Extreme Speed Normal - Harden Normal - Double Team Normal - First Impression Bug - Rock Polish Rock - Tar Shot Rock - Smokescreen Normal - Iron Defense Steel - Smart Strike Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,1),
                        new MoveLearnSetEntry(Move.TAR_SHOT,1),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,1),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,1),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,1),
                        new MoveLearnSetEntry(Move.ACCELEROCK,1),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,1),
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,1),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,1)                        ),
                List.of(Label.MASTENIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Obspeedian");

    }


}
