package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Snuffling extends drai.dev.data.pokemon.Pokemon {
    public Snuffling() {
        super("Snuffling",
                Type.FLYING, Type.ICE,
                new Stats(30,
                        30,
                        44,
                        40,
                        56,
                        50),
                List.of(Ability.BIG_PECKS), Ability.ICE_BODY,
                4, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                50, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("- PeckSTAB Flying"),
                List.of(new EvolutionEntry("scarfly", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(8).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SNOWY).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Snuffling");

    }


}
