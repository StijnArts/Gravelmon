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
                List.of(                        ),
                List.of(Label.KUULKID),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 27, 4.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL, SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
           setLangFileName("Poachick");

    }


}
