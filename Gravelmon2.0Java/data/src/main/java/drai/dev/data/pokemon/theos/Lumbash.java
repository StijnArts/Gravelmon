package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lumbash extends drai.dev.data.pokemon.Pokemon {
    public Lumbash() {
        super("Lumbash",
                Type.FIGHTING,
                new Stats(80,
                        120,
                        90,
                        55,
                        75,
                        70),
                List.of(Ability.SAP_SIPPER), Ability.TECHNICIAN,
                17, 850,
                new Stats(0,2,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Their constant chewing has strenthened their teeth, allowing them to bite through large trees with ease. They carry around said trees to use as a weapon."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
           setLangFileName("Lumbash");

    }


}
