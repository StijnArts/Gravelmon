package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Vishuslayk extends drai.dev.data.pokemon.Pokemon {
    public Vishuslayk() {
        super("Vishuslayk",
                Type.WATER, Type.ELECTRIC,
                new Stats(96,
                        145,
                        73,
                        69,
                        100,
                        77),
                List.of(Ability.LIGHTNING_ROD,Ability.STORM_DRAIN), Ability.MOXIE,
                0, 0,
                new Stats(0,2,0,0,0,1), 60,
                0.5,
                189, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Vishuslayk, one of the most ferocious Pokemon, has a territorial feud with Gyarados. By whirling swiftly in water, Vishuslayk may electrically charge their body. It will fire sparks from its tentacles if it feels threatened."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Vishuslayk");

    }


}
