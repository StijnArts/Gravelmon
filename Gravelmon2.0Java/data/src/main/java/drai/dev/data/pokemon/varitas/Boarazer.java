package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Boarazer extends drai.dev.data.pokemon.Pokemon {
    public Boarazer(Stats stats) {
        super("Boarazer",
                Type.STEEL,
                stats,
                List.of(Ability.IRON_BARBS,Ability.RECKLESS), Ability.ANGER_POINT,
                15, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("It has an extremely short temper and a wild one should be met with the utmost caution. Once is starts charging, anything in its path will be torn to shreds."),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(22).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA, Biome.IS_OLD_GROWTH_TAIGA)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Boarazer");

    }


}
