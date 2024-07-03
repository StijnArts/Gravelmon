package drai.dev.gravelmon.pokemon.midamis;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Gurangle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gurangle() {
        super("Gurangle",
                Type.ELECTRIC, Type.PSYCHIC,
                new Stats(100,
                        80,
                        95,
                        105,
                        90,
                        105),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                11, 165,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of( new MoveLearnSetEntry(Move.HIDDEN_POWER,1),
                        new MoveLearnSetEntry(Move.SPARK,12),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,14),
                        new MoveLearnSetEntry(Move.CHARGE_BEAM,16),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,20),
                        new MoveLearnSetEntry(Move.RISING_VOLTAGE,24),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,27),
                        new MoveLearnSetEntry(Move.LUSTER_PURGE,31),
                        new MoveLearnSetEntry(Move.DISCHARGE,37),
                        new MoveLearnSetEntry(Move.SPOTLIGHT,40),
                        new MoveLearnSetEntry(Move.PSYSHOCK,44),
                        new MoveLearnSetEntry(Move.THUNDERBOLT,49)                       ),
                List.of(Label.MIDAMIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 41, 56, .4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gurangle");

    }


}
