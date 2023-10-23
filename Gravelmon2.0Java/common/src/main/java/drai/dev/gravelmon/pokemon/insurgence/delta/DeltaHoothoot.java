package drai.dev.gravelmon.pokemon.insurgence.delta;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class DeltaHoothoot extends Pokemon {
    public DeltaHoothoot(int dexNo) {
        super(dexNo,"DeltaHoothoot",
                Type.ICE, Type.FLYING,
                new Stats(60, 30,30,36,56,50),
                List.of(Ability.NO_GUARD, Ability.KEEN_EYE), Ability.SNOW_CLOAK,
                7, 212,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                42, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.DELTA),
                List.of("A Delta Species discovered by Aboodie. Its ears are sensitive enough to hear a snowflake fall upon the snow on the ground from across the forest."),
                List.of(new EvolutionEntry("deltanoctowl", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"20")))),
                List.of(
                        new MoveLearnSetEntry(Move.POWDER_SNOW,1),
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.MIST,1),
                        new MoveLearnSetEntry(Move.HAIL,5),
                        new MoveLearnSetEntry(Move.PECK,9),
                        new MoveLearnSetEntry(Move.ICY_WIND,13),
                        new MoveLearnSetEntry(Move.CAMOUFLAGE,17),
                        new MoveLearnSetEntry(Move.AIR_CUTTER,21),
                        new MoveLearnSetEntry(Move.ICE_SHARD,25),
                        new MoveLearnSetEntry(Move.FEINT,29),
                        new MoveLearnSetEntry(Move.AIR_SLASH,33),
                        new MoveLearnSetEntry(Move.RAZOR_WIND,37),
                        new MoveLearnSetEntry(Move.BLIZZARD,41),
                        new MoveLearnSetEntry(Move.HURRICANE,45),
                        new MoveLearnSetEntry(Move.DEFOG,49),
                        new MoveLearnSetEntry(Move.ROOST,53),
                        new MoveLearnSetEntry(Move.SHEER_COLD,57),
                        new MoveLearnSetEntry(Move.TOXIC,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.HIDDEN_POWER,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.SNATCH,"tm"),
                        new MoveLearnSetEntry(Move.SAFEGUARD,"tm"),
                        new MoveLearnSetEntry(Move.FRUSTRATION,"tm"),
                        new MoveLearnSetEntry(Move.RETURN,"tm"),
                        new MoveLearnSetEntry(Move.DOUBLE_TEAM,"tm"),
                        new MoveLearnSetEntry(Move.AERIAL_ACE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.ATTRACT,"tm"),
                        new MoveLearnSetEntry(Move.ROOST,"tm"),
                        new MoveLearnSetEntry(Move.FALSE_SWIPE,"tm"),
                        new MoveLearnSetEntry(Move.FLING,"tm"),
                        new MoveLearnSetEntry(Move.JET_STREAM,"tm"),
                        new MoveLearnSetEntry(Move.SWAGGER,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.STEEL_WING,"tm"),
                        new MoveLearnSetEntry(Move.FROST_BREATH,"tm"),
                        new MoveLearnSetEntry(Move.ACROBATICS,"tm"),
                        new MoveLearnSetEntry(Move.DAZZLING_GLEAM,"tm"),
                        new MoveLearnSetEntry(Move.ACHILLES_HEEL,"tm"),
                        new MoveLearnSetEntry(Move.AVALANCHE,"tm"),
                        new MoveLearnSetEntry(Move.SILVER_WIND,"tm"),
                        new MoveLearnSetEntry(Move.SKY_DROP,"tm"),
                        new MoveLearnSetEntry(Move.ECHOED_VOICE,"tm"),
                        new MoveLearnSetEntry(Move.ROUND,"tm"),
                        new MoveLearnSetEntry(Move.CAPTIVATE,"tm"),
                        new MoveLearnSetEntry(Move.PERMAFROST,"tm"),
                        new MoveLearnSetEntry(Move.CONFIDE,"tm"),
                        new MoveLearnSetEntry(Move.PLUCK,"tm"),
                        new MoveLearnSetEntry(Move.SECRET_POWER,"tm"),
                        new MoveLearnSetEntry(Move.FLY,"tm"),
                        new MoveLearnSetEntry(Move.ACID,"tutor"),
                        new MoveLearnSetEntry(Move.COVET,"tutor"),
                        new MoveLearnSetEntry(Move.ENDEAVOR,"tutor"),
                        new MoveLearnSetEntry(Move.ENDURE,"tutor"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tutor"),
                        new MoveLearnSetEntry(Move.HURRICANE,"tutor"),
                        new MoveLearnSetEntry(Move.HYPER_VOICE,"tutor"),
                        new MoveLearnSetEntry(Move.ICY_WIND,"tutor"),
                        new MoveLearnSetEntry(Move.MIMIC,"tutor"),
                        new MoveLearnSetEntry(Move.SKY_ATTACK,"tutor"),
                        new MoveLearnSetEntry(Move.SNORE,"tutor"),
                        new MoveLearnSetEntry(Move.TAILWIND,"tutor"),
                        new MoveLearnSetEntry(Move.UPROAR,"tutor")
                        ),
                List.of(Label.GEN2,Label.INSURGENCE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 22, 39, 8.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_NETHER)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.17, 0.3,
                List.of());
        this.setLangFileName("Hoothoot");
        this.setCanFly(true);
        this.setPortraitXYZ(0,1.8,0);
    }
}
