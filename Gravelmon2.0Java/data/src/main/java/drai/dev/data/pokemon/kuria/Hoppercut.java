package drai.dev.data.pokemon.kuria;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Hoppercut extends drai.dev.data.pokemon.Pokemon {
    public Hoppercut() {
        super("Hoppercut",
                Type.BUG, Type.FIGHTING,
                new Stats(70,
                        120,
                        65,
                        50,
                        64,
                        117),
                List.of(Ability.JUSTIFIED,Ability.QUICK_FEET), Ability.VITAL_SPIRIT,
                14, 375,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                173, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Hoppercut never sleep and are always on the lookout for foes that they can challenge. Quite often, these targets end up being evil, making many consider it a hero."),
                List.of(),
                List.of(            new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.LEER,5),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,11),
                        new MoveLearnSetEntry(Move.PESTER,14),
                        new MoveLearnSetEntry(Move.COUNTER,18),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,21),
                        new MoveLearnSetEntry(Move.STEAMROLLER,24),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,29),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,37),
                        new MoveLearnSetEntry(Move.GYRO_BALL,44),
                        new MoveLearnSetEntry(Move.DETECT,53),
                        new MoveLearnSetEntry(Move.SUPERPOWER,57)            ),
                List.of(Label.KURIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 30, 47, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Hoppercut");

    }


}
