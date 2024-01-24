package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Tadit extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tadit() {
        super("Tadit",
                Type.WATER,Type.NORMAL,
                new Stats(40,
                        45,
                        40,
                        45,
                        40,
                        70),
                List.of(Ability.SWIFT_SWIM), Ability.SWIFT_SWIM,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("Tadit may overpopulate during summer. Whenever that happens, they may get stuck in shallow pools of water, struggling for room among other Tadits. Only its parent, Ribhit, can save its young by carrying them on its back to bigger pools of water."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.TACKLE,8),
                        new MoveLearnSetEntry(Move.TAIL_WHIP,13),
                        new MoveLearnSetEntry(Move.BUBBLE,19),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,23),
                        new MoveLearnSetEntry(Move.AQUA_RING,30),
                        new MoveLearnSetEntry(Move.AQUA_JET,34),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,40)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tadit");

    }


}
