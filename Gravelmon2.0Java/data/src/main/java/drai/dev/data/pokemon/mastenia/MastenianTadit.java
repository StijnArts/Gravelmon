package drai.dev.data.pokemon.mastenia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class MastenianTadit extends drai.dev.data.pokemon.Pokemon {
    public MastenianTadit(String name, Aspect aspect) {
        super(name, aspect, "Tadit",
                Type.POISON, Type.DRAGON,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                6, 0,
                new Stats(0,0,0,0,0,0), 230,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("adaptoad", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(),
                List.of(Label.MASTENIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SWAMP)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tadit");

    }


}
