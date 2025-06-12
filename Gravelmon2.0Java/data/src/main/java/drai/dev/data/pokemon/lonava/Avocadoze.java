package drai.dev.data.pokemon.lonava;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Avocadoze extends drai.dev.data.pokemon.Pokemon {
    public Avocadoze() {
        super("Avocadoze",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.COMATOSE), Ability.COMATOSE,
                2, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This sleepy Pokemon never wakes for anything, often leaving it vulnerable to predators. As a result of this, Avocadoze has become an endangered species. If spotted, Lonavan locals will place them somewhere obscured and away from harm."),
                List.of(new EvolutionEntry("avocallite", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(           new MoveLearnSetEntry(Move.ABSORB,1),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,7),
                        new MoveLearnSetEntry(Move.HEAL_PULSE,12),
                        new MoveLearnSetEntry(Move.MAGICAL_LEAF,16),
                        new MoveLearnSetEntry(Move.BATON_PASS,20),
                        new MoveLearnSetEntry(Move.LEECH_SEED,25),
                        new MoveLearnSetEntry(Move.DETECT,29),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,33),
                        new MoveLearnSetEntry(Move.SLEEP_POWDER,37),
                        new MoveLearnSetEntry(Move.FUTURE_SIGHT,41),
                        new MoveLearnSetEntry(Move.AROMATHERAPY,46),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,52)             ),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_TROPICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Avocadoze");

    }


}
