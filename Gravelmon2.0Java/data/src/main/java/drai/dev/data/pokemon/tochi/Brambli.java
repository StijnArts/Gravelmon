package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Brambli extends drai.dev.data.pokemon.Pokemon {
    public Brambli() {
        super("Brambli",
                Type.GRASS,
                new Stats(52,
                        73,
                        63,
                        22,
                        42,
                        63),
                List.of(Ability.OVERGROW), Ability.STAKEOUT,
                3, 70,
                new Stats(0,1,0,0,0,0), 45,
                0.8,
                63, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Brambli are natural foragers and hide their findings in their bush like tail. They can be very mischievous around humans!"),
                List.of(new EvolutionEntry("sapli", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Brambli");

    }


}
