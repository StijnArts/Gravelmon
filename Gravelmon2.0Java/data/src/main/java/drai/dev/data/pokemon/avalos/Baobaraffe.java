package drai.dev.data.pokemon.avalos;


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
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Concept, design, sprites, name, and type by Princess-Phoenix This fakemon originates from Princess-Phoenix's 'Project Freemon' on DeviantArt. The original inspiration for this fakemon came from reading an article about how the baobab trees have huge fat trunks because it stores water in them, but due to droughts the trees were collapsing a few years ago. Evo line: Complete"),
                List.of(),
                List.of(),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder().build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Baobaraffe");

    }


}
