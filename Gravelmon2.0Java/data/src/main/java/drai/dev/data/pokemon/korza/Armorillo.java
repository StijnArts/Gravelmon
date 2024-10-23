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
public class Armorillo extends drai.dev.data.pokemon.Pokemon {
    public Armorillo() {
        super("Armorillo",
                Type.STEEL,Type.GROUND,
                new Stats(105,
                        85,
                        120,
                        60,
                        60,
                        65),
                List.of(Ability.BATTLE_ARMOR), Ability.WEAK_ARMOR,
                15, 876,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                173, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Roadent who find extra protection will evolve into this mon, their hide transforming into a strong metal coating. Armorillo have a large buildup of this coating on one arm, which they slash against boulders to sharpen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.MUDSLAP,5),
                        new MoveLearnSetEntry(Move.METAL_CLAW,9),
                        new MoveLearnSetEntry(Move.ROLLOUT,13),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,17),
                        new MoveLearnSetEntry(Move.BULLDOZE,22),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,27),
                        new MoveLearnSetEntry(Move.IRON_HEAD,33),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,38),
                        new MoveLearnSetEntry(Move.GYRO_BALL,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,47),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,54),
                        new MoveLearnSetEntry(Move.FISSURE,61)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Armorillo");

    }


}
