package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grapearl extends drai.dev.data.pokemon.Pokemon {
    public Grapearl() {
        super("Grapearl",
                Type.GRASS,Type.POISON,
                new Stats(42,
                        35,
                        50,
                        70,
                        70,
                        35),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 83,
                new Stats(0,0,0,0,1,0), 205,
                0.5,
                62, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("jamowar", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone")),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BIRCH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Grapearl");

    }


}
