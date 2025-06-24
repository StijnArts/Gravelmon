package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pixcess extends drai.dev.data.pokemon.Pokemon {
    public Pixcess() {
        super("Pixcess",
                Type.POISON, Type.FAIRY,
                new Stats(57,
                        40,
                        65,
                        86,
                        73,
                        49),
                List.of(Ability.SHIELD_DUST), Ability.SERENE_GRACE,
                8, 68,
                new Stats(0,0,0,2,0,0), 110,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution, Pixcess are able to greater control their spores allowing them to be used to greater effect in battle."),
                List.of(new EvolutionEntry("elegantus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MUSHROOM, Biome.IS_BIRCH).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pixcess");

    }


}
