package drai.dev.data.pokemon.chaosinvestia.regional;


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
public class VesitanAvalugg extends drai.dev.data.pokemon.Pokemon {
    public VesitanAvalugg(String name, Aspect aspect) {
        super(name, aspect, "VesitanAvalugg",
                Type.ICE,Type.WATER,
                new Stats(80,
                        100,
                        155,
                        67,
                        58,
                        125),
                List.of(Ability.DRY_SKIN,Ability.ICE_BODY), null,
                20, 3050,
                new Stats(0,0,2,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("Mit den zahlreichen Arktip auf seinem Rücken sieht es aus wie ein Flugzeugträger aus Eis."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.IRON_DEFENSE,1),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,52),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.BLIZZARD,46),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.SKULL_BASH,60),
                        new MoveLearnSetEntry(Move.CURSE,22),
                        new MoveLearnSetEntry(Move.ICE_BALL,30),
                        new MoveLearnSetEntry(Move.CRUNCH,65),
                        new MoveLearnSetEntry(Move.ICY_WIND,10),
                        new MoveLearnSetEntry(Move.SHARPEN,20),
                        new MoveLearnSetEntry(Move.AVALANCHE,42),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,56),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,15),
                        new MoveLearnSetEntry(Move.RECOVER,51),
                        new MoveLearnSetEntry(Move.ICE_FANG,26),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,35),
                        new MoveLearnSetEntry(Move.RAZOR_SHELL,37)                        ),
                List.of(Label.CHAOSINVESTIA),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.COMMON, 37, 48, 0.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Avalugg");

    }


}
