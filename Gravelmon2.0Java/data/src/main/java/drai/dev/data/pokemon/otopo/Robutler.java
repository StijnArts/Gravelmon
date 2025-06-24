package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Robutler extends drai.dev.data.pokemon.Pokemon {
    public Robutler() {
        super("Robutler",
                Type.STEEL, Type.ELECTRIC,
                new Stats(35,
                        25,
                        70,
                        95,
                        55,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 0,
                new Stats(0,0,0,1,0,0), 160,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("They were designed to assist trainers with everyday duties and housework who have hectic schedules. When it is angry, it finds it difficult to conceal its feelings and will change its countenance."),
                List.of(new EvolutionEntry("waitroid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.MANSION).build(),
                List.of());
           setLangFileName("Robutler");

    }


}
