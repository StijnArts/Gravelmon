package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanTinkatink extends drai.dev.data.pokemon.Pokemon {
    public LagoonanTinkatink(String name, Aspect aspect) {
        super(name, aspect, "LAGOONEnianTinkatink",
                Type.GRASS,Type.STEEL,
                new Stats(50,
                        45,
                        45,
                        35,
                        64,
                        58),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 89,
                new Stats(0,0,0,0,1,0), 190,
                0.0,
                59, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("It will scavenge shipwrecks for parts to make toys and play. Metalic objects that make noise are their favorites."),
                List.of(new EvolutionEntry("tinkatuff", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BEACH, Biome.IS_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.SHIP_WRECK)
    .build(), List.of());
	
           setLangFileName("Tinkatink");

    }


}
