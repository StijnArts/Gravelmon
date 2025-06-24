package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Yapifur extends drai.dev.data.pokemon.Pokemon {
    public Yapifur() {
        super("Yapifur",
                Type.NORMAL,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.ADAPTABILITY), Ability.NORMALIZE,
                12, 40,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("A very common first Pokémon for young trainers, they are easy to train and bond very quickly to their owners."),
                List.of(new EvolutionEntry("frosfur", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"cobblemon:ice_stone"),
                        new EvolutionEntry("blasfur", EvolutionType.ITEM_INTERACT, false, List.of(),
                                List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Yapifur");

    }


}
