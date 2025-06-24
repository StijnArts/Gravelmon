package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Farenhead extends drai.dev.data.pokemon.Pokemon {
    public Farenhead() {
        super("Farenhead",
                Type.FIRE,Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.FLAME_BODY), Ability.WHITE_SMOKE,
                5, 0,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("pyranium", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(15).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER_WASTELAND)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Farenhead");

    }


}
