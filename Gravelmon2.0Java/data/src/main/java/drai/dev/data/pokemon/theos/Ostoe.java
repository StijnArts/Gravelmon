package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ostoe extends drai.dev.data.pokemon.Pokemon {
    public Ostoe() {
        super("Ostoe",
                Type.NORMAL, Type.FLYING,
                new Stats(45,
                        70,
                        50,
                        35,
                        50,
                        75),
                List.of(Ability.WEAK_ARMOR), Ability.TANGLED_FEET,
                6, 50,
                new Stats(0,0,0,0,0,1), 230,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ostoe are quiet clumsy and often fall over due to their large feet. Despite this, they are capable of running a mile in only a few minutes."),
                List.of(new EvolutionEntry("ostretch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"31")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SAVANNA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Ostoe");

    }


}
