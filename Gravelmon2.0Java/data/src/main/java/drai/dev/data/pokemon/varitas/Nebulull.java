package drai.dev.data.pokemon.varitas;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Nebulull extends drai.dev.data.pokemon.Pokemon {
    public Nebulull() {
        super("Nebulull",
                Type.PSYCHIC,Type.ELECTRIC,
                new Stats(40,
                        15,
                        55,
                        65,
                        75,
                        35),
                List.of(Ability.VOLT_ABSORB,Ability.ANALYTIC), Ability.TECHNICIAN,
                3, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("A recently discovered extrateresstrial pokemon mistaken for Morelull. It can concentrate eletricity into the antennae on its head and fire off lasers. Scientists are still debating whether the resemblence to Morelull is truly coincidental or if Morelull is some kind of relative that adapted to life on Earth."),
                List.of(new EvolutionEntry("Xenotic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.RARE).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BADLANDS).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Nebulull");

    }


}
