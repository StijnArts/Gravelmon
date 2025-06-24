package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plasmapod extends drai.dev.data.pokemon.Pokemon {
    public Plasmapod(Stats stats) {
        super("Plasmapod",
                Type.WATER,Type.ELECTRIC,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                16, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Plasmapod can generate large amounts of electricity in the organ in the back of its head. It can expel this electricity out of its sucker and frequently electrifies the water in an entire area to paralyze it's prey."),
                List.of(),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_LUKEWARM_OCEAN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setAquatic();
           setLangFileName("Plasmapod");

    }


}
