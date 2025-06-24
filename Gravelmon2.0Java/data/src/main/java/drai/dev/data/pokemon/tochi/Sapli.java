package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Sapli extends drai.dev.data.pokemon.Pokemon {
    public Sapli() {
        super("Sapli",
                Type.GRASS,
                new Stats(67,
                        88,
                        78,
                        37,
                        57,
                        78),
                List.of(Ability.OVERGROW), Ability.STAKEOUT,
                6, 250,
                new Stats(0,2,0,0,0,0), 45,
                0.8,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Sapli survive the winter by stealing from other Pokemon's food stores. They are generally not well liked by other Pokemon for this reason."),
                List.of(new EvolutionEntry("coatimber", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Sapli");

    }


}
