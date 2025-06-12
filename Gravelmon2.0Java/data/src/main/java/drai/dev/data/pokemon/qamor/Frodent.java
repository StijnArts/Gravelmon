package drai.dev.data.pokemon.qamor;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Frodent extends drai.dev.data.pokemon.Pokemon {
    public Frodent() {
        super("Frodent",
                Type.ICE, Type.NORMAL,
                new Stats(70,
                        42,
                        40,
                        55,
                        41,
                        55),
                List.of(Ability.RUN_AWAY), Ability.SLEET,
                3, 165,
                new Stats(1,0,0,0,0,0), 200,
                0.5,
                61, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FAIRY),
                List.of("Frodent live in the frozen forests and hide among winter shrubbery. They are very receptive and willing to try new things."),
                List.of(new EvolutionEntry("bunbrisk", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,6),
                        new MoveLearnSetEntry(Move.COVET,12),
                        new MoveLearnSetEntry(Move.MIST,16)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Frodent");

    }


}
