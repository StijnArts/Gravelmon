package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianAriados extends drai.dev.data.pokemon.Pokemon {
    public TheossianAriados(String name, Aspect aspect) {
        super(name, aspect, "Ariados",
                Type.BUG, Type.DARK,
                new Stats(70,
                        90,
                        70,
                        60,
                        70,
                        40),
                List.of(Ability.UNNERVE,Ability.INSOMNIA), Ability.SUPER_LUCK,
                11, 335,
                new Stats(0,2,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Theosian Ariados have a powerful bite, causing immense pain for several days if bit. Their abdomen resembles a pumpkin allowing them to blend in with the crops when hunting."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ariados");

    }


}
