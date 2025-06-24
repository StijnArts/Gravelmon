package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Arveeny extends drai.dev.data.pokemon.Pokemon {
    public Arveeny() {
        super("Arveeny",
                Type.NORMAL,
                new Stats(52,
                        69,
                        30,
                        30,
                        39,
                        70),
                List.of(Ability.RUN_AWAY,Ability.PICKUP), Ability.CHEEK_POUCH,
                1, 0,
                new Stats(0,0,0,0,0,1), 255,
                0.75,
                58, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Lemmini are extremely small, making them difficult to capture. It has been said that Lemmini accidently fall of cliffs."),
                List.of(new EvolutionEntry("lemighty", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_COAST).setAntiBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Arveeny");

    }


}
