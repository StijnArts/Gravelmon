package drai.dev.data.pokemon.africanus.regional;


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
public class AfricanusanKricketune extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanKricketune(String name, Aspect aspect) {
        super(name, aspect, "AfricanusanKricketune",
                Type.BUG,Type.FIGHTING,
                new Stats(87,
                        90,
                        65,
                        70,
                        60,
                        105),
                List.of(Ability.SWARM), null,
                10, 255,
                new Stats(0,2,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Tras siglos de convivencia con los galos, Kricketune es capaz de luchar cómo un galo más."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.KARATE_CHOP,18),
                        new MoveLearnSetEntry(Move.ARM_THRUST,34),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,42),
                        new MoveLearnSetEntry(Move.BUG_BITE,32),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,1),
                        new MoveLearnSetEntry(Move.FORCE_PALM,20),
                        new MoveLearnSetEntry(Move.BOT,25),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,10),
                        new MoveLearnSetEntry(Move.SLASH,26),
                        new MoveLearnSetEntry(Move.BUG_BUZZ,46),
                        new MoveLearnSetEntry(Move.XSCISSOR,30),
                        new MoveLearnSetEntry(Move.REVERSAL,22),
                        new MoveLearnSetEntry(Move.CROSS_CHOP,50),
                        new MoveLearnSetEntry(Move.LEECH_LIFE,14),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.BIDE,1),
                        new MoveLearnSetEntry(Move.DRAGON_DANCE,33),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,38)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 11, 34, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Kricketune");

    }


}
