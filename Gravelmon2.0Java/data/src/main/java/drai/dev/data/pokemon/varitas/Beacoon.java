package drai.dev.data.pokemon.varitas;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Beacoon extends drai.dev.data.pokemon.Pokemon {
    public Beacoon() {
        super("Beacoon",
                Type.BUG,
                new Stats(75,
                        20,
                        80,
                        65,
                        75,
                        15),
                List.of(Ability.ILLUMINATE), Ability.ILLUMINATE,
                5, 165,
                new Stats(0,0,0,0,0,0), 120,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Large amounts of energy stored for evolution cause Beacoon to glow slightly. Large groups of them often hang from branches, lighting the way of people and pokemon travelling through forests."),
                List.of(new EvolutionEntry("fulgoryu", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.FLASH,1)                        ),
                List.of(Label.VARITAS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(11)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BAMBOO)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Beacoon");

    }


}
