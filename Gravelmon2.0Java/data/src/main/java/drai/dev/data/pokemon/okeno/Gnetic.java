package drai.dev.data.pokemon.okeno;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gnetic extends drai.dev.data.pokemon.Pokemon {
    public Gnetic() {
        super("Gnetic",
                Type.QUESTION_MARK,
                new Stats(80,
                        80,
                        80,
                        80,
                        80,
                        80),
                List.of(Ability.SIMPLE), Ability.SIMPLE,
                4, 165,
                new Stats(8,0,0,0,0,0), 20,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DITTO),
                List.of("A strange Pokemon created in a lab. It's cellular structure was made incredibly stable, so it began to be used in a variety of tests."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE, 1)
                ),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .mythical()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DEEP_DARK)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("G-netic");

    }


}
