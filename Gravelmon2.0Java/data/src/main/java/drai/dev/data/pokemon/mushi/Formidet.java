package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Formidet extends drai.dev.data.pokemon.Pokemon {
    public Formidet() {
        super("Formidet",
                Type.FIRE, Type.BUG,
                new Stats(56,
                        65,
                        70,
                        90,
                        60,
                        70),
                List.of(Ability.BLAZE), Ability.FLASH_FIRE,
                9, 0,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("formillant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Formidet");

    }


}
