package drai.dev.data.pokemon.vega;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Birarchy extends Pokemon {
    public Birarchy() {
        super( "Birarchy",
                Type.NORMAL, Type.FLYING,
                new Stats(42,
                        56,
                        42,
                        34,
                        37,
                        40),
                List.of(Ability.KEEN_EYE), Ability.TANGLED_FEET,
                3, 21,
                new Stats(0,1,0,0,0,0), 255,
                0.5,
                58, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FLYING),
                List.of(""),
                List.of(new EvolutionEntry("Wochecho", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"19")))),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.PECK,1),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,6),
                        new MoveLearnSetEntry(Move.WARBLE,9),
                        new MoveLearnSetEntry(Move.SING,13),
                        new MoveLearnSetEntry(Move.WING_ATTACK,18),
                        new MoveLearnSetEntry(Move.WHIRLWIND,21),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,25),
                        new MoveLearnSetEntry(Move.AIR_SLASH,30),
                        new MoveLearnSetEntry(Move.ROOST,33),
                        new MoveLearnSetEntry(Move.CRUSH_CLAW,37),
                        new MoveLearnSetEntry(Move.MIRROR_MOVE,42),
                        new MoveLearnSetEntry(Move.BRAVE_BIRD,45),
                        new MoveLearnSetEntry(Move.GLIDE,"tutor"),
                        new MoveLearnSetEntry(Move.LEER,"tutor"),
                        new MoveLearnSetEntry(Move.SNARL,"tutor"),
                        new MoveLearnSetEntry(Move.FEINT_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.TORMENT,"tutor"),
                        new MoveLearnSetEntry(Move.CORNER,"tutor"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tutor"),
                        new MoveLearnSetEntry(Move.QUICK_TURN,"tutor"),
                        new MoveLearnSetEntry(Move.DOUBLEEDGE,"tutor"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,"tm"),
                        new MoveLearnSetEntry(Move.AIR_SLASH,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.MYSTIC_CHANT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.JET_STRIKE,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,"egg"),
                        new MoveLearnSetEntry(Move.PURSUIT,"egg"),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,"egg"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"egg"),
                        new MoveLearnSetEntry(Move.FACADE,"egg"),
                        new MoveLearnSetEntry(Move.DEFOG,"egg"),
                        new MoveLearnSetEntry(Move.TWISTER,"egg"),
                        new MoveLearnSetEntry(Move.SUPERSONIC,"egg"),
                        new MoveLearnSetEntry(Move.UTURN,"egg"),
                        new MoveLearnSetEntry(Move.FEATHER_DANCE,"egg"),
                        new MoveLearnSetEntry(Move.FURY_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.FORESIGHT,"egg")
                        ),
                List.of(Label.DENEB),
                0,
                List.of(), SpawnContext.GROUNDED, SpawnPool.COMMON, 6, 19, 7.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DECIDUOUS_FOREST)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY, "true")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD, Biome.IS_SUMMER))),
                List.of(SpawnPreset.NATURAL),
                0.4, 0.3,
                List.of());
        setCanFly(true);
    }
}
