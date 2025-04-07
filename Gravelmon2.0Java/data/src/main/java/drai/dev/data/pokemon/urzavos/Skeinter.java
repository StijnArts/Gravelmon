package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Skeinter extends drai.dev.data.pokemon.Pokemon {
    public Skeinter() {
        super("Skeinter",
                Type.NORMAL, Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                2, 14,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.BUG),
                List.of("Forgotten scraps of yarn are thought to turn into these 'Mons. They steal and eat cloth and yarn to grow larger."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Skeinter");

    }


}
