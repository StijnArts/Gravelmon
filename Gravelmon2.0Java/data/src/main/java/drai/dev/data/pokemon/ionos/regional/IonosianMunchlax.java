package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianMunchlax extends drai.dev.data.pokemon.Pokemon {
    public IonosianMunchlax(String name, Aspect aspect) {
        super(name, aspect, "Munchlax",
                Type.GRASS, Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("snorlax ionosian", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.FRIENDSHIP,"210")))),
                List.of(         new MoveLearnSetEntry(Move.GROWTH,1),
                        new MoveLearnSetEntry(Move.VINE_WHIP,5),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,10),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,14),
                        new MoveLearnSetEntry(Move.SEED_BOMB,19),
                        new MoveLearnSetEntry(Move.BANANARANG,25),
                        new MoveLearnSetEntry(Move.RETALIATE,28),
                        new MoveLearnSetEntry(Move.SYNTHESIS,33),
                        new MoveLearnSetEntry(Move.POWER_WHIP,45)               ),
                List.of(Label.IONOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_WINTER, Biome.IS_SUMMER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Munchlax");

    }


}
