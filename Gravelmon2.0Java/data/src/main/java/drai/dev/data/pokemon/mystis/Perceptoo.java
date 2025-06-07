package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Perceptoo extends drai.dev.data.pokemon.Pokemon {
    public Perceptoo() {
        super("Perceptoo",
                Type.PSYCHIC, Type.FLYING,
                new Stats(43,
                        70,
                        36,
                        75,
                        39,
                        77),
                List.of(Ability.INSOMNIA,Ability.PERCEIVE), Ability.CLAIRVOYANCE,
                4, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("It can use the blue spot on its forehead to see the future. Judging by how it reacts shortly after, a trainer can somewhat tell whats going to happen."),
                List.of(new EvolutionEntry("cocadoom", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Perceptoo");

    }


}
