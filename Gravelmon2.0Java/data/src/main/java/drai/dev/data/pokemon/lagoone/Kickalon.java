package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kickalon extends drai.dev.data.pokemon.Pokemon {
    public Kickalon() {
        super("Kickalon",
                Type.FIGHTING,Type.FLYING,
                new Stats(85,
                        119,
                        50,
                        80,
                        60,
                        91),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 320,
                new Stats(0,1,0,0,0,1), 75,
                0.5,
                170, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 54, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BIRCH))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kickalon");

    }


}
