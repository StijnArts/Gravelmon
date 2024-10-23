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
public class Garnome extends drai.dev.data.pokemon.Pokemon {
    public Garnome() {
        super("Garnome",
                Type.NORMAL,Type.ROCK,
                new Stats(75,
                        59,
                        92,
                        51,
                        73,
                        50),
                List.of(Ability.SAP_SIPPER), Ability.FLOWER_VEIL,
                6, 60,
                new Stats(0,0,0,0,0,0), 0,
                1.0,
                80, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.HUMAN_LIKE,EggGroup.MINERAL),
                List.of("Garnome like to live around wildflowers and suburban lawns. They will tend to and care for any plants they come across, and especially love living in gardens."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,4),
                        new MoveLearnSetEntry(Move.RAZOR_LEAF,10),
                        new MoveLearnSetEntry(Move.TEETER_DANCE,14),
                        new MoveLearnSetEntry(Move.ROTOTILLER,20),
                        new MoveLearnSetEntry(Move.WATER_SPORT,23),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,28),
                        new MoveLearnSetEntry(Move.BULLDOZE,30),
                        new MoveLearnSetEntry(Move.HEADBUTT,33),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,37),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,37),
                        new MoveLearnSetEntry(Move.ROCK_SLIDE,43),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,49),
                        new MoveLearnSetEntry(Move.PETAL_BLIZZARD,53),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,58),
                        new MoveLearnSetEntry(Move.STEALTH_ROCK,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Garnome");

    }


}
