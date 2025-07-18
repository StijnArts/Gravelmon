package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Chippole extends drai.dev.data.pokemon.Pokemon {
    public Chippole() {
        super("Chippole",
                Type.WATER,Type.FAIRY,
                new Stats(34,
                        43,
                        20,
                        35,
                        22,
                        45),
                List.of(Ability.MELTY), Ability.MELTY,
                3, 0,
                new Stats(1,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Chippole's shiny metallic tails help them quickly get away from potential predators. Their sweet flesh makes them a popular target for fisherman and campers."),
                List.of(new EvolutionEntry("frogolate", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(7)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_SPOOKY)
    .setSpawnPreset(SpawnPreset.UNDERWATER)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Chippole");

    }


}
