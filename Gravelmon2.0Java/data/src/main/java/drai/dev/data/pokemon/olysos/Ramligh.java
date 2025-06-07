package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ramligh extends drai.dev.data.pokemon.Pokemon {
    public Ramligh() {
        super("Ramligh",
                Type.FIRE,
                new Stats(64,
                        46,
                        50,
                        95,
                        84,
                        65),
                List.of(Ability.BLAZE), Ability.STATIC,
                9, 200,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                141, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("A lofty Pokémon, mostly because of it's wool's appearance. And because of that they mostly keep distance to water and rain."),
                List.of(new EvolutionEntry("vulkynamo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).duringDaytime().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ramligh");

    }


}
