package drai.dev.data.pokemon.crozoic;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gorgonox  extends drai.dev.data.pokemon.Pokemon {
    public Gorgonox() {
        super("Oxygryph",
                Type.POISON,Type.NORMAL,
                new Stats(70,
                        100,
                        70,
                        75,
                        70,
                        105),
                List.of(Ability.POISON_POINT), Ability.POISONHEAL,
                15, 114,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                161, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FLYING),
                List.of("Three pairs of wings give it unparalleled maneuverability in the air. Because it's so light, it can freely leap between clouds as if they were completely solid."),
                List.of(),
                List.of(                   ),
                List.of(Label.CROZOIC),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());

    }
}
