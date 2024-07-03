package drai.dev.gravelmon.pokemon.orohnhavai;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Ribivine extends drai.dev.gravelmon.pokemon.Pokemon {
    public Ribivine() {
        super("Ribivine",
                Type.GRASS,
                new Stats(63,
                        76,
                        50,
                        54,
                        62,
                        94),
                List.of(Ability.CHLOROPHYLL,Ability.LEAF_GUARD,Ability.PICKUP), Ability.PICKUP,
                11, 165,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("It extends the vines on its arms to swing from place to place. It has managed to use its vines to attack its foes."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.VINE_WHIP,1),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,5),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,9),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.FEINT,15),
                        new MoveLearnSetEntry(Move.BOUNCE,20),
                        new MoveLearnSetEntry(Move.BULLET_SEED,24),
                        new MoveLearnSetEntry(Move.ACROBATICS,29),
                        new MoveLearnSetEntry(Move.EXTREME_SPEED,32),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,35),
                        new MoveLearnSetEntry(Move.VINESWING,40),
                        new MoveLearnSetEntry(Move.POWER_WHIP,45),
                        new MoveLearnSetEntry(Move.AGILITY,50),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm")                        ),
                List.of(Label.OROHNHAVAI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 25, 43, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ribivine");

    }


}
