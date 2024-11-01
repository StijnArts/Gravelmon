package drai.dev.data.pokemon.crozoic;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Fossoul extends drai.dev.data.pokemon.Pokemon {
    public Fossoul() {
        super("Fossoul",
                Type.ROCK,Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOLID_ROCK,Ability.CURSED_BODY), Ability.SPIRITBOUND,
                5, 180,
                new Stats(0,0,0,0,0,0), 200,
                0.0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("The residual spirit energy inside the bones gave life to the rocky matrix around it. It bounds around on the two leg-like points as if it were in zero-gravity."),
                List.of(new EvolutionEntry("soulhofen", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"26")))),
                List.of(                        ),
                List.of(Label.CROZOIC),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 11, 27, 3.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_CAVE, Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Fossoul");

    }


}
