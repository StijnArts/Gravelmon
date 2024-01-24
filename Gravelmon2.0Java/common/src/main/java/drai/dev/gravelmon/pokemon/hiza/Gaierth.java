package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Gaierth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gaierth() {
        super("Gaierth",
                Type.GRASS,Type.BUG,
                new Stats(75,
                        80,
                        100,
                        165,
                        130,
                        120),
                List.of(Ability.GRASSY_SURGE), Ability.GRASSY_SURGE,
                8, 165,
                new Stats(0,0,0,2,1,0), 3,
                0.0,
                302, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("By flapping its majestic wings, it constantly spreads various seeds that fully grow in mere seconds. It is deeply connected with the region of Hiza and all Pokémon that inhabit it."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gaierth");

    }


}
