package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bricklair extends drai.dev.data.pokemon.Pokemon {
    public Bricklair() {
        super("Bricklair",
                Type.ROCK, Type.GROUND,
                new Stats(70,
                        60,
                        70,
                        30,
                        50,
                        20),
                List.of(Ability.STURDY), Ability.SOLID_ROCK,
                8, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("castlossus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MOUNTAIN).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Bricklair");

    }


}
