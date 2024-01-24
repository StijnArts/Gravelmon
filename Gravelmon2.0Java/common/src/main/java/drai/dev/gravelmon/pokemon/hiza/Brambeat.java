package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Brambeat extends drai.dev.gravelmon.pokemon.Pokemon {
    public Brambeat() {
        super("Brambeat",
                Type.GRASS,Type.FIGHTING,
                new Stats(52,
                        65,
                        57,
                        40,
                        40,
                        41),
                List.of(Ability.IRON_FIST), Ability.VITAL_SPIRIT,
                8, 165,
                new Stats(0,1,0,0,0,0), 190,
                0.5,
                66, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Brambeat are small but feisty, they are often fighting each other for a good spot near the waterhole."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Brambeat");

    }


}
