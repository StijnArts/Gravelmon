package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Meaniechu extends drai.dev.gravelmon.pokemon.Pokemon {
    public Meaniechu() {
        super("Meaniechu",
                Type.ELECTRIC,Type.FIGHTING,
                new Stats(60,
                        96,
                        55,
                        66,
                        66,
                        90),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Raised in a lab, this Pokémon has become both strong and vengeful. Its sinister nature has given it the name ‘Meaniechu’. Its orb tail can break a steel cage with ease."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Meaniechu");

    }


}
