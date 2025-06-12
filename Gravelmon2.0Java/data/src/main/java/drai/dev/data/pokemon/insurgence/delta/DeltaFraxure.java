package drai.dev.data.pokemon.insurgence.delta;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class DeltaFraxure extends Pokemon {
    public DeltaFraxure(String name, Aspect aspect) {
        super(name, aspect,"DeltaFraxure",
                Type.WATER,
                new Stats(66, 117, 70, 40, 50, 67),
                List.of(Ability.STRONG_JAW, Ability.WATER_VEIL), Ability.SWIFT_SWIM,
                10, 360,
                new Stats(0,2,0,0,0,0), 60,
                0.5,
                144, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("Growing bolder as it becomes stronger, it prefers to bite boats being used by fishermen. However, sometimes they are careless and are pierced by fish hooks."),
                List.of(new EvolutionEntry("deltahaxorus", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"48")))),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.BITE,1),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,1),
                        new MoveLearnSetEntry(Move.LEER,4),
                        new MoveLearnSetEntry(Move.BITE,7),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,10),
                        new MoveLearnSetEntry(Move.AQUA_JET,13),
                        new MoveLearnSetEntry(Move.SCARY_FACE,16),
                        new MoveLearnSetEntry(Move.POISON_FANG,20),
                        new MoveLearnSetEntry(Move.ICE_FANG,24),
                        new MoveLearnSetEntry(Move.CRUNCH,28),
                        new MoveLearnSetEntry(Move.AGILITY,32),
                        new MoveLearnSetEntry(Move.TAUNT,36),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,42),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,48),
                        new MoveLearnSetEntry(Move.THRASH,54),
                        new MoveLearnSetEntry(Move.HYDRO_PUMP,60),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,66),
                        new MoveLearnSetEntry(Move.HONE_CLAWS,"tm"),
                        new MoveLearnSetEntry(Move.ROAR,"tm"),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.TAUNT,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.HYPER_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.IRON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_TOMB,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.SCALD,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.BRINE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.DRAGON_TAIL,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_CLAW,"tm"),
                        new MoveLearnSetEntry(Move.PAYBACK,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_IMPACT,"tm"),
                        new MoveLearnSetEntry(Move.SWORDS_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.XSCISSOR,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.DRACO_JET,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.PERMAFROST,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ROCK_SMASH,"tm"),
                        new MoveLearnSetEntry(Move.CUT,"tm"),
                        new MoveLearnSetEntry(Move.SURF,"tm"),
                        new MoveLearnSetEntry(Move.WATERFALL,"tm"),
                        new MoveLearnSetEntry(Move.DIVE,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.AQUA_TAIL,"tutor"),
                        new MoveLearnSetEntry(Move.COUNTER,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.FURY_CUTTER,"tutor"),
                        new MoveLearnSetEntry(Move.HEADBUTT,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.OUTRAGE,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.SUPER_FANG,"tutor"),
                        new MoveLearnSetEntry(Move.SUPERPOWER,"tutor"),
                        new MoveLearnSetEntry(Move.WATER_PULSE,"tutor"),
                        new MoveLearnSetEntry(Move.WHIRLPOOL,"tutor")
                        ),
                List.of(Label.GEN5,Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.RARE)
    .setMinLevel(37)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.SUBMERGED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        this.setLangFileName("Fraxure");
        this.setCanSwim(true);
        this.setCanBreathUnderwater(true);
    }
}
