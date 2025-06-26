package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Apatoplek extends drai.dev.data.pokemon.Pokemon {
    public Apatoplek(Stats stats) {
        super("Apatoplek",
                Type.ROCK, Type.FIGHTING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Cry made by: skurleton Name: apatosaur + apoplectic Name Credit: Banzaimarten It is actually based off a Bajadasaurus. But apatosaur's name's easier to work with."),
                List.of(),
                List.of(                   ),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .fossil()
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Apatoplek");

    }


}
