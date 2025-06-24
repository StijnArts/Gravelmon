package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tentacult extends drai.dev.data.pokemon.Pokemon {
    public Tentacult() {
        super("Tentacult",
                Type.WATER,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SUCTION_CUPS), Ability.SUCTION_CUPS,
                8, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("cultamari", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SEAFLOOR)
                        .setBiomes(Biome.IS_COLD_OCEAN).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanBreathUnderwater(true);
           setLangFileName("Tentacult");

    }


}
