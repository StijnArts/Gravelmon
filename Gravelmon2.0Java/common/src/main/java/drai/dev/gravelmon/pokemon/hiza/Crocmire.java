package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Crocmire extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crocmire() {
        super("Crocmire",
                Type.GRASS,Type.GROUND,
                new Stats(135,
                        105,
                        115,
                        55,
                        70,
                        30),
                List.of(Ability.DAMP), Ability.HYDRATION,
                8, 165,
                new Stats(2,0,0,0,0,0), 45,
                0.5,
                182, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Despite the size, it is practically invisible in its natural habitat. The stone hard hide lets it shrug off even the most powerful hits."),
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
           setLangFileName("Crocmire");

    }


}
