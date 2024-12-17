package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Pummelot extends drai.dev.data.pokemon.Pokemon {
    public Pummelot() {
        super("Pummelot",
                Type.BUG,Type.FIGHTING,
                new Stats(60,
                        150,
                        85,
                        50,
                        65,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 720,
                new Stats(0,2,0,0,0,0), 80,
                0.5,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 30, 54, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER, SpawnPreset.REEF),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Pummelot");

    }


}
