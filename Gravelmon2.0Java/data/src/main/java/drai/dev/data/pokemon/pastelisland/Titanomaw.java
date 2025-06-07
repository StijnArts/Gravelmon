package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Titanomaw extends drai.dev.data.pokemon.Pokemon {
    public Titanomaw() {
        super("Titanomaw",
                Type.GROUND, Type.DARK,
                new Stats(60,
                        80,
                        80,
                        60,
                        75,
                        55),
                List.of(Ability.DRY_SKIN,Ability.MOXIE), Ability.MARVEL_SCALE,
                79, 1220,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                185, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.MINERAL),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Titanomaw");

    }


}
