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
public class Osnap extends drai.dev.data.pokemon.Pokemon {
    public Osnap() {
        super("Osnap",
                Type.ELECTRIC,Type.NORMAL,
                new Stats(40,
                        30,
                        40,
                        120,
                        80,
                        110),
                List.of(Ability.DOWNLOAD), Ability.DOWNLOAD,
                3, 23,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                84, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("An artificial mon originally developed as a media sharing device, Osnap is able to convert its memories into pictures and video."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.FLASH,1),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,4),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,9),
                        new MoveLearnSetEntry(Move.SPARK,14),
                        new MoveLearnSetEntry(Move.CONVERSION,18),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,23),
                        new MoveLearnSetEntry(Move.SCARY_FACE,27),
                        new MoveLearnSetEntry(Move.SWEET_KISS,30),
                        new MoveLearnSetEntry(Move.CONVERSION_2,32),
                        new MoveLearnSetEntry(Move.ROLE_PLAY,37),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,41),
                        new MoveLearnSetEntry(Move.LOCKON,46),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,51),
                        new MoveLearnSetEntry(Move.COPYCAT,56),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,60),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,66),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,70)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Osnap");

    }


}
