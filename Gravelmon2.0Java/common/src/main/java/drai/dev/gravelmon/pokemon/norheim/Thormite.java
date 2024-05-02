package drai.dev.gravelmon.pokemon.norheim;


import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Thormite extends drai.dev.gravelmon.pokemon.Pokemon {
    public Thormite() {
        super("Thormite",
                Type.BUG, Type.DRAGON,
                new Stats(65,
                        85,
                        75,
                        23,
                        33,
                        45),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                12, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,1),
                        new MoveLearnSetEntry(Move.RAGE,1),
                        new MoveLearnSetEntry(Move.BIDE,15),
                        new MoveLearnSetEntry(Move.STRUGGLE_BUG,20),
                        new MoveLearnSetEntry(Move.ME_FIRST,25),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,30)   ,
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,35),
                        new MoveLearnSetEntry(Move.XSCISSOR,40),
                        new MoveLearnSetEntry(Move.BRACE,45)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 26, 39, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TAIGA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Thormite");

    }


}
