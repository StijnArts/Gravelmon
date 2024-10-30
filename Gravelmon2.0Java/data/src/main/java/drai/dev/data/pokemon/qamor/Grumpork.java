package drai.dev.data.pokemon.qamor;


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
public class Grumpork extends drai.dev.data.pokemon.Pokemon {
    public Grumpork() {
        super("Grumpork",
                Type.FIGHTING,
                new Stats(90,
                        110,
                        105,
                        70,
                        60,
                        90),
                List.of(Ability.ANGER_POINT,Ability.UNAWARE), Ability.UNNERVE,
                19, 958,
                new Stats(0,2,1,0,0,0), 45,
                0.5,
                236, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Evo Hammer ThrowSTAB Fighting - Circle ThrowSTAB Fighting - Bulk Up Fighting - Splash Normal - Storm ThrowSTAB Fighting - Rock SmashSTAB Fighting - Odor Sleuth  Normal - Torment  Dark - Wood Hammer Grass - Hammer ThrowSTAB Fighting - Hammer ArmSTAB Fighting - Rock Throw Rock 7 Rock SmashSTAB Fighting 10 Odor Sleuth  Normal 14 Knock BackSTAB Fighting 15 Psych Up Normal 18 Revenge STAB Fighting 21 Magic Coat  Psychic 26 Zen Headbutt Psychic 29 Power Gem Rock 35 Rest Psychic 35 Snore  Normal 42 Body Press STAB Fighting 46 Payback  Dark 52 Close CombatSTAB Fighting 60 Bounce Flying"),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.CIRCLE_THROW,1),
                        new MoveLearnSetEntry(Move.TORMENT,1),
                        new MoveLearnSetEntry(Move.HAMMERTHROW,1),
                        new MoveLearnSetEntry(Move.ROCK_THROW,1),
                        new MoveLearnSetEntry(Move.BULK_UP,1),
                        new MoveLearnSetEntry(Move.HAMMER_ARM,1),
                        new MoveLearnSetEntry(Move.SPLASH,1),
                        new MoveLearnSetEntry(Move.WOOD_HAMMER,1),
                        new MoveLearnSetEntry(Move.STORM_THROW,1),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,7),
                        new MoveLearnSetEntry(Move.ODOR_SLEUTH,10),
                        new MoveLearnSetEntry(Move.KNOCKBACK,14),
                        new MoveLearnSetEntry(Move.PSYCH_UP,15),
                        new MoveLearnSetEntry(Move.REVENGE,18),
                        new MoveLearnSetEntry(Move.MAGIC_COAT,21),
                        new MoveLearnSetEntry(Move.ZEN_HEADBUTT,26),
                        new MoveLearnSetEntry(Move.POWER_GEM,29),
                        new MoveLearnSetEntry(Move.SNORE,35),
                        new MoveLearnSetEntry(Move.REST,35),
                        new MoveLearnSetEntry(Move.BODY_PRESS,42),
                        new MoveLearnSetEntry(Move.PAYBACK,46),
                        new MoveLearnSetEntry(Move.CLOSE_COMBAT,52),
                        new MoveLearnSetEntry(Move.BOUNCE,60),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm")                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 45, 59, .34, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_BADLANDS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Grumpork");

    }


}
