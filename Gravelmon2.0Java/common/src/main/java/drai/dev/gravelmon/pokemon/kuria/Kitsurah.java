package drai.dev.gravelmon.pokemon.kuria;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Kitsurah extends drai.dev.gravelmon.pokemon.Pokemon {
    public Kitsurah() {
        super("Kitsurah",
                Type.FIRE,Type.COSMIC,
                new Stats(80,
                        115,
                        80,
                        80,
                        80,
                        100),
                List.of(Ability.BLAZE), Ability.SUPERNOVA,
                17, 547,
                new Stats(0,3,0,0,0,0), 45,
                0.875,
                224, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Kitsurah have free control over local gravity and can use this to float. They draw and compress rocks to their arms so when they punch, they really pack a punch!"),
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
           setLangFileName("Kitsurah");

    }


}
