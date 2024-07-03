package drai.dev.gravelmon.pokemon.atlas;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Ghouch extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ghouch() {
        super("Ghouch",
                Type.GHOST,
                new Stats(48,
                        40,
                        65,
                        89,
                        75,
                        65),
                List.of(Ability.PRANKSTER,Ability.PERPLEXING,Ability.FRISK), Ability.FRISK,
                6, 165,
                new Stats(0,0,0,2,0,0), 175,
                0.0,
                100, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MONSTER),
                List.of("Though it's appearance isn't much of a change, there's terrible things brewing underneath the fabric cocoon. It's eye can see through walls if it focuses."),
                List.of(new EvolutionEntry("spireye", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.TICKLE,1),
                        new MoveLearnSetEntry(Move.TORMENT,6),
                        new MoveLearnSetEntry(Move.CURSE,12),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,16),
                        new MoveLearnSetEntry(Move.SPITE,20),
                        new MoveLearnSetEntry(Move.HYPNOSIS,24),
                        new MoveLearnSetEntry(Move.FLING,30),
                        new MoveLearnSetEntry(Move.SNATCH,36),
                        new MoveLearnSetEntry(Move.NIGHTMARE,40),
                        new MoveLearnSetEntry(Move.DARK_PULSE,44),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,48),
                        new MoveLearnSetEntry(Move.WILLOWISP,51),
                        new MoveLearnSetEntry(Move.HEX,55),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.CALM_MIND,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.HYPNOSIS,"tm"),
                        new MoveLearnSetEntry(Move.TRICK_ROOM,"tm")                        ),
                List.of(Label.ATLAS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 22, 34, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BAMBOO, Biome.IS_CHERRY_GROVE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ghouch");

    }


}
