package drai.dev.gravelmon.pokemon.isiah;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Calvakair extends drai.dev.gravelmon.pokemon.Pokemon {
    public Calvakair() {
        super("Calvakair",
                Type.STEEL, Type.FLYING,
                new Stats(95,
                        85,
                        122,
                        0,
                        103,
                        86),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                18, 165,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,8),
                        new MoveLearnSetEntry(Move.ROAR,13),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,17),
                        new MoveLearnSetEntry(Move.WATER_PULSE,21),
                        new MoveLearnSetEntry(Move.STEEL_WING,25),
                        new MoveLearnSetEntry(Move.FLY,29),
                        new MoveLearnSetEntry(Move.AGILITY,33),
                        new MoveLearnSetEntry(Move.AIR_SLASH,38),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,42),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,46),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,50),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,57),
                        new MoveLearnSetEntry(Move.WINDBLAST,62)
                ),
                List.of(Label.ISIAH),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 53, 65, .14, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);
           setLangFileName("Calvakair");

    }


}
