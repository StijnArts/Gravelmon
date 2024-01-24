package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Raddash extends drai.dev.gravelmon.pokemon.Pokemon {
    public Raddash() {
        super("Raddash",
                Type.GRASS,
                new Stats(55,
                        85,
                        40,
                        25,
                        40,
                        85),
                List.of(Ability.NATURAL_CURE,Ability.NO_GUARD,Ability.SHEER_FORCE), Ability.SHEER_FORCE,
                8, 165,
                new Stats(0,0,0,0,0,1), 240,
                0.85,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("It lives its live underground near clear bodies of water, only its leaves showing. If uprooted, it will retaliate with a flurry of kicks before running off at high speeds."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Raddash");

    }


}
