package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ruffhaws extends drai.dev.data.pokemon.Pokemon {
    public Ruffhaws() {
        super("Ruffhaws",
                Type.FIGHTING,Type.GRASS,
                new Stats(81,
                        132,
                        76,
                        70,
                        70,
                        97),
                List.of(Ability.ROUGH_SKIN,Ability.WATER_ABSORB), Ability.LONG_REACH,
                15, 0,
                new Stats(0,0,0,0,0,0), 50,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Name Help: kaijumon Name Meaning: Rough/roughhouse + misspelling of tough, ‘tuff’ + paws Stat Help: kassofchaos "),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ruffhaws");

    }


}
