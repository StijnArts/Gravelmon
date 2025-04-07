package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Divernaut extends drai.dev.data.pokemon.Pokemon {
    public Divernaut() {
        super("Divernaut",
                Type.WATER,
                new Stats(90,
                        75,
                        85,
                        53,
                        70,
                        38),
                List.of(Ability.TORRENT), Ability.HYDRATION,
                8, 0,
                new Stats(2,0,0,0,0,0), 0,
                0.875,
                144, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(new EvolutionEntry("tarpress", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"37")))),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Divernaut");

    }


}
