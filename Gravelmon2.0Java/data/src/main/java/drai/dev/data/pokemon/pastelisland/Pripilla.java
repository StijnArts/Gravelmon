package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pripilla extends drai.dev.data.pokemon.Pokemon {
    public Pripilla() {
        super("Pripilla",
                Type.BUG, Type.NORMAL,
                new Stats(45,
                        45,
                        20,
                        45,
                        45,
                        20),
                List.of(Ability.SWARM,Ability.COMPOUND_EYES), Ability.TINTED_LENS,
                3, 12,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                44, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Pripilla's body is covered in a sticky, glue-like substance that it secretes from its mouth. This does mean it often gets stuck on other Pokémon."),
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
           setLangFileName("Pripilla");

    }


}
