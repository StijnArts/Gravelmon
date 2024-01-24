package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Raunny extends drai.dev.gravelmon.pokemon.Pokemon {
    public Raunny() {
        super("Raunny",
                Type.ROCK,
                new Stats(60,
                        55,
                        70,
                        40,
                        45,
                        35),
                List.of(Ability.QUICK_FEET), Ability.SPEED_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,1), 215,
                0.5,
                65, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.FIELD),
                List.of("Most definitely the fastest family of Rock Pokemon known so far. These Pokemon combine their agility with their brute force to knock down opponents in a flash. Raunny are found mostly in mountains where they feed on vegetation, although are also sometimes known to eat pebbles."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,8),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,13),
                        new MoveLearnSetEntry(Move.ROCK_THROW,17),
                        new MoveLearnSetEntry(Move.LEER,22),
                        new MoveLearnSetEntry(Move.BODY_SLAM,26),
                        new MoveLearnSetEntry(Move.MUD_SPORT,31),
                        new MoveLearnSetEntry(Move.SANDSTORM,35),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,40),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,44),
                        new MoveLearnSetEntry(Move.MEGA_KICK,49),
                        new MoveLearnSetEntry(Move.HEAD_SMASH,53),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.FISSURE,"tm"),
                        new MoveLearnSetEntry(Move.AGILITY,"tm"),
                        new MoveLearnSetEntry(Move.HARDEN,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm")                        ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Raunny");

    }


}
