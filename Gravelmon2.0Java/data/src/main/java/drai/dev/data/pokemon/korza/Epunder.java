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
public class Epunder extends drai.dev.data.pokemon.Pokemon {
    public Epunder() {
        super("Epunder",
                Type.DRAGON,Type.ELECTRIC,
                new Stats(90,
                        80,
                        80,
                        138,
                        120,
                        92),
                List.of(Ability.LIGHTNING_ROD,Ability.CLOUD_NINE), Ability.SERENE_GRACE,
                34, 558,
                new Stats(0,0,0,3,0,0), 35,
                0.5,
                270, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DRAGON),
                List.of("Epunder are seen as a symbol of luck and good fortune, especially to farmers because of the powerful rains they bring during times of drought. Wrathful Epunder are a common theme in some local folk tales."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.THUNDER_SHOCK,1),
                        new MoveLearnSetEntry(Move.DRAGON_RAGE,1),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,7),
                        new MoveLearnSetEntry(Move.MAGNET_RISE,14),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,18),
                        new MoveLearnSetEntry(Move.THUNDER_WAVE,24),
                        new MoveLearnSetEntry(Move.DISABLE,27),
                        new MoveLearnSetEntry(Move.WHIRLWIND,33),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,38),
                        new MoveLearnSetEntry(Move.DISCHARGE,42),
                        new MoveLearnSetEntry(Move.DRAGON_PULSE,47),
                        new MoveLearnSetEntry(Move.THUNDER,55),
                        new MoveLearnSetEntry(Move.FESTIVESHOT,61),
                        new MoveLearnSetEntry(Move.ZAP_CANNON,70)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Epunder");

    }


}
