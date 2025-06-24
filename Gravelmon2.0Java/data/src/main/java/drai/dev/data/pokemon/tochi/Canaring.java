package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Canaring extends drai.dev.data.pokemon.Pokemon {
    public Canaring(Stats stats) {
        super("Canaring",
                Type.STEEL,Type.FLYING,
                stats,
                List.of(Ability.FOREWARN), Ability.ANTICIPATION,
                15, 0,
                new Stats(0,0,0,0,0,0), 70,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Canaring spend most of their time sitting on their bells, as flying for long periods of time is difficult. Many ancient towns would have one Canaring in them that could be used as an alarm of incoming danger, such a wildfire or incoming attack."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(23).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Canaring");

    }


}
