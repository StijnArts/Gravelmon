package drai.dev.data.pokemon.raian;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Lyngortos extends drai.dev.data.pokemon.Pokemon {
    public Lyngortos() {
        super("Lyngortos",
                Type.WATER,Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.RAIN_DISH), null,
                45, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Whalyn", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"45")))),
                List.of(),
                List.of(Label.RAIAN),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(23)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SURFACE)
    .setBiomes(Biome.IS_SKY, Biome.IS_MOUNTAIN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.WATER_SURFACE)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
        setCanWalkOnWater(true);
           setLangFileName("Lyngortos");

    }


}
