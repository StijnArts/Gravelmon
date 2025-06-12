package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Ishiarare extends Pokemon {
    public Ishiarare() {
        super( "Ishiarare",
                Type.ROCK,
                new Stats(45	,70	,90	,25	,30	,20),
                List.of(Ability.ROUGH_SKIN), Ability.STURDY,
                3, 178,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                74, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("dorisuton", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(
                        new MoveLearnSetEntry(Move.GRAND_BOULDER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,5),
                        new MoveLearnSetEntry(Move.ROCK_THROW,9),
                        new MoveLearnSetEntry(Move.SPEEDMITE,14),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,18),
                        new MoveLearnSetEntry(Move.MUD_SPORT,22),
                        new MoveLearnSetEntry(Move.POWER_GEM,27),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,30),
                        new MoveLearnSetEntry(Move.SANDSTORM,33),
                        new MoveLearnSetEntry(Move.CRAG_CANNON,39),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,46),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,52),
                        new MoveLearnSetEntry(Move.STONE_EDGE,58),
                        new MoveLearnSetEntry(Move.EXPLOSION,65),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.MUDSLAP,"tutor"),
                        new MoveLearnSetEntry(Move.SPIKES,"tutor"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tutor"),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tutor"),
                        new MoveLearnSetEntry(Move.TERRAFIRM,"tutor"),
                        new MoveLearnSetEntry(Move.HARD_KNOCK,"tutor"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tutor"),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,"tutor"),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,"egg"),
                        new MoveLearnSetEntry(Move.CRASH_IMPACT,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_SPIN,"egg"),
                        new MoveLearnSetEntry(Move.RAZE_EARTH,"egg"),
                        new MoveLearnSetEntry(Move.SCREECH,"egg"),
                        new MoveLearnSetEntry(Move.SKULL_BASH,"egg"),
                        new MoveLearnSetEntry(Move.SONIC_SAND,"egg"),
                        new MoveLearnSetEntry(Move.STEAMROLLER,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 19, 4.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
