package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Grimlin extends drai.dev.data.pokemon.Pokemon {
    public Grimlin() {
        super("Grimlin",
                Type.DARK,
                new Stats(45,
                        40,
                        35,
                        40,
                        35,
                        60),
                List.of(Ability.PICKPOCKET,Ability.MOODY), Ability.RIVALRY,
                5, 50,
                new Stats(0,0,0,0,0,1), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Its oversized nose is a keen sensor, allowing it to sniff out potential prey or hidden treasures. Known for its aggressive nature, Grimlin is often spotted ambushing unsuspecting targets, stealing items, or playfully hurling rocks at travelers and reveling in their reactions."),
                List.of(new EvolutionEntry("grumpelstil", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "gender=male"))),
                        new EvolutionEntry("oozegrim", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY, "gender=female")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Grimlin");

    }


}
