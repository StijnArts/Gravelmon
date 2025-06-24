package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Geckamp extends drai.dev.data.pokemon.Pokemon {
    public Geckamp() {
        super("Geckamp",
                Type.GRASS,
                new Stats(45,
                        40,
                        35,
                        70,
                        65,
                        45),
                List.of(Ability.OVERGROW), Ability.MOTOR_DRIVE,
                13, 48,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                60, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MONSTER),
                List.of("Geckamp are commonly found skittering around trees in small groups, these small groups actually generate their own small electrical field as they move."),
                List.of(new EvolutionEntry("gecktricity", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Geckamp");

    }


}
