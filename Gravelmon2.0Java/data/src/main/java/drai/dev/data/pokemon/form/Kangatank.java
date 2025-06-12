package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kangatank extends drai.dev.data.pokemon.Pokemon {
    public Kangatank() {
        super("Kangatank",
                Type.ROCK,Type.FIGHTING,
                new Stats(86,
                        126,
                        74,
                        45,
                        82,
                        74),
                List.of(Ability.STURDY), null,
                24, 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 54, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MOUNTAIN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kangatank");

    }


}
