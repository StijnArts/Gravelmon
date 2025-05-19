package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Charmire extends drai.dev.data.pokemon.Pokemon {
    public Charmire() {
        super("Charmire",
                Type.PSYCHIC,Type.FAIRY,
                new Stats(52,
                        31,
                        54,
                        90,
                        86,
                        22),
                List.of(Ability.MAGICIAN), Ability.POISON_HEAL,
                5, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Charmire like to grow special mushrooms on their own caps. With little control over their psychokinesis, they practice diligently on others, willing or otherwise."),
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
           setLangFileName("Charmire");

    }


}
