package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mulic extends drai.dev.data.pokemon.Pokemon {
    public Mulic() {
        super("Mulic",
                Type.PSYCHIC,Type.GROUND,
                new Stats(40,
                        60,
                        80,
                        50,
                        60,
                        75),
                List.of(Ability.HARVEST,Ability.STAMINA), Ability.SHEER_FORCE,
                10, 297,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Mulic are renowned for having a stubborn disposition, but also being hard workers. When tired, they can keep working using telekinetic power."),
                List.of(),
                List.of(),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Mulic");

    }


}
