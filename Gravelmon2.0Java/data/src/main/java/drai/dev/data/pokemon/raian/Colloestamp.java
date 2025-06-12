package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Colloestamp extends drai.dev.data.pokemon.Pokemon {
    public Colloestamp(Stats stats) {
        super("Colloestamp",
                Type.ROCK,Type.FAIRY,
                stats,
                List.of(Ability.STURDY), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Doomonic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Poltamp"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Farstamp"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"Finstamp")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Colloestamp");

    }


}
