package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tremole extends drai.dev.data.pokemon.Pokemon {
    public Tremole() {
        super("Tremole",
                Type.GROUND, Type.STEEL,
                new Stats(110,
                        105,
                        90,
                        50,
                        65,
                        88),
                List.of(Ability.INSOMNIA), Ability.SAND_FORCE,
                17, 810,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tremole arms act as drills allowing it to dig large tunnels underground with ease. They constantly get into territory disputes with Burroworm, often caving in each others tunnels."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Tremole");

    }


}
