package drai.dev.gravelmon.pokemon.otopo;


import drai.dev.gravelmon.pokemon.amavi.*;
import drai.dev.gravelmon.pokemon.dhiome.*;
import drai.dev.gravelmon.pokemon.mushi.*;
import drai.dev.gravelmon.pokemon.theos.*;
import drai.dev.gravelmon.pokemon.kuria.*;
import drai.dev.gravelmon.pokemon.ottora.*;
import drai.dev.gravelmon.pokemon.spion.*;
import drai.dev.gravelmon.pokemon.mastenia.*;
import drai.dev.gravelmon.pokemon.mongratis.*;
import drai.dev.gravelmon.pokemon.ultraspace.*;
import drai.dev.gravelmon.pokemon.urzavos.*;
import drai.dev.gravelmon.pokemon.terranov.*;
import drai.dev.gravelmon.pokemon.enjin.*;
import drai.dev.gravelmon.pokemon.mystis.*;
import drai.dev.gravelmon.pokemon.pastelisland.*;
import drai.dev.gravelmon.pokemon.neonintendo.*;
import drai.dev.gravelmon.pokemon.tokas.*;
import drai.dev.gravelmon.pokemon.panjaea.*;
import drai.dev.gravelmon.pokemon.cyare.*;
import drai.dev.gravelmon.pokemon.olysos.*;
import drai.dev.gravelmon.pokemon.nodorro.*;
import drai.dev.gravelmon.pokemon.orbis.*;
import drai.dev.gravelmon.pokemon.fliga.*;
import drai.dev.gravelmon.pokemon.ruskow.*;
import drai.dev.gravelmon.pokemon.otopo.*;
import drai.dev.gravelmon.pokemon.goetia.*;
import drai.dev.gravelmon.pokemon.ionos.*;
import drai.dev.gravelmon.pokemon.lagoone.*;
import drai.dev.gravelmon.pokemon.atlas.*;
import drai.dev.gravelmon.pokemon.avoris.*;
import drai.dev.gravelmon.pokemon.enriko.*;
import drai.dev.gravelmon.pokemon.ferroa.*;
import drai.dev.gravelmon.pokemon.hiza.*;
import drai.dev.gravelmon.pokemon.hub.*;
import drai.dev.gravelmon.pokemon.interregional.*;
import drai.dev.gravelmon.pokemon.isiah.*;
import drai.dev.gravelmon.pokemon.junnin.*;
import drai.dev.gravelmon.pokemon.lonava.*;
import drai.dev.gravelmon.pokemon.mythire.*;
import drai.dev.gravelmon.pokemon.nosto.*;
import drai.dev.gravelmon.pokemon.novrai.*;
import drai.dev.gravelmon.pokemon.oceane.*;
import drai.dev.gravelmon.pokemon.okeno.*;
import drai.dev.gravelmon.pokemon.orohnhavai.*;
import drai.dev.gravelmon.pokemon.qamor.*;
import drai.dev.gravelmon.pokemon.rica.*;
import drai.dev.gravelmon.pokemon.varitas.*;
import drai.dev.gravelmon.pokemon.aristos.*;
import drai.dev.gravelmon.pokemon.midamis.*;
import drai.dev.gravelmon.pokemon.norheim.*;
import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;
public class Orialith extends drai.dev.gravelmon.pokemon.Pokemon {
    public Orialith() {
        super("Orialith",
                Type.STEEL, Type.GHOST,
                new Stats(75,
                        60,
                        100,
                        55,
                        80,
                        30),
                List.of(Ability.HEATPROOF,Ability.STEELWORKER), Ability.LIGHTNING_ROD,
                20, 1000,
                new Stats(0,0,1,0,0,0), 190,
                0.5,
                80, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("The first sighting of an Orialith was in a distant Pokémon Tower. A departing spirit inhabits the memorial, causing it to have a mind of its own."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,1),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.HEX,1),
                        new MoveLearnSetEntry(Move.CURSE,6),
                        new MoveLearnSetEntry(Move.SPITE,6),
                        new MoveLearnSetEntry(Move.GYRO_BALL,12),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,15),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,15),
                        new MoveLearnSetEntry(Move.METAL_BURST,19),
                        new MoveLearnSetEntry(Move.SAND_TOMB,20),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,22),
                        new MoveLearnSetEntry(Move.IRON_HEAD,26),
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,26),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,30),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,32),
                        new MoveLearnSetEntry(Move.GRUDGE,35),
                        new MoveLearnSetEntry(Move.NIGHTMARE,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,43),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,47),
                        new MoveLearnSetEntry(Move.DESTINY_BOND,50),
                        new MoveLearnSetEntry(Move.TOMBSTONER,55),
                        new MoveLearnSetEntry(Move.PERISH_SONG,60),
                        new MoveLearnSetEntry(Move.MEMENTO,60)                        ),
                List.of(Label.OTOPO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Orialith");

    }


}
