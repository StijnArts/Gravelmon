package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bullit extends drai.dev.data.pokemon.Pokemon {
    public Bullit() {
        super("Bullit",
                Type.FIRE,
                new Stats(60,
                        55,
                        65,
                        50,
                        55,
                        40),
                List.of(Ability.BLAZE), Ability.ANGER_POINT,
                6, 60,
                new Stats(0,0,1,0,0,0), 45,
                0.75,
                61, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
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
           setLangFileName("Bullit");

    }


}
