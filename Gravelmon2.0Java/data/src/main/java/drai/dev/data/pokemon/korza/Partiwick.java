package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Partiwick extends drai.dev.data.pokemon.Pokemon {
    public Partiwick() {
        super("Partiwick",
                Type.NORMAL,
                new Stats(66,
                        34,
                        43,
                        74,
                        42,
                        81),
                List.of(Ability.PRANKSTER,Ability.MAGICIAN), Ability.FLARE_BOOST,
                11, 175,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                119, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Enjoys showing up to parties and gatherings, cheering up small children. Lighting its head will still make it explode still, but Partiwick are now able to control its teleportation powers."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Partiwick");

    }


}
