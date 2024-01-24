package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Minusplus extends drai.dev.gravelmon.pokemon.Pokemon {
    public Minusplus() {
        super("Minusplus",
                Type.PSYCHIC,
                new Stats(30,
                        50,
                        35,
                        55,
                        50,
                        35),
                List.of(Ability.LEVITATE), Ability.ANALYTIC,
                8, 165,
                new Stats(0,0,0,1,0,0), 235,
                0.5,
                51, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Whilst drifting on warm currents they will often bump into others, their psychic power drawing them together and getting stuck. The longest chain ever found had over 100 individuals!"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CALM_MIND,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Minusplus");

    }


}
