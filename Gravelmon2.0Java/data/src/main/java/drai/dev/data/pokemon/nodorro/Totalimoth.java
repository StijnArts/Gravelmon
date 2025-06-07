package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Totalimoth extends drai.dev.data.pokemon.Pokemon {
    public Totalimoth() {
        super("Totalimoth",
                Type.BUG, Type.LIGHT,
                new Stats(101,
                        60,
                        102,
                        115,
                        102,
                        70),
                List.of(Ability.FLUFFY), Ability.OVERCOAT,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("For thousands of years, Totalimoth have been worshipped by ancient cultures as messangers of the moon. Legends say that every time Totalimoth lost faith in humanity, it was able to convince the moon to cover the sun as punishment."),
                List.of(),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Totalimoth");

    }


}
