package drai.dev.data.pokemon.umbra;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Boulderoach extends Pokemon {
    public Boulderoach() {
        super("Boulderoach",
                Type.BUG, Type.ROCK,
                new Stats(55,
                        65,
                        110,
                        35,
                        50,
                        85),
                List.of(Ability.RUN_AWAY, Ability.STURDY), Ability.SHED_SKIN,
                11, 660,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                140, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG, EggGroup.MINERAL),
                List.of("Boulderoach chew up rocks to plaster on their shells. They have mined out entire caverns to reinforce the layers of stone and mud."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_CUTTER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,5),
                        new MoveLearnSetEntry(Move.ROCK_THROW,8),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,12),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,16),
                        new MoveLearnSetEntry(Move.ROLLOUT,20),
                        new MoveLearnSetEntry(Move.BUG_BITE,25),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,29),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,34),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,38),
                        new MoveLearnSetEntry(Move.ROCK_CLIMB,43),
                        new MoveLearnSetEntry(Move.STONE_EDGE,47),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.SMACK_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_POLISH,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.GYRO_BALL,"tm"),
                        new MoveLearnSetEntry(Move.DIG,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.INFESTATION,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.NATURE_POWER,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.LOW_KICK,"tutor"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tutor"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tutor"),
                        new MoveLearnSetEntry(Move.IRON_HEAD,"tutor"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tutor")
                        ),
                List.of(Label.UMBRA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(20)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_LUSH)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
