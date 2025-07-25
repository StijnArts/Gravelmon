package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chippunch extends drai.dev.data.pokemon.Pokemon {
    public Chippunch() {
        super("Chippunch",
                Type.FIGHTING,
                new Stats(80,
                        110,
                        80,
                        55,
                        75,
                        95),
                List.of(Ability.CHEEK_POUCH), Ability.IRON_FIST,
                16, 150,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Chippunch always store berries in their cheeks to give them an energy boost during battle. Their tail is incredibly strong often acting as a third fist."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Chippunch");

    }


}
