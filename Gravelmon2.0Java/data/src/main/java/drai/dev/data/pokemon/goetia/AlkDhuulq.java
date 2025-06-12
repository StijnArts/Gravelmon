package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AlkDhuulq extends drai.dev.data.pokemon.Pokemon {
    public AlkDhuulq(Stats stats) {
        super("AlkDhuulq",
                Type.DARK, Type.ROCK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                48, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .abnormality()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Alk'Dhuulq");

    }


}
