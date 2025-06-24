package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Younoes extends drai.dev.data.pokemon.Pokemon {
    public Younoes() {
        super("Younoes",
                Type.GHOST, Type.PSYCHIC,
                new Stats(80,
                        35,
                        55,
                        85,
                        80,
                        70),
                List.of(Ability.KEEN_EYE,Ability.FOREWARN), Ability.LEVITATE,
                16, 108,
                new Stats(0,0,0,2,0,0), 120,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Younoes can pass through walls allowing them to sneak into homes and scare the people living there, though they have never been recorded harming anybody."),
                List.of(new EvolutionEntry("eyenoes", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(24).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Younoes");

    }


}
