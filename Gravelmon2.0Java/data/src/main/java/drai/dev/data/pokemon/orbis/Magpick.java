package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magpick extends drai.dev.data.pokemon.Pokemon {
    public Magpick() {
        super("Magpick",
                Type.DARK, Type.FLYING,
                new Stats(40,
                        60,
                        30,
                        35,
                        30,
                        70),
                List.of(Ability.PICKPOCKET), Ability.PICKPOCKET,
                3, 30,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                52, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Magpick");

    }


}
