package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Soaraptor extends drai.dev.data.pokemon.Pokemon {
    public Soaraptor() {
        super("Soaraptor",
                Type.ELECTRIC, Type.FLYING,
                new Stats(71,
                        84,
                        71,
                        104,
                        81,
                        111),
                List.of(Ability.SOLAR_POWER), Ability.AERILATE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("It stores energy in its wings. During stormy weather, most of them can be seen flying around in the sky, gathering electrons in the atmosphere."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.MAGNETIC_FLUX,1),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,"tm")                        ),
                List.of(Label.OKENO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Soaraptor");

    }


}
