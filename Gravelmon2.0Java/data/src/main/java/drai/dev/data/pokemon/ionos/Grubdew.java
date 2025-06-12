package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grubdew extends drai.dev.data.pokemon.Pokemon {
    public Grubdew() {
        super("Grubdew",
                Type.BUG, Type.GRASS,
                new Stats(30,
                        49,
                        50,
                        30,
                        40,
                        30),
                List.of(Ability.LEAF_GUARD), Ability.LEAF_GUARD,
                4, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The so called Gildoo Root is a quite common plant of the Ionos region. The plant itself varies in size and has a brown, wooden stem and green leaves with a yellow midrib. Grubdew has adapted to the same environment where this plant grows, having half of its body resembling the Gildoo. This camouflage protects it from other Pokémon, such as rayquazaatoto and goomyapoll."),
                List.of(new EvolutionEntry("lohopper", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"14")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,10)                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(1)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grubdew");

    }


}
