package drai.dev.data.pokemon.terranov;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Legiana extends drai.dev.data.pokemon.Pokemon {
    public Legiana() {
        super("Legiana",
                Type.ICE, Type.FLYING,
                new Stats(71,
                        87,
                        75,
                        90,
                        100,
                        112),
                List.of(Ability.MULTISCALE), Ability.MULTISCALE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Not even the strongest winds can take away from the gracefulness with which Legiana soar high in the skies. These swift, kite-like fying wyverns emit a chilling wind from their bodies, which dull their prey's ability to escape."),
                List.of(),
                List.of(),
                List.of(Label.TERRANOV),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Legiana");

    }


}
