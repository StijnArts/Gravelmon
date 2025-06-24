package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Quillistic extends drai.dev.data.pokemon.Pokemon {
    public Quillistic() {
        super("Quillistic",
                Type.POISON, Type.NORMAL,
                new Stats(80,
                        88,
                        93,
                        45,
                        71,
                        73),
                List.of(Ability.POISON_POINT,Ability.IRON_BARBS), Ability.SCRAPPY,
                15, 170,
                new Stats(0,0,2,0,0,0), 110,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Upon evolution, Quillistic have grown their confidence. Their quills are sharp and poisonous and can be shot in any direction they choose."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Quillistic");

    }


}
