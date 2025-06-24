package drai.dev.data.pokemon.beginnings.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class OttoranMorgrem extends drai.dev.data.pokemon.Pokemon {
    public OttoranMorgrem(String name, Aspect aspect) {
        super(name, aspect, "BeginningsanMorgrem",
                Type.FAIRY,Type.FIGHTING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 0,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("grimmsquatch", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"42")))),
                List.of(),
                List.of(Label.OTTORA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
                        .setMinLevel(32).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OLD_GROWTH_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Morgrem");

    }


}
