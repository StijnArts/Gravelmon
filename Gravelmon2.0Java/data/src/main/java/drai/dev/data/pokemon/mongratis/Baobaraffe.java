package drai.dev.data.pokemon.mongratis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baobaraffe extends drai.dev.data.pokemon.Pokemon {
    public Baobaraffe() {
        super("Baobaraffe",
                Type.GRASS,
                new Stats(115,
                        85,
                        100,
                        65,
                        75,
                        60),
                List.of(Ability.WATER_COMPACTION), Ability.SUNSCREEN,
                36, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, sprites, name, and type by Princess-Phoenix This fakemon originates from Princess-Phoenix's 'Project Freemon' on DeviantArt. The original inspiration for this fakemon came from reading an article about how the baobab trees have huge fat trunks because it stores water in them, but due to droughts the trees were collapsing a few years ago. Evo line: Complete"),
                List.of(),
                List.of(),
                List.of(Label.MONGRATIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(28).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky().duringDaytime()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Baobaraffe");

    }


}
