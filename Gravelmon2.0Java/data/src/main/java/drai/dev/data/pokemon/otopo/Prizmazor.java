package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Prizmazor extends drai.dev.data.pokemon.Pokemon {
    public Prizmazor() {
        super("Prizmazor",
                Type.DRAGON,
                new Stats(82,
                        140,
                        74,
                        100,
                        80,
                        124),
                List.of(Ability.SHED_SKIN,Ability.MARVEL_SCALE), Ability.MULTISCALE,
                20, 907,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                210, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.MONSTER),
                List.of("Prizmazor's carapace has bleached due to the immense power that it contains. One blast from a Prizmazor's Hyper Beam is enough to tear through a mountain."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPER_BEAM,1)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Prizmazor");

    }


}
