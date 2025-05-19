package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Virack extends drai.dev.data.pokemon.Pokemon {
    public Virack() {
        super("Virack",
                Type.ELECTRIC, Type.POISON,
                new Stats(66,
                        53,
                        63,
                        86,
                        90,
                        76),
                List.of(Ability.DOWNLOAD), Ability.DOWNLOAD,
                8, 165,
                new Stats(0,0,0,2,0,0), 70,
                0.0,
                154, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS,EggGroup.MINERAL),
                List.of("These Pokemon live in abandoned laboratories, where they feed from old generators and chemical substances. Gatherings of them can lead computers to malfunction."),
                List.of(),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Virack");

    }


}
