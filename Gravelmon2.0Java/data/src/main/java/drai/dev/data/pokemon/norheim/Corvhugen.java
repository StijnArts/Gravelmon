package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Corvhugen extends drai.dev.data.pokemon.Pokemon {
    public Corvhugen() {
        super("Corvhugen",
                Type.FLYING, Type.FIGHTING,
                new Stats(74,
                        115,
                        81,
                        74,
                        61,
                        90),
                List.of(Ability.TOUGH_CLAWS,Ability.STEADFAST), Ability.SCRAPPY,
                21, 165,
                new Stats(0,2,0,0,0,1), 45,
                0.5,
                216, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("Unlike Corviknight, Corvhugen has a padded knight's armor covering most of its body. This offers it more speed for agile combat; battles that don't last very long."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,1),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,1),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,8),
                        new MoveLearnSetEntry(Move.WORK_UP,12),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,15),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,17),
                        new MoveLearnSetEntry(Move.FINAL_GAMBIT,20),
                        new MoveLearnSetEntry(Move.ROOST,24),
                        new MoveLearnSetEntry(Move.PLUCK,27),
                        new MoveLearnSetEntry(Move.SOLIDKICK,31),
                        new MoveLearnSetEntry(Move.DUAL_WINGBEAT,37),
                        new MoveLearnSetEntry(Move.DETECT,41),
                        new MoveLearnSetEntry(Move.ENDEAVOR,45),
                        new MoveLearnSetEntry(Move.BULK_UP,51),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,58),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,62)
                ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 38, 50, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TUNDRA, Biome.IS_SNOWY_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
