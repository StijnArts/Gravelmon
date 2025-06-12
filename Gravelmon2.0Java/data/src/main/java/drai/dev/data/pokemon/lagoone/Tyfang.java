package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tyfang extends drai.dev.data.pokemon.Pokemon {
    public Tyfang() {
        super("Tyfang",
                Type.DRAGON,Type.FLYING,
                new Stats(42,
                        40,
                        38,
                        75,
                        62,
                        64),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                9, 2,
                new Stats(0,0,0,1,0,0), 180,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of(""),
                List.of(new EvolutionEntry("furycane", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_OCEAN)
    .canSeeSky()
    .isRaining()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanFly(true);
           setLangFileName("Tyfang");

    }


}
