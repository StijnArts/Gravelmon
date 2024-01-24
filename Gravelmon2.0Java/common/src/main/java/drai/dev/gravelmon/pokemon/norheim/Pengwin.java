package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Pengwin extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pengwin() {
        super("Pengwin",
                Type.ICE,Type.FLYING,
                new Stats(50,
                        84,
                        60,
                        70,
                        40,
                        110),
                List.of(Ability.SPEED_BOOST,Ability.OWN_TEMPO,Ability.SLUSH_RUSH), Ability.SLUSH_RUSH,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Slalom, Downhill racing, Slopestyle; Pengwin knows them all."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,12),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,19),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,24),
                        new MoveLearnSetEntry(Move.SPEED_SWAP,30),
                        new MoveLearnSetEntry(Move.ICE_SHARD,36),
                        new MoveLearnSetEntry(Move.TAILWIND,40),
                        new MoveLearnSetEntry(Move.BATON_PASS,45),
                        new MoveLearnSetEntry(Move.ACROBATICS,52),
                        new MoveLearnSetEntry(Move.AVALANCHE,62),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,76),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,"tm"),
                        new MoveLearnSetEntry(Move.LOCKON,"tm"),
                        new MoveLearnSetEntry(Move.VOLT_SWITCH,"tm"),
                        new MoveLearnSetEntry(Move.WILD_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.AFTER_YOU,"tm"),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,"tm")                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pengwin");

    }


}
