package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Flamfluff extends drai.dev.data.pokemon.Pokemon {
    public Flamfluff() {
        super("Flufflame",
                Type.FIRE, Type.FLYING,
                new Stats(55,
                        55,
                        65,
                        90,
                        65,
                        95),
                List.of(Ability.BLAZE), Ability.BOMBARDIER,
                9, 0,
                new Stats(0,0,0,2,0,0), 45,
                0.875,
                149, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("Demolecho", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
        setCanFly(true);
           setLangFileName("Flufflame");

    }


}
