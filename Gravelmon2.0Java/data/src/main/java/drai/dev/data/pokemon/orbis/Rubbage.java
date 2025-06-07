package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rubbage extends drai.dev.data.pokemon.Pokemon {
    public Rubbage() {
        super("Rubbage",
                Type.BUG,
                new Stats(30,
                        25,
                        60,
                        20,
                        60,
                        30),
                List.of(Ability.SWARM,Ability.SWARM), Ability.STENCH,
                3, 40,
                new Stats(0,0,1,0,1,0), 180,
                0.5,
                83, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("When the time comes for a Nappi to evolve, their bodies harden and darken resembling a trash bag. Despite their increased defences they are still incredibly timid and will remain in the dumpster it was born in."),
                List.of(new EvolutionEntry("buzzero", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"23")))),
                List.of(
                        new MoveLearnSetEntry(Move.HARDEN,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(15).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Rubbage");

    }


}
