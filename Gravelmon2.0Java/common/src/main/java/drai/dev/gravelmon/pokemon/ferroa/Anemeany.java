package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Anemeany extends drai.dev.gravelmon.pokemon.Pokemon {
    public Anemeany() {
        super("Anemeany",
                Type.WATER,
                new Stats(70,
                        75,
                        30,
                        60,
                        75,
                        30),
                List.of(Ability.RIVALRY,Ability.TIGHTGRIP,Ability.ADAPTABILITY), Ability.ADAPTABILITY,
                6, 165,
                new Stats(0,0,0,0,1,0), 225,
                0.5,
                68, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("It gathers in swarms by the water's edge, attacking intruders by stretching out and flailing itself like a club. The colony pushes away boats that try to sail over their land."),
                List.of(new EvolutionEntry("truculony", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.AQUASLAP,5),
                        new MoveLearnSetEntry(Move.FORESIGHT,9),
                        new MoveLearnSetEntry(Move.FORCE_PALM,24),
                        new MoveLearnSetEntry(Move.ENSNARE,27),
                        new MoveLearnSetEntry(Move.TAUNT,30),
                        new MoveLearnSetEntry(Move.REVENGE,33),
                        new MoveLearnSetEntry(Move.WATERFALL,37),
                        new MoveLearnSetEntry(Move.REFRESH,42),
                        new MoveLearnSetEntry(Move.WRING_OUT,45),
                        new MoveLearnSetEntry(Move.BATON_PASS,49),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,54),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.BLOCK,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.SPITE,"tm"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.DUAL_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FOUL_PLAY,"tm"),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,"tm"),
                        new MoveLearnSetEntry(Move.LIQUIDATION,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tm"),
                        new MoveLearnSetEntry(Move.THROAT_CHOP,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,"tm"),
                        new MoveLearnSetEntry(Move.LASH_OUT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.POWER_WHIP,"tm"),
                        new MoveLearnSetEntry(Move.THRASH,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 6, 27, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setCanSwim(true);
        setAvoidsLand(true);

    }


}
