package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Baybee extends drai.dev.data.pokemon.Pokemon {
    public Baybee() {
        super("Baybee",
                Type.BUG, Type.GROUND,
                new Stats(30,
                        30,
                        80,
                        30,
                        60,
                        30),
                List.of(Ability.RATTLED), Ability.RATTLED,
                2, 4,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                43, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Baybee live in large urbanised areas where the older generation will build up structures for them to reside in until they are ready to evolve. When predators are near they bury underground leaving only their tails exposed."),
                List.of(new EvolutionEntry("diggbee", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22"))),
                        new EvolutionEntry("drillbee", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22"))),
                        new EvolutionEntry("honarchee", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "gender=female")))),
                List.of(
                        new MoveLearnSetEntry(Move.DIG,1)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
           setLangFileName("Baybee");

    }


}
