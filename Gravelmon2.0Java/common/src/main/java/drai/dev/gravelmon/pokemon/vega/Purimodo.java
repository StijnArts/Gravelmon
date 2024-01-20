package drai.dev.gravelmon.pokemon.vega;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Purimodo extends Pokemon {
    public Purimodo() {
        super( "Purimodo",
                Type.ICE, Type.FAIRY,
                new Stats(90,
                        45,
                        85	,
                        110,
                        95,
                        115),
                List.of(Ability.NATURAL_CURE), Ability.ICE_BODY,
                12, 243,
                new Stats(0,0,0,0,0,2), 45,
                -1,
                178, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FAIRY),
                List.of(""),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.HARDEN,1),
                        new MoveLearnSetEntry(Move.DISARMING_VOICE,1),
                        new MoveLearnSetEntry(Move.HAIL,1),
                        new MoveLearnSetEntry(Move.HAIL,6),
                        new MoveLearnSetEntry(Move.DRAINING_KISS,11),
                        new MoveLearnSetEntry(Move.MIST,15),
                        new MoveLearnSetEntry(Move.MYSTIC_CHANT,20),
                        new MoveLearnSetEntry(Move.SWEET_SCENT,25),
                        new MoveLearnSetEntry(Move.MIRROR_SHOT,29),
                        new MoveLearnSetEntry(Move.RECOVER,34),
                        new MoveLearnSetEntry(Move.ICY_KISS,39),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,43),
                        new MoveLearnSetEntry(Move.LIGHT_PULSE,48),
                        new MoveLearnSetEntry(Move.MINIMIZE,53),
                        new MoveLearnSetEntry(Move.BLIZZARD,57),
                        new MoveLearnSetEntry(Move.SHEER_COLD,62),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tm"),
                        new MoveLearnSetEntry(Move.FROSTBITE,"tm"),
                        new MoveLearnSetEntry(Move.DRAIN_PUNCH,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.REFLECT,"tm"),
                        new MoveLearnSetEntry(Move.SHINE_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.STRENGTH,"tm"),
                        new MoveLearnSetEntry(Move.LICK,"tutor"),
                        new MoveLearnSetEntry(Move.SWEET_KISS,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,"tutor"),
                        new MoveLearnSetEntry(Move.CHARM,"tutor"),
                        new MoveLearnSetEntry(Move.ICING,"tutor"),
                        new MoveLearnSetEntry(Move.HAZE,"tutor"),
                        new MoveLearnSetEntry(Move.GLOMP,"tutor"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tutor"),
                        new MoveLearnSetEntry(Move.SPIRIT_SNUFF,"tutor")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 6, 27, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SNOWY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.4, 0.3,
                List.of());
    }
}
