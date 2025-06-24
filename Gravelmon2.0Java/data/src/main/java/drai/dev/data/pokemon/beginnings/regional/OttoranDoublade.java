package drai.dev.data.pokemon.beginnings.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class OttoranDoublade extends drai.dev.data.pokemon.Pokemon {
    public OttoranDoublade(String name, Aspect aspect) {
        super(name, aspect, "Doublade",
                Type.GRASS,Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("aegistump", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:leaf_stone"),
                        new EvolutionEntry("chainslash", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Doublade");

    }


}
