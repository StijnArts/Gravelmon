package drai.dev.data.pokemon.ivris;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AbyssalHunger extends drai.dev.data.pokemon.Pokemon {
    public AbyssalHunger() {
        super("AbyssalHunger",
                Type.WATER,Type.FIGHTING,
                new Stats(124,
                        105,
                        147,
                        43,
                        95,
                        53),
                List.of(Ability.PROTOSYNTHESIS), null,
                32, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IVRIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .abnormality()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Abyssal Hunger");

    }


}
