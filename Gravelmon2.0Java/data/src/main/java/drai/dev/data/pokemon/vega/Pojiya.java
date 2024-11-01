package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pojiya extends Pokemon {
    public Pojiya() {
        super( "Pojiya",
                Type.BUG, Type.POISON,
                new Stats(53	,
                        59	,
                        57	,
                        25	,
                        31	,
                        28),
                List.of(Ability.POISON_POINT), Ability.RUN_AWAY,
                3, 51,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("monebu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_GNAW,1),
                        new MoveLearnSetEntry(Move.SIGNAL,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SCREECH,10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,22),
                        new MoveLearnSetEntry(Move.STEAMROLLER,25),
                        new MoveLearnSetEntry(Move.SLUDGE,27)
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 2, 12, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
