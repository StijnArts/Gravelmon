package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Maskoon extends drai.dev.gravelmon.pokemon.Pokemon {
    public Maskoon() {
        super("Maskoon",
                Type.BUG,
                new Stats(52,
                        42,
                        72,
                        62,
                        42,
                        32),
                List.of(Ability.SHED_SKIN), Ability.SHED_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It wraps itself into its own silk preparing for a metamorphosis. The silk's properties causes it to be in a semi-asleep state."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,1)                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Maskoon");

    }


}
