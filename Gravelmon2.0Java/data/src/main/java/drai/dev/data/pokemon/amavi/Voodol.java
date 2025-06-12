package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Voodol extends drai.dev.data.pokemon.Pokemon {
    public Voodol() {
        super("Voodol",
                Type.GHOST, Type.DARK,
                new Stats(150,
                        30,
                        30,
                        30,
                        30,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("slendurn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(           new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEER,3),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,7),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,13),
                        new MoveLearnSetEntry(Move.HYPNOSIS,17),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,22),
                        new MoveLearnSetEntry(Move.ASSURANCE,27),
                        new MoveLearnSetEntry(Move.DARK_PULSE,34),
                        new MoveLearnSetEntry(Move.MEMENTO,40)             ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .atNight()
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Voodol");

    }


}
