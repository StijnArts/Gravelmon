package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ahrimini extends drai.dev.data.pokemon.Pokemon {
    public Ahrimini(Stats stats) {
        super("Ahrimini",
                Type.DARK, Type.FLYING,
                stats,
                List.of(Ability.KEEN_EYE), Ability.TINTED_LENS,
                7, 68,
                new Stats(0,0,0,0,0,0), 200,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING,EggGroup.MONSTER),
                List.of("Ahrimini often paralyze their prey with a striking glare before swooping in to attack them with its small, sharp claws."),
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
           setLangFileName("Ahrimini");

    }


}
