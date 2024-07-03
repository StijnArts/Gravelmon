package drai.dev.gravelmon.pokemon.orbis;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Weyabitt extends drai.dev.gravelmon.pokemon.Pokemon {
    public Weyabitt() {
        super("Weyabitt",
                Type.STEEL, Type.FIGHTING,
                new Stats(55,
                        80,
                        105,
                        15,
                        25,
                        15),
                List.of(Ability.HEAVY_METAL), Ability.HEAVY_METAL,
                4, 240,
                new Stats(0,0,1,0,0,0), 0,
                0.75,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("- Heavy SlamSTAB Steel 3 Rollout Rock 6 Focus Energy Normal 10 Endure Normal 13 Double Hit Normal 17 Seismic TossSTAB Fighting 20 Detect Fighting 25 ReversalSTAB Fighting 29 Iron Defense Steel 32 Hammer ArmSTAB Fighting 35 Iron HeadSTAB Steel 39 Body PressSTAB Fighting 42 Body Slam Normal 44 Close CombatSTAB Fighting 52 Gyro BallSTAB Steel 55 Belly Drum Normal 60 Meteor MashSTAB Steel"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,3),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,6),
                        new MoveLearnSetEntry(Move.ENDURE,10),
                        new MoveLearnSetEntry(Move.DOUBLE_HIT,13),
                        new MoveLearnSetEntry(Move.SEISMIC_TOSS,17),
                        new MoveLearnSetEntry(Move.DETECT,20),
                        new MoveLearnSetEntry(Move.REVERSAL,25),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,29),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,32),
                        new MoveLearnSetEntry(Move.IRON_HEAD,35),
                        new MoveLearnSetEntry(Move.BODY_PRESS,39),
                        new MoveLearnSetEntry(Move.BODY_SLAM,42),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,44),
                        new MoveLearnSetEntry(Move.GYRO_BALL,52),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,55),
                        new MoveLearnSetEntry(Move.METEOR_MASH,60)                        ),
                List.of(Label.ORBIS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Weyabitt");

    }


}
