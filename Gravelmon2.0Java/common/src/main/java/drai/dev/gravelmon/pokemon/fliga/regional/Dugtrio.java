package drai.dev.gravelmon.pokemon.fliga.regional;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Dugtrio extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dugtrio(int dex) {
        super(dex, "Dugtrio",
                Type.GROUND,
                new Stats(35,
                        100,
                        50,
                        50,
                        70,
                        120),
                List.of(Ability.MOUNTAINEER,Ability.ARENA_TRAP), Ability.SAND_FORCE,
                7, 333,
                new Stats(0,0,0,0,0,2), 50,
                0.5,
                149, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("In battle, it digs through the ground and strikes the unsuspecting foe from an unexpected direction."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROTOTILLER,1),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.SAND_TOMB,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.ASTONISH,7),
                        new MoveLearnSetEntry(Move.MUDSLAP,10),
                        new MoveLearnSetEntry(Move.MAGNITUDE,14),
                        new MoveLearnSetEntry(Move.BULLDOZE,18),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,23),
                        new MoveLearnSetEntry(Move.MUD_BOMB,25),
                        new MoveLearnSetEntry(Move.EARTH_POWER,30),
                        new MoveLearnSetEntry(Move.DIG,35),
                        new MoveLearnSetEntry(Move.SLASH,41),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,47),
                        new MoveLearnSetEntry(Move.FISSURE,53),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.EARTH_POWER,"tm"),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.SANDSTORM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.SCREECH,"tm"),
                        new MoveLearnSetEntry(Move.REVERSAL,"tm"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.PURSUIT,"tm"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.BEAT_UP,"tm"),
                        new MoveLearnSetEntry(Move.UPROAR,"tm"),
                        new MoveLearnSetEntry(Move.MEMENTO,"tm"),
                        new MoveLearnSetEntry(Move.ASTONISH,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,"tm")                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dugtrio");

    }


}
