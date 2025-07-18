package drai.dev.data.pokemon.goetia;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gastare extends drai.dev.data.pokemon.Pokemon {
    public Gastare() {
        super("Gastare",
                Type.PSYCHIC,
                new Stats(0,0,0,0,0,0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                1, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Gastare feeds on brainwaves, congregating towards the signals created by telekinesis. A single one is negligible, but en masse they can create a psychic jamming effect that can neutralize even an Alakazam."),
                List.of(new EvolutionEntry("espergo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(),
                List.of(Label.GOETIA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Gastare");

    }


}
