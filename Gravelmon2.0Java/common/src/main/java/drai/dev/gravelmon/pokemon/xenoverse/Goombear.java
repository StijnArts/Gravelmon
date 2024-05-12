package drai.dev.gravelmon.pokemon.xenoverse;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Goombear extends Pokemon {
    public Goombear() {
        super("Goombear",
                Type.FIRE, Type.FAIRY,
                new Stats(108, 116, 92, 62, 86, 55),
                List.of(Ability.THICK_FAT), Ability.GLUTTONY,
                22, 3600,
                new Stats(2,0,0,0,0,0), 60,
                0.5,
                173, ExperienceGroup.MEDIUM_FAST,
                70,
                32, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("It can freely stretch its limbs by burning off everything it has eaten. Before hibernation or when it has no food, it will even burn its own stilts."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.LICK,1),
                        new MoveLearnSetEntry(Move.EMBER,5),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,9),
                        new MoveLearnSetEntry(Move.FLAIL,13),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,16),
                        new MoveLearnSetEntry(Move.STOCKPILE,21),
                        new MoveLearnSetEntry(Move.SWALLOW,21),
                        new MoveLearnSetEntry(Move.SPIT_UP,21),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,28),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,34),
                        new MoveLearnSetEntry(Move.YAWN,40),
                        new MoveLearnSetEntry(Move.RECYCLE,45),
                        new MoveLearnSetEntry(Move.SUGAR_RUSH,50),
                        new MoveLearnSetEntry(Move.BELCH,55),
                        new MoveLearnSetEntry(Move.HEAT_CRASH,60),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.BULK_UP,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,"tm"),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.OVERHEAT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.WILLOWISP,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.BULLDOZE,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"egg"),
                        new MoveLearnSetEntry(Move.INFERNO,"egg"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"egg"),
                        new MoveLearnSetEntry(Move.CURSE,"egg"),
                        new MoveLearnSetEntry(Move.SLACK_OFF,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"egg"),
                        new MoveLearnSetEntry(Move.BIND,"tutor"),
                        new MoveLearnSetEntry(Move.BLOCK,"tutor"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tutor"),
                        new MoveLearnSetEntry(Move.HEAT_WAVE,"tutor"),
                        new MoveLearnSetEntry(Move.MAGIC_WALL,"tutor"),
                        new MoveLearnSetEntry(Move.RECYCLE,"tutor"),
                        new MoveLearnSetEntry(Move.SCORCHED_ASHES,"tutor"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tutor"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor")
                        ),
                List.of(Label.XENOVERSE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 56, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FOREST))
                ), List.of(),
                List.of(SpawnPreset.NEAR_CAMPFIRE),
                0.3, 0.3,
                List.of());
        this.setPortraitXYZ(0.1,2.0,0.0);
    }
}
