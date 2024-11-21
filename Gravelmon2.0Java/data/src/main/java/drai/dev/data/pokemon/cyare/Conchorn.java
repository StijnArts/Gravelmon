package drai.dev.data.pokemon.cyare;


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
import drai.dev.data.pokemon.fliga.*;
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
public class Conchorn extends drai.dev.data.pokemon.Pokemon {
    public Conchorn() {
        super("Conchorn",
                Type.POISON, Type.STEEL,
                new Stats(75,
                        70,
                        150,
                        55,
                        105,
                        45),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                20, 2812,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                170, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("- Poison StingSTAB Poison - Bide Normal - Razor Shell Water 6 Withdraw Water 12 Spike Cannon Normal 17 SludgeSTAB Poison 22 Toxic Spikes Poison 27 Iron Defense Steel 32 Gyro BallSTAB Steel 36 Poison JabSTAB Poison 40 Spikes Ground 47 Toxic Poison 52 Iron HeadSTAB Steel 57 Sludge WaveSTAB Poison 63 Megahorn Bug 70 Shell Smash Normal"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,1),
                        new MoveLearnSetEntry(Move.POISON_STING,1),
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.WITHDRAW,6),
                        new MoveLearnSetEntry(Move.SPIKE_CANNON,12),
                        new MoveLearnSetEntry(Move.SLUDGE,17),
                        new MoveLearnSetEntry(Move.TOXIC_SPIKES,22),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,27),
                        new MoveLearnSetEntry(Move.GYRO_BALL,32),
                        new MoveLearnSetEntry(Move.POISON_JAB,36),
                        new MoveLearnSetEntry(Move.SPIKES,40),
                        new MoveLearnSetEntry(Move.TOXIC,47),
                        new MoveLearnSetEntry(Move.IRON_HEAD,52),
                        new MoveLearnSetEntry(Move.SLUDGE_WAVE,57),
                        new MoveLearnSetEntry(Move.MEGAHORN,63),
                        new MoveLearnSetEntry(Move.SHELL_SMASH,70)                        ),
                List.of(Label.CYARE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Conchorn");

    }


}
