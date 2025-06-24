package drai.dev.data.pokemon.orohnhavai;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Antzooka extends drai.dev.data.pokemon.Pokemon {
    public Antzooka() {
        super("Antzooka",
                Type.BUG,
                new Stats(62,
                        95,
                        70,
                        86,
                        70,
                        75),
                List.of(Ability.SNIPER,Ability.STEADFAST,Ability.SHARPSHOOTER), Ability.SHARPSHOOTER,
                6, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("They raid areas to collect Berries. They store the seeds in their abdomen and launch them out their cannons as bullets. They are very territorial and usually get into wars over territories with other armies of Antzooka."),
                List.of(),
                List.of(),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(20).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Antzooka");

    }


}
