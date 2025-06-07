package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Rostone extends drai.dev.data.pokemon.Pokemon {
    public Rostone() {
        super("Rostone",
                Type.ROCK,
                new Stats(50,
                        50,
                        50,
                        50,
                        50,
                        50),
                List.of(Ability.STURDY,Ability.SOLID_ROCK), Ability.CLEAR_BODY,
                6, 560,
                new Stats(1,0,0,0,0,0), 155,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of(""),
                List.of(new EvolutionEntry("electone", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:thunder_stone"))),
                        new EvolutionEntry("moistone", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:water_stone"))),
                        new EvolutionEntry("meltone", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:fire_stone"))),
                        new EvolutionEntry("pastone", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:leaf_stone")))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Rostone");

    }


}
