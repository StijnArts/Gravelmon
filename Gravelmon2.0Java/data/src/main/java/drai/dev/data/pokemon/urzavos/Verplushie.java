package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Verplushie extends drai.dev.data.pokemon.Pokemon {
    public Verplushie(Stats stats) {
        super("Verplushie",
                Type.NORMAL, Type.FAIRY,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 45,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Having grown large enough, this 'Mon takes its previous evolutions into its fluff to keep them warm and safe when their fabric has worn down. Every pattern is unique!"),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(27).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Verplushie");

    }


}
