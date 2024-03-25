package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Cosmoose extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cosmoose() {
        super("Cosmoose",
                Type.COSMIC,
                new Stats(121,
                        121,
                        86,
                        63,
                        86,
                        63),
                List.of(Ability.OBLIVIOUS,Ability.SAP_SIPPER), Ability.UNAWARE,
                17, 971,
                new Stats(2,0,0,0,0,0), 45,
                0.875,
                231, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cosmoose");

    }


}
