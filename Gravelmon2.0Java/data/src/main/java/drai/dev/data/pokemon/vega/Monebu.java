package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Monebu extends Pokemon {
    public Monebu() {
        super( "Monebu",
                Type.BUG, Type.POISON,
                new Stats(68	,69	,67	,30	,41	,58),
                List.of(Ability.POISON_POINT), Ability.RUN_AWAY,
                8, 276,
                new Stats(0,2,0,0,0,0), 190,
                0.5,
                98, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("benoreto", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(
                        new MoveLearnSetEntry(Move.BUG_GNAW,1),
                        new MoveLearnSetEntry(Move.SIGNAL,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,6),
                        new MoveLearnSetEntry(Move.SCREECH,10),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,13),
                        new MoveLearnSetEntry(Move.POISON_TAIL,17),
                        new MoveLearnSetEntry(Move.NEUROTOXIN,24),
                        new MoveLearnSetEntry(Move.SLUDGE,31)
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DECIDUOUS_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
