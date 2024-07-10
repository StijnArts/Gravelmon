package drai.dev.gravelmon.pokemon.chaosinvestia;


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
import drai.dev.data.pokemon.crozoic.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;
public class Nockchan extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nockchan() {
        super("Nockchan",
                Type.FIGHTING,
                new Stats(50,
                        105,
                        79,
                        76,
                        35,
                        110),
                List.of(Ability.KEEN_EYE,Ability.IRON_FIST), null,
                14, 502,
                new Stats(0,0,0,0,0,2), 45,
                1.0,
                0, ExperienceGroup.MEDIUM,
                70,
                50, List.of(),
                List.of("Die Schläge, die es austeilt, können Beton pulverisieren. Es muss sich im Kampf alle 3 Minuten ausruhen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AGILITY,6),
                        new MoveLearnSetEntry(Move.QUICK_GUARD,31),
                        new MoveLearnSetEntry(Move.FIRE_PUNCH,36),
                        new MoveLearnSetEntry(Move.SKY_UPPERCUT,41),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,66),
                        new MoveLearnSetEntry(Move.ICE_PUNCH,36),
                        new MoveLearnSetEntry(Move.MEGA_PUNCH,46),
                        new MoveLearnSetEntry(Move.FEINT,21),
                        new MoveLearnSetEntry(Move.VACUUM_WAVE,26),
                        new MoveLearnSetEntry(Move.PURSUIT,11),
                        new MoveLearnSetEntry(Move.FOCUS_PUNCH,56),
                        new MoveLearnSetEntry(Move.REVENGE,1),
                        new MoveLearnSetEntry(Move.THUNDER_PUNCH,36),
                        new MoveLearnSetEntry(Move.MACH_PUNCH,16),
                        new MoveLearnSetEntry(Move.COMET_PUNCH,1),
                        new MoveLearnSetEntry(Move.BULLET_PUNCH,16),
                        new MoveLearnSetEntry(Move.DETECT,51),
                        new MoveLearnSetEntry(Move.COUNTER,61)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Nockchan");

    }


}
