package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Temperock extends drai.dev.data.pokemon.Pokemon {
    public Temperock() {
        super("Temperock",
                Type.ROCK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.STURDY,Ability.SOLID_ROCK,Ability.WEAK_ARMOR), Ability.WEAK_ARMOR,
                16, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("The core is even stronger than before and the outside has also hardened but become somewhat brittle. They harden themselves both physically and mentally by secluding themselves deep in cramped caves."),
                List.of(new EvolutionEntry("diamondure", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.ROCK_POLISH.getName())))	),
                List.of(),
                List.of(Label.VARITAS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(18).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        learnSet.add(new MoveLearnSetEntry(Move.ROCK_POLISH, 35));
           setLangFileName("Temperock");

    }


}
