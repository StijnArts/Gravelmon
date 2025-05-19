package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Festale extends drai.dev.data.pokemon.Pokemon {
    public Festale() {
        super("Festale",
                Type.DRAGON,Type.ELECTRIC,
                new Stats(60,
                        50,
                        55,
                        103,
                        82,
                        70),
                List.of(Ability.LIGHTNING_ROD,Ability.CLOUD_NINE), Ability.SERENE_GRACE,
                15, 306,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Rarely seen, they stay deep in the mountains away from civilization. Festale are thought to bring summer showers."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Festale");

    }


}
