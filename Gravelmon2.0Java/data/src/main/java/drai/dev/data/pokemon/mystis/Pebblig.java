package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pebblig extends drai.dev.data.pokemon.Pokemon {
    public Pebblig() {
        super("Pebblet",
                Type.DARK, Type.ROCK,
                new Stats(70,
                        80,
                        60,
                        50,
                        30,
                        40),
                List.of(Ability.GLUTTONY), Ability.ANGER_POINT,
                9, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                66, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Pebblet's stone body is inhabited by crystals made of malice. If the crystals are shattered, Pebblet stops moving."),
                List.of(new EvolutionEntry("bulbasaur", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"type=dark")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(18).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Pebblet");

    }


}
