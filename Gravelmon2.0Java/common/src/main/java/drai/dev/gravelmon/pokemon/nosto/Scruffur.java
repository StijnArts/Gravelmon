package drai.dev.gravelmon.pokemon.nosto;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Scruffur extends drai.dev.gravelmon.pokemon.Pokemon {
    public Scruffur() {
        super("Scruffur",
                Type.GROUND,
                new Stats(74,
                        86,
                        58,
                        58,
                        64,
                        90),
                List.of(Ability.SAND_VEIL), Ability.SAND_VEIL,
                8, 165,
                new Stats(0,0,0,0,0,2), 0,
                0.5,
                151, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.NOSTO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Scruffur");

    }


}
