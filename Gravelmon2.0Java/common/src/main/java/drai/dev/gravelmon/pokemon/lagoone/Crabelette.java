package drai.dev.gravelmon.pokemon.lagoone;



import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Crabelette extends drai.dev.gravelmon.pokemon.Pokemon {
    public Crabelette() {
        super("Crabelette",
                Type.NORMAL,
                new Stats(85,
                        115,
                        85,
                        40,
                        85,
                        90),
                List.of(Ability.PICKPOCKET), Ability.WEAK_ARMOR,
                14, 930,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                175, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("They fight eachother over territory. If its outer shell were to break, its inner shell is incredibly light, allowing an almost guaranteed escape from the fight."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.POWER_TRIP,4),
                        new MoveLearnSetEntry(Move.TAR_SHOT,8),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,11),
                        new MoveLearnSetEntry(Move.SOFTBOILED,14),
                        new MoveLearnSetEntry(Move.ENDURE,17),
                        new MoveLearnSetEntry(Move.FLAIL,21),
                        new MoveLearnSetEntry(Move.GYRO_BALL,24),
                        new MoveLearnSetEntry(Move.BODY_PRESS,27),
                        new MoveLearnSetEntry(Move.STEAMROLLER,30),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,34),
                        new MoveLearnSetEntry(Move.ENDEAVOR,37),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,40),
                        new MoveLearnSetEntry(Move.STEEL_ROLLER,43),
                        new MoveLearnSetEntry(Move.SKULL_BASH,47)                ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 31, 48, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BEACH)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Crabelette");

    }


}
