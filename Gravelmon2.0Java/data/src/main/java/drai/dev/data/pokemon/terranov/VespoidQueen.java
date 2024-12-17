package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class VespoidQueen extends drai.dev.data.pokemon.Pokemon {
    public VespoidQueen(Stats stats) {
        super("VespoidQueen",
                Type.BUG,Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("A massive thorax and brilliant, gigantic wings mark the Vespoid Queen. It commands its subjects through unique flight patterns, and will stab any intruders with a poisonous stinger that also causes paralysis. It also spits acidic bodily fluid at its prey."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Vespoid Queen");

    }


}
