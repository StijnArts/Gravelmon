package drai.dev.data.pokemon.ayrei.regional;


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
import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class AyreianFerrothorn extends drai.dev.data.pokemon.Pokemon {
    public AyreianFerrothorn(String name, Aspect aspect) {
        super(name, aspect, "Ferrothorn",
                Type.POISON,Type.STEEL,
                new Stats(74,
                        94,
                        131,
                        20,
                        54,
                        116),
                List.of(Ability.IRON_BARBS,Ability.POISON_POINT), null,
                10, 1100,
                new Stats(0,0,2,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.MINERAL),
                List.of("They attach themselves to cave ceilings, firing steel spikes at targets passing beneath them."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,35),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POISON_JAB,40),
                        new MoveLearnSetEntry(Move.SELFDESTRUCT,30),
                        new MoveLearnSetEntry(Move.EXPLOSION,56),
                        new MoveLearnSetEntry(Move.CURSE,43),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,20),
                        new MoveLearnSetEntry(Move.METAL_CLAW,1),
                        new MoveLearnSetEntry(Move.PIN_MISSILE,1),
                        new MoveLearnSetEntry(Move.GYRO_BALL,49),
                        new MoveLearnSetEntry(Move.POWER_WHIP,1),
                        new MoveLearnSetEntry(Move.IRON_HEAD,25),
                        new MoveLearnSetEntry(Move.INGRAIN,15)                        ),
                List.of(Label.VANGUARD),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ferrothorn");

    }


}