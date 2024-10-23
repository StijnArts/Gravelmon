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
public class AfricanusanMachoke extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanMachoke(String name, Aspect aspect) {
        super(name, aspect, "Machoke",
                Type.ROCK,Type.GHOST,
                new Stats(80,
                        101,
                        70,
                        45,
                        50,
                        60),
                List.of(Ability.DISGUISE), null,
                15, 705,
                new Stats(0,2,0,0,0,0), 90,
                0.25,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.HUMAN_LIKE),
                List.of("Machoke lleva un cinturón para controlar su abrumadora energía. Como es tan peligroso, nadie se lo ha quitado nunca."),
                List.of(new EvolutionEntry("machamp africanusan", EvolutionType.TRADE, List.of(),
                        List.of())),
                List.of(
                        new MoveLearnSetEntry(Move.SHADOW_PUNCH,32),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,1),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,30),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,40),
                        new MoveLearnSetEntry(Move.ROCK_THROW,19),
                        new MoveLearnSetEntry(Move.STONE_EDGE,55),
                        new MoveLearnSetEntry(Move.ACCELEROCK,15),
                        new MoveLearnSetEntry(Move.LOW_KICK,1),
                        new MoveLearnSetEntry(Move.FOCUS_ENERGY,7),
                        new MoveLearnSetEntry(Move.REVENGE,25),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,36),
                        new MoveLearnSetEntry(Move.POWER_GEM,44),
                        new MoveLearnSetEntry(Move.ROCK_BLAST,10),
                        new MoveLearnSetEntry(Move.ROCK_WRECKER,22),
                        new MoveLearnSetEntry(Move.SCARY_FACE,51)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 28, 42, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_JUNGLE)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.JUNGLE_PYRAMID),
                0.28, 0.3,
                List.of());
           setLangFileName("Machoke");

    }


}
