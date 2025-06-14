package drai.dev.data.pokemon.ivris.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IvrisianGyarados extends drai.dev.data.pokemon.Pokemon {
    public IvrisianGyarados(String name, Aspect aspect) {
        super(name, aspect, "IvrisianGyarados",
                Type.DARK,Type.POISON,
                new Stats(117,
                        99,
                        139,
                        41,
                        90,
                        50),
                List.of(), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
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
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Gyarados");

    }


}
