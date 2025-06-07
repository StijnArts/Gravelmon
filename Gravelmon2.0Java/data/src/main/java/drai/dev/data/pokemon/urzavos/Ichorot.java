package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ichorot extends drai.dev.data.pokemon.Pokemon {
    public Ichorot() {
        super("Ichorot",
                Type.POISON, Type.DARK,
                new Stats(100,
                        60,
                        70,
                        85,
                        105,
                        60),
                List.of(Ability.CONTRARY,Ability.MOLD_BREAKER), Ability.CORROSION,
                3, 18,
                new Stats(1,0,0,0,1,0), 60,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Ichorot love to hang around in spooky forests and graveyards, gobbling up whatever debris is left behind. The ooze around the bottom of their mouths is foul, and not recommended for contact with skin."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ichorot");

    }


}
