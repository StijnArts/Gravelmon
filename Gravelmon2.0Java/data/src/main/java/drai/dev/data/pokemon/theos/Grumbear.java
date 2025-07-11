package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grumbear extends drai.dev.data.pokemon.Pokemon {
    public Grumbear() {
        super("Grumbear",
                Type.NORMAL, Type.DARK,
                new Stats(150,
                        85,
                        65,
                        50,
                        85,
                        65),
                List.of(Ability.ANGER_POINT), Ability.FUR_COAT,
                23, 1180,
                new Stats(3,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The only time Grumbear are at peace is when they're hibernating. If awoken too early, they will go into a frenzy attacking everything they see."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(34).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Grumbear");

    }


}
