package drai.dev.data.pokemon.orbis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Caffiend extends drai.dev.data.pokemon.Pokemon {
    public Caffiend() {
        super("Caffiend",
                Type.DARK, Type.FAIRY,
                new Stats(40,
                        45,
                        54,
                        45,
                        45,
                        50),
                List.of(Ability.VITAL_SPIRIT), Ability.VITAL_SPIRIT,
                2, 3,
                new Stats(0,0,0,1,0,0), 120,
                0.5,
                62, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of("Caffiend are addicted to caffeine and will go to great expenses to get their hands on it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.WITHDRAW,1),
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.LEECH_SEED,3),
                        new MoveLearnSetEntry(Move.AROMATIC_MIST,6),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,10),
                        new MoveLearnSetEntry(Move.THIEF,14),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,24),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,28),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,30),
                        new MoveLearnSetEntry(Move.TEATIME,36),
                        new MoveLearnSetEntry(Move.NASTY_PLOT,42),
                        new MoveLearnSetEntry(Move.MEMENTO,54),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,60)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Caffiend");

    }


}
