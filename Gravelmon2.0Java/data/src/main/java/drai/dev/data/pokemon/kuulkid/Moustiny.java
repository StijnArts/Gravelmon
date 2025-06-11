package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Moustiny extends drai.dev.data.pokemon.Pokemon {
    public Moustiny() {
        super("Moustiny",
                Type.DARK,
                new Stats(43,
                        43,
                        25,
                        55,
                        32,
                        45),
                List.of(Ability.SCRAPPY), Ability.FILTER,
                4, 0,
                new Stats(0,0,0,1,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Despite the lack of an observed grooming behaviour, Moustiny's bristles always maintain a glossy sheen. Moustiny who reside in areas with a large human population will look slightly different to wild Moustiny as they will imitate popular moustache styles in their environment."),
                List.of(new EvolutionEntry("monstache", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HAS_MOVE,Move.GROWTH.getName())))	),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .atNight()
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Moustiny");

    }


}
