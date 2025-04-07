package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Striger extends drai.dev.data.pokemon.Pokemon {
    public Striger() {
        super("Striger",
                Type.WATER, Type.FIGHTING,
                new Stats(85,
                        120,
                        85,
                        70,
                        70,
                        100),
                List.of(Ability.TORRENT,Ability.RIVALRY), Ability.DEFIANT,
                18, 0,
                new Stats(0,2,0,0,0,1), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Striger has a wild side. It finishes opponents by biting them with their enormous fangs after launching violent slashes. Its untamed nature can only be tamed by the most powerful of trainers."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Striger");

    }


}
