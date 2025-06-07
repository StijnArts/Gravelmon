package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Feistsea extends drai.dev.data.pokemon.Pokemon {
    public Feistsea() {
        super("Feistsea",
                Type.NORMAL, Type.WATER,
                new Stats(70,
                        80,
                        30,
                        40,
                        55,
                        60),
                List.of(Ability.COMPETITIVE), Ability.COMPETITIVE,
                5, 170,
                new Stats(1,0,0,0,0,0), 180,
                0.5,
                70, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of(""),
                List.of(new EvolutionEntry("letharleo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"30")))),
                List.of(),
                List.of(Label.ORBIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BEACH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Feistsea");

    }


}
