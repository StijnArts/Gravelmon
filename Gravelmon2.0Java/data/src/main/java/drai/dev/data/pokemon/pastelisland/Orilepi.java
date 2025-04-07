package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orilepi extends drai.dev.data.pokemon.Pokemon {
    public Orilepi() {
        super("Orilepi",
                Type.BUG, Type.NORMAL,
                new Stats(65,
                        90,
                        45,
                        60,
                        80,
                        55),
                List.of(Ability.SWARM,Ability.COMPOUND_EYES), Ability.TINTED_LENS,
                15, 130,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                138, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Orilepi have an incredible ability to fold leaves into sharp edges, as well as being able to create a papier mache-like substance to reinforce their fragile wings."),
                List.of(),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Orilepi");

    }


}
