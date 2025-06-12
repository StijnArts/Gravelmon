package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Apoar extends drai.dev.data.pokemon.Pokemon {
    public Apoar() {
        super("Apoar",
                Type.DARK,Type.FIGHTING,
                new Stats(99,
                        84,
                        117,
                        34,
                        76,
                        42),
                List.of(Ability.FIGHTBACK), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(26)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Apoar");

    }


}
