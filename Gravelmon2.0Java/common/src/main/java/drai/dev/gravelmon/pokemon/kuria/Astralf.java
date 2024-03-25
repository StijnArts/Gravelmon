package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Astralf extends drai.dev.gravelmon.pokemon.Pokemon {
    public Astralf() {
        super("Astralf",
                Type.COSMIC,
                new Stats(81,
                        81,
                        56,
                        43,
                        56,
                        63),
                List.of(Ability.OBLIVIOUS,Ability.SAP_SIPPER), Ability.UNAWARE,
                9, 312,
                new Stats(1,0,0,0,0,0), 45,
                0.875,
                132, ExperienceGroup.SLOW,
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
           setLangFileName("Astralf");

    }


}
