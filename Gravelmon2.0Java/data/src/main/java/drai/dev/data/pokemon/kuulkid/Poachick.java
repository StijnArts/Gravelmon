package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Poachick extends drai.dev.data.pokemon.Pokemon {
    public Poachick() {
        super("Poachick",
                Type.FLYING,
                new Stats(60,
                        45,
                        35,
                        35,
                        25,
                        35),
                List.of(Ability.EARLYBIRD), Ability.EARLYBIRD,
                4, 0,
                new Stats(1,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Poachicks are often predated on by various other species of pokemon, putting guardian Omeledoodles and trainers on high alert when caring for them."),
                List.of(new EvolutionEntry("scrambird", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Poachick");

    }


}
