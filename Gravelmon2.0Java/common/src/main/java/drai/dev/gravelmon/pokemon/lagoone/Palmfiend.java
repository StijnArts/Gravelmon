package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Palmfiend extends drai.dev.gravelmon.pokemon.Pokemon {
    public Palmfiend() {
        super("Palmfiend",
                Type.GRASS, Type.FLYING,
                new Stats(69,
                        71,
                        90,
                        90,
                        71,
                        94),
                List.of(Ability.NATURAL_CURE), Ability.SOLAR_POWER,
                13, 366,
                new Stats(0,0,0,1,0,1), 45,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Would it lose one of its tail feathers, it loses all its flying capabilities, making it very agitated and dangerous to approach."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.PECK,3),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,6),
                        new MoveLearnSetEntry(Move.VINE_WHIP,9),
                        new MoveLearnSetEntry(Move.GUST,12),
                        new MoveLearnSetEntry(Move.GROWTH,16),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,22),
                        new MoveLearnSetEntry(Move.ACROBATICS,26),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,30),
                        new MoveLearnSetEntry(Move.WING_ATTACK,34),
                        new MoveLearnSetEntry(Move.PETAL_DANCE,38),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,44),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,48)
                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 23, 45, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Palmfiend");

    }


}
