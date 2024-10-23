package drai.dev.data.pokemon.korza;


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
import drai.dev.data.pokemon.crozoic.*;
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Taidoko extends drai.dev.data.pokemon.Pokemon {
    public Taidoko() {
        super("Taidoko",
                Type.FIGHTING,Type.NORMAL,
                new Stats(112,
                        95,
                        100,
                        80,
                        65,
                        70),
                List.of(Ability.MAGIC_BOUNCE), Ability.FINALE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                235, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Renowned for their tempo and drumming ability. Taidoko use special sticks to hit their now hardened belly, creating louder and deeper beats than before."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.POUND,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ARM_THRUST,6),
                        new MoveLearnSetEntry(Move.FEINT,11),
                        new MoveLearnSetEntry(Move.LUCKY_CHANT,15),
                        new MoveLearnSetEntry(Move.ROLLING_KICK,21),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,26),
                        new MoveLearnSetEntry(Move.ACUPRESSURE,30),
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,35),
                        new MoveLearnSetEntry(Move.BODY_SLAM,40),
                        new MoveLearnSetEntry(Move.BELLY_DRUM,44),
                        new MoveLearnSetEntry(Move.DETECT,49),
                        new MoveLearnSetEntry(Move.SUPERPOWER,53),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,58),
                        new MoveLearnSetEntry(Move.COUNTER,62),
                        new MoveLearnSetEntry(Move.SLACK_OFF,66)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Taidoko");

    }


}
