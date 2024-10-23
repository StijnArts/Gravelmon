package drai.dev.data.pokemon.otopo;


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
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Honokomu extends drai.dev.data.pokemon.Pokemon {
    public Honokomu() {
        super("Honokomu",
                Type.FIRE, Type.NORMAL,
                new Stats(100,
                        70,
                        70,
                        70,
                        70,
                        40),
                List.of(Ability.FLASH_FIRE), Ability.FLAME_BODY,
                9, 200,
                new Stats(3,0,0,0,0,0), 45,
                0.875,
                198, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Honokomu embodies magma's ferocity. It fires huge bursts of fire that completely consume everything they come into contact with."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.SWIFT,1),
                        new MoveLearnSetEntry(Move.SCARY_FACE,5),
                        new MoveLearnSetEntry(Move.FLAME_CHARGE,10),
                        new MoveLearnSetEntry(Move.SMOG,15),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,20),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,25),
                        new MoveLearnSetEntry(Move.INCINERATE,30),
                        new MoveLearnSetEntry(Move.MIMIC,35),
                        new MoveLearnSetEntry(Move.BURNING_JEALOUSY,40),
                        new MoveLearnSetEntry(Move.LAST_RESORT,45),
                        new MoveLearnSetEntry(Move.FIRE_LASH,50),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,55),
                        new MoveLearnSetEntry(Move.LAVA_PLUME,60),
                        new MoveLearnSetEntry(Move.SCORCHING_SANDS,65),
                        new MoveLearnSetEntry(Move.FIRE_BLAST,70)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Honokomu");

    }


}
