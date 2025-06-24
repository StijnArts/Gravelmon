package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pangoloo extends drai.dev.data.pokemon.Pokemon {
    public Pangoloo() {
        super("Pangoloo",
                Type.ICE, Type.GROUND,
                new Stats(70,
                        30,
                        200,
                        30,
                        40,
                        30),
                List.of(Ability.DEEP_FREEZE), Ability.DEEP_FREEZE,
                14, 0,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                140, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Pangoloos live in the coldest parts of the world. Rangers in Otopo guard them to prevent poachers from collecting their frozen shell for Nevermeltice."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(23).setPool(SpawnPool.RARE).setWeight(SpawnWeight.RARE)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_FREEZING).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pangoloo");

    }


}
