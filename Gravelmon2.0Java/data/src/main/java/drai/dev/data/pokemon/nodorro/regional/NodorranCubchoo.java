package drai.dev.data.pokemon.nodorro.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class NodorranCubchoo extends drai.dev.data.pokemon.Pokemon {
    public NodorranCubchoo(String name, Aspect aspect) {
        super(name, aspect, "Cubchoo",
                Type.FIRE,
                new Stats(50,
                        35,
                        60,
                        70,
                        60,
                        30),
                List.of(Ability.FLAME_BODY), Ability.HUGE_POWER,
                5, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("- Growl Normal 2 Tackle Normal 5 EmberSTAB Fire 18 Burning SneezeSTAB Fire"),
                List.of(new EvolutionEntry("nodorranbeartic", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,2),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.BURNINGSNEEZE,18)                        ),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_NETHER_FOREST)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cubchoo");

    }


}
