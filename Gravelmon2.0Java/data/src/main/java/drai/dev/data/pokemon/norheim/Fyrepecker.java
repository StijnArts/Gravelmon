package drai.dev.data.pokemon.norheim;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Fyrepecker extends drai.dev.data.pokemon.Pokemon {
    public Fyrepecker() {
        super("Fyrepecker",
                Type.FLYING, Type.FIRE,
                new Stats(65,
                        115,
                        65,
                        75,
                        65,
                        80),
                List.of(Ability.BIG_PECKS,Ability.SKILL_LINK,Ability.STEELWORKER), Ability.STEELWORKER,
                16, 165,
                new Stats(0,2,0,0,0,0), 70,
                0.5,
                163, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FURY_ATTACK,1),
                        new MoveLearnSetEntry(Move.FLURRYPECK,12),
                        new MoveLearnSetEntry(Move.FLAME_BURST,16),
                        new MoveLearnSetEntry(Move.SCREECH,20),
                        new MoveLearnSetEntry(Move.STEEL_WING,26),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,30),
                        new MoveLearnSetEntry(Move.BLAZEARROW,34),
                        new MoveLearnSetEntry(Move.ROOST,38),
                        new MoveLearnSetEntry(Move.DRILL_PECK,44),
                        new MoveLearnSetEntry(Move.SMART_STRIKE,48),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,54),
                        new MoveLearnSetEntry(Move.DRILL_RUN,58),
                        new MoveLearnSetEntry(Move.FLARE_BLITZ,64)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 45, .7, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanFly(true);

    }


}
