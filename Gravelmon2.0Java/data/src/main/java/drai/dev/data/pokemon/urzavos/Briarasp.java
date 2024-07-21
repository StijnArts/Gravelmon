package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Briarasp extends drai.dev.data.pokemon.Pokemon {
    public Briarasp(Stats stats) {
        super("Briarasp",
                Type.BUG, Type.GRASS,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                15, 544,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Despite rumors that they are naturally aggressive, these 'Mons do not attack unless provoked. They enjoy sweet berries and have been known to help cultivate wild Pecha berry trees."),
                List.of(),
                List.of(                        ),
                List.of(Label.URZAVOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Briarasp");

    }


}
