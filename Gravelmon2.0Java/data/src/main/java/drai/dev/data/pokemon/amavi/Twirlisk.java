package drai.dev.data.pokemon.amavi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Twirlisk extends drai.dev.data.pokemon.Pokemon {
    public Twirlisk() {
        super("Twirlisk",
                Type.DRAGON, Type.FLYING,
                new Stats(60,
                        60,
                        60,
                        60,
                        60,
                        60),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                6, 0,
                new Stats(0,0,0,0,0,0), 190,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("rapunzilla", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=female"))),
                        new EvolutionEntry("valordian", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"27"),
                                        new EvolutionRequirementEntry(EvolutionRequirementCondition.PROPERTY,"gender=male")))),
                List.of(       new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.POISON_STING,5),
                        new MoveLearnSetEntry(Move.FLURRYPECK,9),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,14),
                        new MoveLearnSetEntry(Move.PLUCK,19),
                        new MoveLearnSetEntry(Move.SNATCH,22),
                        new MoveLearnSetEntry(Move.DRAGONFANG,26),
                        new MoveLearnSetEntry(Move.SCREECH,29),
                        new MoveLearnSetEntry(Move.DRILL_PECK,33),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,37),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,41),
                        new MoveLearnSetEntry(Move.LUNGE,43),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,47),
                        new MoveLearnSetEntry(Move.HURRICANE,51),
                        new MoveLearnSetEntry(Move.OUTRAGE,55)                 ),
                List.of(Label.AMAVI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_PLAINS)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Twirlisk");
        setHasGenderDifferences(true);
    }


}
