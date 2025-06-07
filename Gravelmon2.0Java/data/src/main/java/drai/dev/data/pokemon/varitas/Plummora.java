package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Plummora extends drai.dev.data.pokemon.Pokemon {
    public Plummora() {
        super("Plummora",
                Type.FAIRY,Type.FLYING,
                new Stats(83,
                        55,
                        90,
                        130,
                        81,
                        86),
                List.of(Ability.OWN_TEMPO,Ability.DAZZLING), Ability.MAGIC_BOUNCE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("When it spreads out the feathers around its neck, they refract light to create a brilliant bluish green glow. It uses this ability mainly for elaborate mating dances. This flower-like orientation of feathers is oddly similar to Glimmora which gave it its name"),
                List.of(),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Plummora");

    }


}
