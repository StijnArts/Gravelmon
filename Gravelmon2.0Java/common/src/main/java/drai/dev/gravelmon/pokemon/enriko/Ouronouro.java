package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Ouronouro extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ouronouro() {
        super("Ouronouro",
                Type.POISON, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.LIQUID_OOZE), Ability.PERPLEXING,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                233, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Its existence is hard to prove, as anyone seeing it is lulled into a mysterious, dreamlike trance. It can summon hallucinations in its foes when endangered."),
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
           setLangFileName("Ouronouro");

    }


}
