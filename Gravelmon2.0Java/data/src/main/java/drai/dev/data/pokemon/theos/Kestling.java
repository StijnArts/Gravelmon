package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Kestling extends drai.dev.data.pokemon.Pokemon {
    public Kestling() {
        super("Kestling",
                Type.FLYING,
                new Stats(45,
                        50,
                        45,
                        40,
                        40,
                        60),
                List.of(Ability.LIMBER), Ability.HUSTLE,
                3, 18,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("kestric", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"16")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DECIDUOUS_FOREST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Kestling");

    }


}
