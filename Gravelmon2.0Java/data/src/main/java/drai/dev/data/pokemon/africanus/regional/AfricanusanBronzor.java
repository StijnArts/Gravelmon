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
public class AfricanusanBronzor extends drai.dev.data.pokemon.Pokemon {
    public AfricanusanBronzor(String name, Aspect aspect) {
        super(name, aspect, "Bronzor",
                Type.STEEL,
                new Stats(57,
                        24,
                        86,
                        23,
                        24,
                        86),
                List.of(Ability.LEVITATE,Ability.HEATPROOF), null,
                5, 605,
                new Stats(0,0,1,0,0,0), 255,
                -1.0,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("Se descubrieron herramientas con su forma en tumbas antiguas, pero se desconoce si tiene relación."),
                List.of(new EvolutionEntry("bronzong africanusan", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"33")))),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,19),
                        new MoveLearnSetEntry(Move.FIRE_SPIN,29),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,21),
                        new MoveLearnSetEntry(Move.FLASH_CANNON,41),
                        new MoveLearnSetEntry(Move.GYRO_BALL,35),
                        new MoveLearnSetEntry(Move.INCINERATE,5),
                        new MoveLearnSetEntry(Move.METAL_SOUND,31),
                        new MoveLearnSetEntry(Move.FLAME_WHEEL,9),
                        new MoveLearnSetEntry(Move.INFERNO,55),
                        new MoveLearnSetEntry(Move.FLAMETHROWER,49),
                        new MoveLearnSetEntry(Move.FIRE_LASH,39),
                        new MoveLearnSetEntry(Move.EMBER,1),
                        new MoveLearnSetEntry(Move.FLAME_BURST,25),
                        new MoveLearnSetEntry(Move.FIRE_FANG,11),
                        new MoveLearnSetEntry(Move.HEAL_BLOCK,45)                        ),
                List.of(Label.AFRICANUS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 34, 5.4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Bronzor");

    }


}