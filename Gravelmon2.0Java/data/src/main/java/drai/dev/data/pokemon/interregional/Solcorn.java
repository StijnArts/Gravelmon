package drai.dev.data.pokemon.interregional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Solcorn extends drai.dev.data.pokemon.Pokemon {
    public Solcorn() {
        super("Solcorn",
                Type.NORMAL,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 165,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("Ferrutail", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"17")))),
                List.of(      new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.HELPING_HAND,5),
                        new MoveLearnSetEntry(Move.DOUBLE_SLAP,10),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,13),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,15),
                        new MoveLearnSetEntry(Move.SWIFT,18),
                        new MoveLearnSetEntry(Move.ROUND,20),
                        new MoveLearnSetEntry(Move.TAIL_SLAP,25),
                        new MoveLearnSetEntry(Move.DETECT,27),
                        new MoveLearnSetEntry(Move.WAKEUP_SLAP,30),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,33),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,37),
                        new MoveLearnSetEntry(Move.IRON_TAIL,41),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,45)                   ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(6)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .setAntiBiomes(Biome.IS_JUNGLE, Biome.IS_TAIGA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Solcorn");

    }


}
