package drai.dev.data.pokemon.srin;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sovereen extends drai.dev.data.pokemon.Pokemon {
    public Sovereen(Stats stats) {
        super("Sovereen",
                Type.FAIRY,Type.DRAGON,
                stats,
                List.of(Ability.WIND_RIDER,Ability.FLUFFY), Ability.WATER_COMPACTION,
                24, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.125,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.SORIN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_CHERRY_GROVE).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Sovereen");

    }


}
