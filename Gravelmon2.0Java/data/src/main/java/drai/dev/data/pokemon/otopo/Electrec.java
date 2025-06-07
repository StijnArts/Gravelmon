package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Electrec extends drai.dev.data.pokemon.Pokemon {
    public Electrec() {
        super("Electrec",
                Type.ELECTRIC,Type.DARK,
                new Stats(60,
                        74,
                        47,
                        83,
                        46,
                        90),
                List.of(Ability.STATIC), Ability.EARTH_EATER,
                10, 30,
                new Stats(0,0,0,1,0,0), 190,
                0.75,
                69, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Preferring to live in burrows, it uses its electric energy to communicate with others and sense danger. It’s often found near storms, drawn to areas with strong electrical activity."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Electrec");

    }


}
