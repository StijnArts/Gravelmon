package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Barode extends drai.dev.data.pokemon.Pokemon {
    public Barode() {
        super("Barode",
                Type.ROCK,
                new Stats(40,
                        45,
                        110,
                        35,
                        35,
                        35),
                List.of(Ability.STURDY), Ability.STRONG_JAW,
                5, 191,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Barode's hard teeth are specialized for scrayquaza minerals off of stalagmites. Jewel maniacs used to poach them for their teeth, but this practice has since been banned."),
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
           setLangFileName("Barode");

    }


}
