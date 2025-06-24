package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Triceive extends drai.dev.data.pokemon.Pokemon {
    public Triceive() {
        super("Triceive",
                Type.GRASS,Type.POISON,
                new Stats(55,
                        95,
                        75,
                        55,
                        50,
                        80),
                List.of(Ability.OVERGROW), Ability.ADAPTABILITY,
                12, 122,
                new Stats(0,2,0,0,0,0), 45,
                0.75,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.GRASS),
                List.of("Triceive uses its vine-like pincers to strike opponents swiftly. Its venomous touch becomes stronger as it matures, helping it defend against larger threats."),
                List.of(new EvolutionEntry("hydrathorn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Triceive");

    }


}
