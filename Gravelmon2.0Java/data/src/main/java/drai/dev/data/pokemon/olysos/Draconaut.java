package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Draconaut extends drai.dev.data.pokemon.Pokemon {
    public Draconaut() {
        super("Draconaut",
                Type.DRAGON, Type.PSYCHIC,
                new Stats(45,
                        40,
                        50,
                        60,
                        50,
                        70),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 100,
                new Stats(0,0,0,0,0,1), 45,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.AMORPHOUS),
                List.of("Draconaut hatchlings are born from comet eggs that crash-land on Earth. They spend their early days floating around in search of food, using their powerful feet and hand flames to propel themselves through the air. Despite their small size, they are highly intelligent and possess a strong connection to the cosmos."),
                List.of(new EvolutionEntry("nebulazer", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .pseudoLegend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_END)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Draconaut");

    }


}
