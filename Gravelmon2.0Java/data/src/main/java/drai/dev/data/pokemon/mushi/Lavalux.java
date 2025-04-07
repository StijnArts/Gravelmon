package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lavalux extends drai.dev.data.pokemon.Pokemon {
    public Lavalux() {
        super("Lavalux",
                Type.BUG, Type.PSYCHIC,
                new Stats(39,
                        33,
                        32,
                        75,
                        64,
                        37),
                List.of(Ability.TINTED_LENS,Ability.OBLIVIOUS), Ability.PSYCHIC_SURGE,
                5, 0,
                new Stats(0,0,0,1,0,0), 255,
                0.5,
                36, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("lampod", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_MAGICAL).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Lavalux");

    }


}
