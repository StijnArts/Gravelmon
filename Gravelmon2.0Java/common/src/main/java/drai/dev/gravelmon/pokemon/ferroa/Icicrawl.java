package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Icicrawl extends drai.dev.gravelmon.pokemon.Pokemon {
    public Icicrawl() {
        super("Icicrawl",
                Type.ICE,Type.DRAGON,
                new Stats(55,
                        45,
                        45,
                        55,
                        50,
                        50),
                List.of(Ability.SNIPER,Ability.OVERCOAT,Ability.REFRIGERATE), Ability.REFRIGERATE,
                8, 165,
                new Stats(0,0,0,1,0,0), 75,
                0.5,
                60, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.BUG),
                List.of("A film of ice-cold slime coats its body. By spitting this slime from its mouth, it aids humans in factories to keep machinery from overheating."),
                List.of(new EvolutionEntry("glacicrawl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"39")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.ICE_SHARD,7),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,12),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,16),
                        new MoveLearnSetEntry(Move.MIST,19),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,22),
                        new MoveLearnSetEntry(Move.DRAGON_BREATH,25),
                        new MoveLearnSetEntry(Move.RECYCLE,29),
                        new MoveLearnSetEntry(Move.FREEZEDRY,33),
                        new MoveLearnSetEntry(Move.DEFOG,35),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,38),
                        new MoveLearnSetEntry(Move.WRING_OUT,42),
                        new MoveLearnSetEntry(Move.GUARD_SPLIT,45),
                        new MoveLearnSetEntry(Move.DRACO_METEOR,"tm"),
                        new MoveLearnSetEntry(Move.BIND,"tm"),
                        new MoveLearnSetEntry(Move.BUG_BITE,"tm"),
                        new MoveLearnSetEntry(Move.ELECTROWEB,"tm"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tm"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,"tm"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tm"),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,"tm"),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tm"),
                        new MoveLearnSetEntry(Move.STOMPING_TANTRUM,"tm"),
                        new MoveLearnSetEntry(Move.TERRAIN_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm"),
                        new MoveLearnSetEntry(Move.HAZE,"tm"),
                        new MoveLearnSetEntry(Move.AMNESIA,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC_THREAD,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.WEBSLAM,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 7, 34, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Icicrawl");

    }


}
