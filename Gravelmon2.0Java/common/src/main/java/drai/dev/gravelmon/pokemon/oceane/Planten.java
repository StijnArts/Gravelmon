package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Planten extends drai.dev.gravelmon.pokemon.Pokemon {
    public Planten() {
        super("Planten",
                Type.GRASS,
                new Stats(23,
                        34,
                        54,
                        66,
                        64,
                        44),
                List.of(Ability.CHLOROPHYLL), Ability.CLEAR_BODY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                57, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Millions of Planten fill the Oceane region, and feed its many inhabitants. During summer, they become hyperactive and dye the seas a bright green colour."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CLEAR_SMOG,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Planten");

    }


}
