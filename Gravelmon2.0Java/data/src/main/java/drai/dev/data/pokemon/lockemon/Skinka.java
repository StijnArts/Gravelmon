package drai.dev.data.pokemon.lockemon;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Skinka extends Pokemon {
    public Skinka() {
        super("Skinka",
                Type.NORMAL,
                new Stats(55,
                        55,
                        65,
                        45,
                        50,
                        55),
                List.of(Ability.ROUGH_SKIN, Ability.ADAPTABILITY), Ability.PROTEAN,
                3, 65,
                new Stats(0,0,0,1,0,0), 45,
                0.875,
                65, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.DRAGON),
                List.of("Known for their trademark blue tongue, these mischievous Pokémon are always ready for a fight. Skinka have the uncanny ability to adapt and evolve based on their surroundings, making them a perfect fit for Kaskade’s rapid climate."),
                List.of(new EvolutionEntry("dredgen", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=ground\""))),
                        new EvolutionEntry("stalagen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=rock\""))),
                        new EvolutionEntry("chromagen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=steel\""))),
                        new EvolutionEntry("aerogen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=flying\""))),
                        new EvolutionEntry("caragen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=bug\""))),
                        new EvolutionEntry("bludgen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=fighting\""))),
                        new EvolutionEntry("pathagen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=poison\""))),
                        new EvolutionEntry("ectogen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=ghost\""))),
                        new EvolutionEntry("legen", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"\"type=dragon\"")))),
                List.of(
                ),
                List.of(Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 5, 33, 4.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TEMPERATE, Biome.IS_ARID))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
