package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Gulling extends drai.dev.data.pokemon.Pokemon {
    public Gulling() {
        super("Gulling",
                Type.FLYING,
                new Stats(50,
                        70,
                        30,
                        70,
                        30,
                        75),
                List.of(Ability.EARLY_BIRD), Ability.WIND_RIDER,
                5, 21,
                new Stats(0, 1, 0, 0, 0, 0), 225,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("With limited flying prowess, Gullings linger along steep cliffs, skillfully catching updrafts to glide through the air."),
                List.of(new EvolutionEntry("parrate", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_COAST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
        setLangFileName("Gulling");

    }


}
