package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Exploroid extends drai.dev.data.pokemon.Pokemon {
    public Exploroid() {
        super("Exploroid",
                Type.ELECTRIC,
                new Stats(75,
                        65,
                        75,
                        79,
                        75,
                        75),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                5, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 22, 54, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_END))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Exploroid");

    }


}
