package drai.dev.data.pokemon.tokas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Getzawyrm extends drai.dev.data.pokemon.Pokemon {
    public Getzawyrm(Stats stats) {
        super("Getzawyrm",
                Type.DRAGON, Type.GRASS,
                stats,
                List.of(Ability.FOREWARN), Ability.FOREWARN,
                21, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("As the symbiotic relationship reaches full potential, getzawyrms take on their dragon form, its minds fully merged and ferocious."),
                List.of(),
                List.of(),
                List.of(Label.TOKAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(39).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Getzawyrm");

    }


}
