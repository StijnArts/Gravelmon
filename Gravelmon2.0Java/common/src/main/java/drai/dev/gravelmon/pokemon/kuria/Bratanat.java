package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Bratanat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Bratanat() {
        super("Bratanat",
                Type.BUG,
                new Stats(50,
                        40,
                        40,
                        55,
                        80,
                        68),
                List.of(Ability.IMMUNITY), Ability.POISON_POINT,
                3, 11,
                new Stats(0,0,0,0,1,0), 255,
                0.5,
                61, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It's full of so much disease that it has eventually become immune to all sickness. Because of this incredible power, Bratanat is always cheerful and happy. It spends its days playfully pranking others but it has to keep a distance so it doesn't give anyone a disease."),
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
           setLangFileName("Bratanat");

    }


}
