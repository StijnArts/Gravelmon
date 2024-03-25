package drai.dev.gravelmon.pokemon.ionos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Grubdew extends drai.dev.gravelmon.pokemon.Pokemon {
    public Grubdew() {
        super("Grubdew",
                Type.BUG,Type.GRASS,
                new Stats(30,
                        49,
                        50,
                        30,
                        40,
                        30),
                List.of(Ability.LEAF_GUARD), Ability.LEAF_GUARD,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The so called Gildoo Root is a quite common plant of the Ionos region. The plant itself varies in size and has a brown, wooden stem and green leaves with a yellow midrib. Grubdew has adapted to the same environment where this plant grows, having half of its body resembling the Gildoo. This camouflage protects it from other Pokémon, such as hippowdonatoto and rayquazaapoll."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,10)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grubdew");

    }


}
