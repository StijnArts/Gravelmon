package drai.dev.data.pokemon.lagoone.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class LagoonanHatenna extends drai.dev.data.pokemon.Pokemon {
    public LagoonanHatenna(String name, Aspect aspect) {
        super(name, aspect,"Hatenna",
                Type.FAIRY,Type.WATER,
                new Stats(42,
                        30,
                        45,
                        56,
                        53,
                        39),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                4, 34,
                new Stats(0,0,0,1,0,0), 235,
                0.0,
                53, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(new EvolutionEntry("hattrem lagoonan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(),
                List.of(Label.LAGOONE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Hatenna");

    }


}
