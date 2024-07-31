package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanOctillery extends drai.dev.data.pokemon.Pokemon {
    public LagoonanOctillery(String name, Aspect aspect) {
        super(name, aspect, "Octillery",
                Type.ICE,Type.POISON,
                new Stats(75,
                        95,
                        75,
                        115,
                        75,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 285,
                new Stats(0,1,0,1,0,0), 75,
                0.5,
                168, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.UNCOMMON, 24, 47, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FROZEN_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Octillery");

    }


}
