package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tadapt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tadapt() {
        super("Tadapt",
                Type.NORMAL,
                new Stats(40,
                        60,
                        40,
                        60,
                        40,
                        80),
                List.of(Ability.ADAPTABILITY), Ability.OVERCOAT,
                8, 165,
                new Stats(1,0,0,0,0,0), 45,
                0.5,
                60, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Tadapt's cell structure quickly configures itself to easily adapt to its surroundings. This allows it so they can withstand any harsh climate effects."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,5),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,9),
                        new MoveLearnSetEntry(Move.ROUND,13),
                        new MoveLearnSetEntry(Move.PROTECT,17),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,21),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,25),
                        new MoveLearnSetEntry(Move.YAWN,29),
                        new MoveLearnSetEntry(Move.SLAM,33),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,41),
                        new MoveLearnSetEntry(Move.BODY_SLAM,"tm"),
                        new MoveLearnSetEntry(Move.SING,"tm"),
                        new MoveLearnSetEntry(Move.PSYBEAM,"tm"),
                        new MoveLearnSetEntry(Move.RECOVER,"tm"),
                        new MoveLearnSetEntry(Move.DARK_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.MUD_BOMB,"tm")                        ),
                List.of(Label.OROHNHAVAI
),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tadapt");

    }


}
