package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Escargoo extends drai.dev.data.pokemon.Pokemon {
    public Escargoo() {
        super("Escargoo",
                Type.POISON, Type.ICE,
                new Stats(100,
                        75,
                        125,
                        65,
                        80,
                        55),
                List.of(Ability.WEAK_ARMOR,Ability.LIQUID_OOZE), Ability.HYDRATION,
                19, 0,
                new Stats(0,0,2,0,0,0), 80,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("The fluid leaking from Escargoo's shell is extremely dangerous. Under the toxicity of its secretions, even its shell is beginning to fracture."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(30).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Escargoo");

    }


}
