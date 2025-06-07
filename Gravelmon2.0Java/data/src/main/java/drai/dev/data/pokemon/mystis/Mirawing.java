package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mirawing extends drai.dev.data.pokemon.Pokemon {
    public Mirawing() {
        super("Mirawing",
                Type.PSYCHIC, Type.FLYING,
                new Stats(70,
                        60,
                        75,
                        130,
                        75,
                        100),
                List.of(Ability.SUPER_LUCK), Ability.SUPER_LUCK,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                230, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Mirawing is the form Psyclaw takes when it fully realises its power for good. They shrink in size to grow wings, and use them to fly and bring light to everyone."),
                List.of(),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .setMinLevel(38).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Mirawing");

    }


}
