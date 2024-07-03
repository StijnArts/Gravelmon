package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Kureigu extends Pokemon {
    public Kureigu() {
        super( "Kureigu",
                Type.BUG, Type.NORMAL,
                new Stats(54	,23	,68	,43	,87	,48),
                List.of(Ability.SWARM), Ability.UNAWARE,
                7, 208,
                new Stats(0,0,0,0,2,0), 170,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("shakuzora", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)
                ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 13, 22, 2.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
    }
}
