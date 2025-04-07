package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Molore extends drai.dev.data.pokemon.Pokemon {
    public Molore() {
        super("Molore",
                Type.ELECTRIC, Type.GROUND,
                new Stats(50,
                        60,
                        80,
                        35,
                        55,
                        30),
                List.of(Ability.STATIC), Ability.SAND_VEIL,
                4, 65,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                64, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Molore is known for its impressive burrowing skills, which it uses to navigate underground tunnels and create its own burrows. Its back is covered in spikey, electrically charged fur that can stun predators, making it difficult for them to attack. Despite its clumsy appearance, Molore is surprisingly quick and nimble when it needs to be, using its sharp claws to dig through soil and rocks."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Molore");

    }


}
