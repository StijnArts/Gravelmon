package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Wizzip extends drai.dev.data.pokemon.Pokemon {
    public Wizzip() {
        super("Wizzip",
                Type.BUG, Type.FLYING,
                new Stats(90,
                        100,
                        60,
                        80,
                        60,
                        90),
                List.of(Ability.ADAPTABILITY), Ability.CORROSION,
                16, 90,
                new Stats(0,2,0,0,0,1), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Wizzip don't stop moving and sporatically buzz around until they find something to eat. Their saliva is acidic enough to melt through metal, making them a nuisance in cities."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Wizzip");

    }


}
