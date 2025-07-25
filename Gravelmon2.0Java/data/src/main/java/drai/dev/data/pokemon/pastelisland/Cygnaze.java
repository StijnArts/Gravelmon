package drai.dev.data.pokemon.pastelisland;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cygnaze extends drai.dev.data.pokemon.Pokemon {
    public Cygnaze() {
        super("Cygnaze",
                Type.FIRE,
                new Stats(60,
                        90,
                        60,
                        60,
                        50,
                        85),
                List.of(Ability.BLAZE), Ability.DAZZLING,
                24, 154,
                new Stats(0,2,0,0,0,0), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.FLYING),
                List.of("Cygnaze have a quiet demeanor, liking to sit alone on shores. But they can be very loud and thrashing when threatened."),
                List.of(new EvolutionEntry("inphoeno", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"36")))),
                List.of(),
                List.of(Label.PASTEL_ISLAND),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_BIRCH).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Cygnaze");

    }


}
