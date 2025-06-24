package drai.dev.data.pokemon.ruskow;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spectung extends drai.dev.data.pokemon.Pokemon {
    public Spectung() {
        super("Spectung",
                Type.GHOST,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 0,
                new Stats(0,0,0,0,0,0), 210,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("hauntung", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(),
                List.of(Label.RUSKOW),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(11).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).atNight().canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Spectung");

    }


}
