package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Mantilist extends drai.dev.data.pokemon.Pokemon {
    public Mantilist() {
        super("Mantilist",
                Type.BUG,Type.FIGHTING,
                new Stats(30,
                        85,
                        65,
                        40,
                        50,
                        50),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 233,
                new Stats(0,1,0,0,0,0), 180,
                0.5,
                70, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_3),
                List.of(""),
                List.of(new EvolutionEntry("pummelot", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SEAFLOOR)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Mantilist");

    }


}
