package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Collecrok extends drai.dev.data.pokemon.Pokemon {
    public Collecrok() {
        super("Collecrok",
                Type.ROCK,Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(), null,
                17, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Dracnarok", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock-cave"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock-forest"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.PARTY_MEMBER,"envirock-sea")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_JUNGLE)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.JUNGLE_PYRAMID)
    .build(), List.of());
	
           setLangFileName("Collecrok");

    }


}
