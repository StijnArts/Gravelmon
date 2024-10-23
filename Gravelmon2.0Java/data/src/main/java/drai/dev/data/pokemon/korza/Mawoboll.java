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
public class Mawoboll extends drai.dev.data.pokemon.Pokemon {
    public Mawoboll() {
        super("Mawoboll",
                Type.PSYCHIC,
                new Stats(95,
                        40,
                        75,
                        50,
                        65,
                        35),
                List.of(Ability.SHED_SKIN,Ability.FOREWARN), Ability.HEALER,
                10, 23,
                new Stats(0,0,0,0,0,0), 0,
                0.0,
                72, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FAIRY,EggGroup.HUMAN_LIKE),
                List.of("Mawoboll stores berries in its pouch to give to other pokemon. Occasionally, it will shed its hard exterior. The shed shells are stored inside each other and are hidden."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CONFUSION,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.BESTOW,5),
                        new MoveLearnSetEntry(Move.PLAY_NICE,10),
                        new MoveLearnSetEntry(Move.SWEET_KISS,14),
                        new MoveLearnSetEntry(Move.NUZZLE,19),
                        new MoveLearnSetEntry(Move.BARRIER,23),
                        new MoveLearnSetEntry(Move.TEARFUL_LOOK,27),
                        new MoveLearnSetEntry(Move.PSYWAVE,31),
                        new MoveLearnSetEntry(Move.FLAIL,36),
                        new MoveLearnSetEntry(Move.ALLY_SWITCH,40),
                        new MoveLearnSetEntry(Move.STORED_POWER,45),
                        new MoveLearnSetEntry(Move.COSMIC_POWER,49),
                        new MoveLearnSetEntry(Move.PSYCHIC,53),
                        new MoveLearnSetEntry(Move.PROTECT,58),
                        new MoveLearnSetEntry(Move.FOLLOW_ME,62)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mawoboll");

    }


}
