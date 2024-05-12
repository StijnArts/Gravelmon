package drai.dev.gravelmon.pokemon.ottora;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Pinjure extends drai.dev.gravelmon.pokemon.Pokemon {
    public Pinjure() {
        super("Pinjure",
                Type.NORMAL, Type.POISON,
                new Stats(55,
                        46,
                        54,
                        40,
                        20,
                        40),
                List.of(Ability.CUTE_CHARM,Ability.POISON_POINT), Ability.RATTLED,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.OTTORA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Pinjure");

    }


}
