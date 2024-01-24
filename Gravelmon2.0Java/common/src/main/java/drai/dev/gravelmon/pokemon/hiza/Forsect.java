package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Forsect extends drai.dev.gravelmon.pokemon.Pokemon {
    public Forsect() {
        super("Forsect",
                Type.FIGHTING,Type.BUG,
                new Stats(83,
                        135,
                        92,
                        55,
                        82,
                        68),
                List.of(Ability.SAND_RUSH), Ability.JUSTIFIED,
                8, 165,
                new Stats(0,2,0,0,0,0), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.HUMAN_LIKE),
                List.of("When in combat it will push its body to the limit, even if its badly injured it will only stop fighting when knocked out cold."),
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
           setLangFileName("Forsect");

    }


}
