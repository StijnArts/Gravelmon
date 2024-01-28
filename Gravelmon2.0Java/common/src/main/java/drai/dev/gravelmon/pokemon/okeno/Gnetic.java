package drai.dev.gravelmon.pokemon.okeno;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Gnetic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gnetic() {
        super("Gnetic",
                Type.QUESTION_MARK,
                new Stats(80,
                        80,
                        80,
                        80,
                        80,
                        80),
                List.of(Ability.SIMPLE), Ability.SIMPLE,
                8, 165,
                new Stats(8,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("A strange Pokémon created in a lab. It's cellular structure was made incredibly stable, so it began to be used in a variety of tests."),
                List.of(),
                List.of(                        ),
                List.of(Label.OKENO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("G-netic");

    }


}