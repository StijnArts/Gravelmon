package drai.dev.gravelmon.pokemon.aristos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Kamurados extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kamurados() {
        super("Kamurados",
                Type.WATER, Type.BUG,
                new Stats(125,
                        100,
                        81,
                        79,
                        95,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.TRANQUILIZE,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.DIVE,1),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,7),
                        new MoveLearnSetEntry(Move.SLAM,13),
                        new MoveLearnSetEntry(Move.WATER_PULSE,19),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,23),
                        new MoveLearnSetEntry(Move.AQUA_JET,29),
                        new MoveLearnSetEntry(Move.BONE_RUSH,31),
                        new MoveLearnSetEntry(Move.ROAR,37),
                        new MoveLearnSetEntry(Move.LIQUIDATION,43),
                        new MoveLearnSetEntry(Move.THREADLASH,47),
                        new MoveLearnSetEntry(Move.AGILITY,53),
                        new MoveLearnSetEntry(Move.SKULL_BASH,59),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,67),
                        new MoveLearnSetEntry(Move.DRAIN_LIFE,73)                ),
                List.of(Label.ARISTOS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 23, 46, .003, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Kamurados");
        addAdditionalEvolution("magikarp", new EvolutionEntry("kamurados", EvolutionType.LEVEL_UP, List.of(),
                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"dekoi\""))));

    }


}
