package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hydrathorn extends drai.dev.data.pokemon.Pokemon {
    public Hydrathorn() {
        super("Hydrathorn",
                Type.GRASS,Type.POISON,
                new Stats(75,
                        125,
                        85,
                        75,
                        75,
                        100),
                List.of(Ability.OVERGROW), Ability.ADAPTABILITY,
                20, 1500,
                new Stats(0,3,0,0,0,0), 45,
                0.5,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Hydrathorn's body is covered in thick thorn-like growths, which it uses to launch fierce strikes. It is a dangerous predator in the wild, using its vine-like arms to both attack and ensnare its prey."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Hydrathorn");

    }


}
