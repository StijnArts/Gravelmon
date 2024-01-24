package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Dashkite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Dashkite() {
        super("Dashkite",
                Type.ELECTRIC,Type.GROUND,
                new Stats(40,
                        50,
                        36,
                        46,
                        36,
                        94),
                List.of(Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Dashkite are easily startled Pokemon and difficult to catch because they often run in the opposite direction when confronted by trainers"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BOLT_BEAK,1)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Dashkite");

    }


}
