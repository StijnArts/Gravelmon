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
public class Junboogy extends drai.dev.data.pokemon.Pokemon {
    public Junboogy() {
        super("Junboogy",
                Type.BUG,Type.NORMAL,
                new Stats(83,
                        74,
                        68,
                        74,
                        95,
                        91),
                List.of(Ability.DANCER), Ability.KLUTZ,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                170, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Despite their dancing skills, they are extremely clumsy. Junboogy love to dance and sing around lights, often attracted to porches and streetlights where they'll party the night away."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCUTTLEHOP,1),
                        new MoveLearnSetEntry(Move.GROWL,4),
                        new MoveLearnSetEntry(Move.STEAMROLLER,10),
                        new MoveLearnSetEntry(Move.FAKE_OUT,15),
                        new MoveLearnSetEntry(Move.DIZZY_PUNCH,20),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,24),
                        new MoveLearnSetEntry(Move.SILVER_WIND,28),
                        new MoveLearnSetEntry(Move.TRI_ATTACK,33),
                        new MoveLearnSetEntry(Move.SIGNAL_BEAM,37),
                        new MoveLearnSetEntry(Move.QUIVER_DANCE,41),
                        new MoveLearnSetEntry(Move.ENTRAINMENT,43),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,46),
                        new MoveLearnSetEntry(Move.WARDANCE,50),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,54),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,59),
                        new MoveLearnSetEntry(Move.LUNGE,63)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Junboogy");

    }


}
