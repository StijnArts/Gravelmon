package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flambah extends drai.dev.data.pokemon.Pokemon {
    public Flambah() {
        super("Flambah",
                Type.FIRE,
                new Stats(50,
                        69,
                        40,
                        34,
                        60,
                        50),
                List.of(Ability.BLAZE), Ability.STATIC,
                4, 52,
                new Stats(0,0,0,1,0,0), 45,
                0.87,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Its horns are constantly powered with a high heat from the inside, which, if wanted, can reach a temperature of up to 500°. It depends mostly on the mood."),
                List.of(new EvolutionEntry("ramligh", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).duringDaytime().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Flambah");

    }


}
