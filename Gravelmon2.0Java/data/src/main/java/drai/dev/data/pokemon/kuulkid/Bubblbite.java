package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bubblbite extends drai.dev.data.pokemon.Pokemon {
    public Bubblbite() {
        super("Bubblbite",
                Type.BUG,Type.FAIRY,
                new Stats(40,
                        32,
                        33,
                        39,
                        49,
                        37),
                List.of(Ability.POISON_POINT), Ability.ANTICIPATION,
                1, 0,
                new Stats(0,0,0,0,1,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Even at a young age, venom from a Bubblbite bite can be lethal. Wild pokemon are easily able to spot this pokemon's vibrant colouration and steer clear from them and its evolution."),
                List.of(new EvolutionEntry("gumbarachnid", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Bubblbite");

    }


}
