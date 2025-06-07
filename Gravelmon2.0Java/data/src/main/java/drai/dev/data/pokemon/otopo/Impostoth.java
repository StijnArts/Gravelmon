package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Impostoth extends drai.dev.data.pokemon.Pokemon {
    public Impostoth() {
        super("Impostoth",
                Type.BUG, Type.FLYING,
                new Stats(60,
                        80,
                        50,
                        77,
                        50,
                        100),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,2), 90,
                0.5,
                146, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Impostoth resembles a variety of bee and wasp Pokemon, however it is unable to sting its opponent. Its colours deter predators, allowing it to forage for food freely."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Impostoth");

    }


}
