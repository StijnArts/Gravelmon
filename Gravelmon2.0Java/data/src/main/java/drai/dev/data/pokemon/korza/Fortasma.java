package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fortasma extends drai.dev.data.pokemon.Pokemon {
    public Fortasma() {
        super("Fortasma",
                Type.PSYCHIC,Type.POISON,
                new Stats(60,
                        30,
                        25,
                        115,
                        85,
                        45),
                List.of(Ability.LEVITATE), Ability.CURSED_BODY,
                6, 59,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                126, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Loves hoarding lavish objects, especially soft and fancy pillows. Fortasma uses its smog to cause hallucinations, giving visions of false futures."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Fortasma");

    }


}
