package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Glamglob extends drai.dev.gravelmon.pokemon.Pokemon {
    public Glamglob() {
        super("Glamglob",
                Type.WATER,
                new Stats(80,
                        98,
                        88,
                        80,
                        80,
                        54),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Glamglob Grotesque Form are used to living under immense ocean pressure, so when its removed from these situations it will completely dissociate with itself and flop into a flimsy and slimy mess loosing almost all of it's psychic potential and ability."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Glamglob");

    }


}
