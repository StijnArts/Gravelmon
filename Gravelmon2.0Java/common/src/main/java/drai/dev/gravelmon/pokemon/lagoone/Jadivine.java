package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Jadivine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Jadivine() {
        super("Jadivine",
                Type.FLYING, Type.DRAGON,
                new Stats(30,
                        50,
                        40,
                        70,
                        65,
                        75),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 30,
                new Stats(0,0,0,1,0,0), 175,
                0.5,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("galegant", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(           new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.POISON_STING,5),
                        new MoveLearnSetEntry(Move.FLURRYPECK,9),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,14),
                        new MoveLearnSetEntry(Move.PLUCK,19),
                        new MoveLearnSetEntry(Move.SNATCH,22),
                        new MoveLearnSetEntry(Move.DRAGONFANG,26),
                        new MoveLearnSetEntry(Move.SCREECH,29),
                        new MoveLearnSetEntry(Move.DRILL_PECK,33),
                        new MoveLearnSetEntry(Move.DRAGON_CLAW,37),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,43),
                        new MoveLearnSetEntry(Move.LUNGE,45),
                        new MoveLearnSetEntry(Move.GASTRO_ACID,50),
                        new MoveLearnSetEntry(Move.HURRICANE,55),
                        new MoveLearnSetEntry(Move.OUTRAGE,60),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,65)             ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 3, 22, 2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Jadivine");

    }


}
