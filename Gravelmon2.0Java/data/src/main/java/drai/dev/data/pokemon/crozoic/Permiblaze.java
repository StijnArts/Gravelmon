package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Permiblaze extends drai.dev.data.pokemon.Pokemon {
    public Permiblaze(Stats stats) {
        super("Permiblaze",
                Type.FIRE,Type.DARK,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                19, 1560,
                new Stats(0,0,0,0,0,0), 3,
                0.0,
                0, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("It emerged from the depths of the earth one day. It implacably charges forth like a wildfire, consuming all in its path and growing exponentially larger."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASSURANCE,1),
                        new MoveLearnSetEntry(Move.ERUPTION,1),
                        new MoveLearnSetEntry(Move.SNARL,1),
                        new MoveLearnSetEntry(Move.INFERNO,1),
                        new MoveLearnSetEntry(Move.ROAR,1),
                        new MoveLearnSetEntry(Move.STOKE,1),
                        new MoveLearnSetEntry(Move.SMOKESCREEN,1),
                        new MoveLearnSetEntry(Move.PUNISHMENT,1),
                        new MoveLearnSetEntry(Move.MOLTENDEFENSE,1),
                        new MoveLearnSetEntry(Move.FISSURE,1),
                        new MoveLearnSetEntry(Move.SMOKEBOMB,1),
                        new MoveLearnSetEntry(Move.SINISTERTERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOWFALL,"tm")                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_VOLCANIC)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Permiblaze");

    }


}
