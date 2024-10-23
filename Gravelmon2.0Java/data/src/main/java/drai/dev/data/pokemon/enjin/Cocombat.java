package drai.dev.data.pokemon.enjin;


import drai.dev.data.pokemon.amavi.*;
import drai.dev.data.pokemon.dhiome.*;
import drai.dev.data.pokemon.mushi.*;
import drai.dev.data.pokemon.theos.*;
import drai.dev.data.pokemon.kuria.*;
import drai.dev.data.pokemon.ottora.*;
import drai.dev.data.pokemon.mastenia.*;
import drai.dev.data.pokemon.mongratis.*;
import drai.dev.data.pokemon.ultraspace.*;
import drai.dev.data.pokemon.urzavos.*;
import drai.dev.data.pokemon.terranov.*;
import drai.dev.data.pokemon.enjin.*;
import drai.dev.data.pokemon.mystis.*;
import drai.dev.data.pokemon.pastelisland.*;
import drai.dev.data.pokemon.neonintendo.*;
import drai.dev.data.pokemon.tokas.*;
import drai.dev.data.pokemon.panjaea.*;
import drai.dev.data.pokemon.cyare.*;
import drai.dev.data.pokemon.olysos.*;
import drai.dev.data.pokemon.nodorro.*;
import drai.dev.data.pokemon.orbis.*;
import drai.dev.data.pokemon.avalos.*;
import drai.dev.data.pokemon.ruskow.*;
import drai.dev.data.pokemon.otopo.*;
import drai.dev.data.pokemon.goetia.*;
import drai.dev.data.pokemon.ionos.*;
import drai.dev.data.pokemon.lagoone.*;
import drai.dev.data.pokemon.atlas.*;
import drai.dev.data.pokemon.avoris.*;
import drai.dev.data.pokemon.enriko.*;
import drai.dev.data.pokemon.ferroa.*;
import drai.dev.data.pokemon.hiza.*;
import drai.dev.data.pokemon.hub.*;
import drai.dev.data.pokemon.interregional.*;
import drai.dev.data.pokemon.isiah.*;
import drai.dev.data.pokemon.junnin.*;
import drai.dev.data.pokemon.lonava.*;
import drai.dev.data.pokemon.mythire.*;
import drai.dev.data.pokemon.nosto.*;
import drai.dev.data.pokemon.novrai.*;
import drai.dev.data.pokemon.oceane.*;
import drai.dev.data.pokemon.okeno.*;
import drai.dev.data.pokemon.orohnhavai.*;
import drai.dev.data.pokemon.qamor.*;
import drai.dev.data.pokemon.rica.*;
import drai.dev.data.pokemon.varitas.*;
import drai.dev.data.pokemon.aristos.*;
import drai.dev.data.pokemon.midamis.*;
import drai.dev.data.pokemon.norheim.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Cocombat extends drai.dev.data.pokemon.Pokemon {
    public Cocombat() {
        super("Cocombat",
                Type.GRASS, Type.FIGHTING,
                new Stats(90,
                        120,
                        80,
                        30,
                        80,
                        115),
                List.of(Ability.IRON_FIST), Ability.CHLOROPHYLL,
                15, 644,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                180, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.HUMAN_LIKE),
                List.of("Having evolved, Cocombat are much less cowardly than their unevolved forms. They are masterful fighters, agile and powerful."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.SEEDSHOT,3),
                        new MoveLearnSetEntry(Move.GROWTH,6),
                        new MoveLearnSetEntry(Move.LOW_KICK,8),
                        new MoveLearnSetEntry(Move.KNOCKBACK,11),
                        new MoveLearnSetEntry(Move.DETECT,12),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,13),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,15),
                        new MoveLearnSetEntry(Move.BULLET_SEED,17),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,19),
                        new MoveLearnSetEntry(Move.LOW_SWEEP,20),
                        new MoveLearnSetEntry(Move.FACEPLANT,21),
                        new MoveLearnSetEntry(Move.POWERUP_PUNCH,22),
                        new MoveLearnSetEntry(Move.SEED_BOMB,25),
                        new MoveLearnSetEntry(Move.BODY_SLAM,27),
                        new MoveLearnSetEntry(Move.SYNTHESIS,28),
                        new MoveLearnSetEntry(Move.BULK_UP,29),
                        new MoveLearnSetEntry(Move.KNOCK_OFF,30),
                        new MoveLearnSetEntry(Move.TROP_KICK,31),
                        new MoveLearnSetEntry(Move.SOLIDKICK,32),
                        new MoveLearnSetEntry(Move.TRIPLE_KICK,33),
                        new MoveLearnSetEntry(Move.SUBMISSION,36),
                        new MoveLearnSetEntry(Move.JUMP_KICK,37),
                        new MoveLearnSetEntry(Move.LEAF_BLADE,40),
                        new MoveLearnSetEntry(Move.REVERSAL,42),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,43),
                        new MoveLearnSetEntry(Move.COUNTER,44),
                        new MoveLearnSetEntry(Move.WARDANCE,46),
                        new MoveLearnSetEntry(Move.SUCKER_PUNCH,48),
                        new MoveLearnSetEntry(Move.SUPERPOWER,51),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,52),
                        new MoveLearnSetEntry(Move.DYNAMICPUNCH,54),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,56),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,60),
                        new MoveLearnSetEntry(Move.SOLAR_BLADE,63),
                        new MoveLearnSetEntry(Move.HIGH_JUMP_KICK,66),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.COACHING,"tm"),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.BOUNCE,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_GLIDE,"tm"),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.SNORE,"tm"),
                        new MoveLearnSetEntry(Move.UTURN,"tm"),
                        new MoveLearnSetEntry(Move.BRUTAL_SWING,"tm"),
                        new MoveLearnSetEntry(Move.BRICK_BREAK,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.SAND_ATTACK,"tm"),
                        new MoveLearnSetEntry(Move.SANDSHOT,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.HEARTFELTPULSE,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.WORK_UP,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,"tm"),
                        new MoveLearnSetEntry(Move.STONE_EDGE,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"tm"),
                        new MoveLearnSetEntry(Move.FIRST_IMPRESSION,"tm")                        ),
                List.of(Label.ENJIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 31, 53, .3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_TROPICAL_ISLAND)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cocombat");

    }


}
