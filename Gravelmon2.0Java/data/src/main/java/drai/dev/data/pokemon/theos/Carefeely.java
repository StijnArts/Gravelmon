package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Carefeely extends drai.dev.data.pokemon.Pokemon {
    public Carefeely() {
        super("Carefeely",
                Type.NORMAL, Type.FAIRY,
                new Stats(105,
                        60,
                        85,
                        60,
                        85,
                        50),
                List.of(Ability.TELEPATHY,Ability.FRIEND_GUARD), Ability.SYNCHRONIZE,
                19, 300,
                new Stats(2,0,0,0,0,0), 0,
                0.5,
                390, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Carefeely");

    }


}
