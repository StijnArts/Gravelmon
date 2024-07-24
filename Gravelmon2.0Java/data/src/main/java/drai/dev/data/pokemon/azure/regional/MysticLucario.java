package drai.dev.data.pokemon.azure.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.data.pokemon.*;

import java.util.*;

public class MysticLucario extends Pokemon {
    public MysticLucario(String name, Aspect aspect) {
        super(name, aspect,"MysticLucario",
                Type.FAIRY, Type.GROUND,
                new Stats(115, 90, 70, 110, 70, 70),
                List.of(Ability.OBLIVIOUS), Ability.STEELWORKER,
                12, 540,
                new Stats(1,0,0,1,0,0), 45,
                0.875,
                184, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD, EggGroup.HUMAN_LIKE),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CHARM,1),
                        new MoveLearnSetEntry(Move.COPYCAT,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SING,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.SWEET_KISS,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,4),
                        new MoveLearnSetEntry(Move.ENCORE,8),
                        new MoveLearnSetEntry(Move.AFTER_YOU,12),
                        new MoveLearnSetEntry(Move.BULLDOZE,16),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,20),
                        new MoveLearnSetEntry(Move.MOONLIGHT,24),
                        new MoveLearnSetEntry(Move.GRAVITY,28),
                        new MoveLearnSetEntry(Move.METEOR_MASH,32),
                        new MoveLearnSetEntry(Move.EARTH_POWER,36),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,40),
                        new MoveLearnSetEntry(Move.MOONBLAST,44),
                        new MoveLearnSetEntry(Move.CALM_MIND,48)
                ),
                List.of(Label.GEN4,Label.AZURE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 29, 52, 1.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_MAGICAL)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.22, 0.3,
                List.of());
        this.setLangFileName("Lucario");
    }
}
