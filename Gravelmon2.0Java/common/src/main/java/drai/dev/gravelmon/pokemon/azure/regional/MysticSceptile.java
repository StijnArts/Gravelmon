package drai.dev.gravelmon.pokemon.azure.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class MysticSceptile extends Pokemon {
    public MysticSceptile(int dexNo) {
        super(dexNo,"MysticSceptile",
                Type.FLYING, Type.FAIRY,
                new Stats(70, 65, 85, 85, 105, 120),
                List.of(Ability.INNER_FOCUS), Ability.REGENERATOR,
                17, 522,
                new Stats(0,0,0,0,3,0), 45,
                0.875,
                239, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DRAGON, EggGroup.MONSTER),
                List.of("After becoming a master of its dojo, it begins to regain its primal instincts. Its draconic traits cause it to have no equal within the karate world."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.FAIRY_WIND,5),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.LIFE_DEW,2),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.GUST,8),
                        new MoveLearnSetEntry(Move.CHARM,12),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,16),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,20),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,24),
                        new MoveLearnSetEntry(Move.HURRICANE,28),
                        new MoveLearnSetEntry(Move.DOUBLE_EDGE,32),
                        new MoveLearnSetEntry(Move.SAFEGUARD,36),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,40),
                        new MoveLearnSetEntry(Move.BATON_PASS,44),
                        new MoveLearnSetEntry(Move.LAST_RESORT,48),
                        new MoveLearnSetEntry(Move.WISH,52)
                ),
                List.of(Label.GEN3,Label.AZURE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 36, 58, 0.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_ARID))),
                List.of(SpawnPreset.NATURAL),
                0.36, 0.3,
                List.of());
        this.setLangFileName("Sceptile");
        setCanFly(true);
    }
}
