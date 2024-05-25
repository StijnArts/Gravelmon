package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import java.util.*;

public class Sosqwatch extends Pokemon {
    public Sosqwatch() {
        super("Sosqwatch",
                Type.ICE, Type.FIRE,
                new Stats(72, 74, 72, 93, 66, 118),
                List.of(Ability.SLUSH_RUSH), Ability.SLUSH_RUSH,
                20, 2250,
                new Stats(0,0,0,0,0,2), 45,
                0.5,
                168, ExperienceGroup.MEDIUM_SLOW,
                70,
                32, List.of(EggGroup.HUMAN_LIKE, EggGroup.FIELD),
                List.of("It wanders around on snowy mountains with its own original style. It assists whoever's been stranded by avalanches and keeps them warm."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ICE_SHARD,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.ICY_WIND,5),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,10),
                        new MoveLearnSetEntry(Move.SWAGGER,16),
                        new MoveLearnSetEntry(Move.AVALANCHE,20),
                        new MoveLearnSetEntry(Move.HAIL,25),
                        new MoveLearnSetEntry(Move.SLACK_OFF,30),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,35),
                        new MoveLearnSetEntry(Move.ACROBATICS,40),
                        new MoveLearnSetEntry(Move.SURF,45),
                        new MoveLearnSetEntry(Move.BLIZZARD,50),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,55),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,"egg"),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,"egg"),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,"egg"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"egg"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.FLASH,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 24, 56, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE, "night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
