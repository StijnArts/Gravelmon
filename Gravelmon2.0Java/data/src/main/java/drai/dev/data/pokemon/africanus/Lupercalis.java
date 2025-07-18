package drai.dev.data.pokemon.africanus;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lupercalis extends drai.dev.data.pokemon.Pokemon {
    public Lupercalis() {
        super("Lupercalis",
                Type.GRASS,Type.FAIRY,
                new Stats(100,
                        55,
                        75,
                        85,
                        130,
                        110),
                List.of(Ability.CLEAR_BODY), null,
                20, 1000,
                new Stats(0,0,0,0,2,1), 45,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.GRASS),
                List.of("La leyenda cuenta que fue uno de sus ascendientes fue la que amamantó a Rómulo y Remo, los fundadores de Roma."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROMULO,55),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,48),
                        new MoveLearnSetEntry(Move.EXTRASENSORY,38),
                        new MoveLearnSetEntry(Move.PSYCHIC,44)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(3)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Lupercalis");

    }


}
