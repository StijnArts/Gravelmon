package drai.dev.data.pokemon.beginnings;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Coulimb extends drai.dev.data.pokemon.Pokemon {
    public Coulimb() {
        super("Coulimb",
                Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("ampylon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.VERY_COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TEMPERATE).isThundering().canSeeSky()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Coulimb");

    }


}
