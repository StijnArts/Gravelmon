package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Spongebit extends drai.dev.data.pokemon.Pokemon {
    public Spongebit() {
        super("Spongebit",
                Type.WATER,
                new Stats(42,
                        45,
                        38,
                        32,
                        43,
                        32),
                List.of(Ability.WATER_ABSORB), Ability.WATER_ABSORB,
                3, 0,
                new Stats(0,1,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("This pokemon breathes seawater through the sizeable pores in its skin. Spongebits make their homes in discarded fruits that have sunken to the bottom of the ocean."),
                List.of(new EvolutionEntry("squarepair", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"18")))),
                List.of(),
                List.of(Label.KUULKID, Label.JOKE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(4)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER, SpawnPreset.REEF)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Spongebit");

    }


}
