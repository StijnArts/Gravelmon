package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Tamanozzle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tamanozzle() {
        super("Tamanozzle",
                Type.NORMAL,
                new Stats(77,
                        87,
                        77,
                        57,
                        67,
                        77),
                List.of(Ability.QUICK_FEET), Ability.SNIPER,
                10, 400,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                150, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tamanozzle");

    }


}
