package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanLitwick extends drai.dev.data.pokemon.Pokemon {
    public LagoonanLitwick(String name, Aspect aspect) {
        super(name, aspect, "Litwick",
                Type.FIRE,Type.GRASS,
                new Stats(50,
                        30,
                        55,
                        65,
                        55,
                        20),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                3, 31,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                55, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of(""),
                List.of(new EvolutionEntry("lampent lagoonan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35")))),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 11, 32, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Litwick");

    }


}
