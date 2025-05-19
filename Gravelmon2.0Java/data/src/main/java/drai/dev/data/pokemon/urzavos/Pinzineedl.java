package drai.dev.data.pokemon.urzavos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pinzineedl extends drai.dev.data.pokemon.Pokemon {
    public Pinzineedl(Stats stats) {
        super("Pinzineedl",
                Type.GRASS, Type.ELECTRIC,
                stats,
                List.of(Ability.GRASSY_SURGE,Ability.ELECTRIC_SURGE), Ability.COMPETITIVE,
                11, 399,
                new Stats(0,0,0,0,0,0), 75,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Eternally grumpy, this 'Mon often sleeps curled up into a ball, its charged quills menacing those that would dare bother it."),
                List.of(),
                List.of(),
                List.of(Label.URZAVOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pinzineedl");

    }


}
