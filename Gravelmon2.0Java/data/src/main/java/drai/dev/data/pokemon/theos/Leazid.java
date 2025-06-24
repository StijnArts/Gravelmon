package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Leazid extends drai.dev.data.pokemon.Pokemon {
    public Leazid() {
        super("Leazid",
                Type.GRASS,
                new Stats(45,
                        70,
                        50,
                        55,
                        50,
                        55),
                List.of(Ability.OVERGROW), Ability.ADAPTABILITY,
                6, 45,
                new Stats(0,1,0,0,0,0), 45,
                0.75,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Leazid are curious and energetic Pokémon that uses its strong pincers to grab onto branches and leaves, helping it balance in the trees."),
                List.of(new EvolutionEntry("triceive", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Leazid");

    }


}
