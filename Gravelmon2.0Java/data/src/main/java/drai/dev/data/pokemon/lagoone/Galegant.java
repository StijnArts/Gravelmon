package drai.dev.data.pokemon.lagoone;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Galegant extends drai.dev.data.pokemon.Pokemon {
    public Galegant() {
        super("Galegant",
                Type.FLYING, Type.DRAGON,
                new Stats(60,
                        70,
                        60,
                        112,
                        111,
                        102),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                11, 170,
                new Stats(0,0,0,2,0,0), 45,
                0.5,
                180, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
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
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,65)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 32, 47, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_FLORAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Galegant");

    }


}
