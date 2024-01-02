package drai.dev.gravelmon.pokemon.lockemon.regional;

import drai.dev.gravelmon.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class KaskadianLuxio extends Pokemon {
    public KaskadianLuxio(int dexNo) {
        super(dexNo,"KaskadianLuxio",
                Type.ICE,
                new Stats(60, 85,49,60,49,60),
                List.of(Ability.FUR_COAT, Ability.MOXIE), Ability.SLUSH_RUSH,
                9, 305,
                new Stats(0,2,0,0,0,0), 120,
                0.5,
                127, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(new EvolutionEntry("kaskadianluxray", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"15")))
                ),
                List.of(
                        new MoveLearnSetEntry(Move.LEER,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,4),
                        new MoveLearnSetEntry(Move.HAIL,8),
                        new MoveLearnSetEntry(Move.BITE,12),
                        new MoveLearnSetEntry(Move.ICE_FANG,16),
                        new MoveLearnSetEntry(Move.ROAR,20),
                        new MoveLearnSetEntry(Move.ICE_SHARD,24),
                        new MoveLearnSetEntry(Move.SCARY_FACE,28),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,32),
                        new MoveLearnSetEntry(Move.CRUNCH,36),
                        new MoveLearnSetEntry(Move.ICICLE_SPEAR,40),
                        new MoveLearnSetEntry(Move.SWAGGER,44),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,48),
                        new MoveLearnSetEntry(Move.BABYDOLL_EYES,"egg"),
                        new MoveLearnSetEntry(Move.DOUBLE_KICK,"egg"),
                        new MoveLearnSetEntry(Move.HOWL,"egg"),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,"egg"),
                        new MoveLearnSetEntry(Move.QUICK_ATTACK,"egg"),
                        new MoveLearnSetEntry(Move.SHOCK_WAVE,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"egg"),
                        new MoveLearnSetEntry(Move.TAKE_DOWN,"tm"),
                        new MoveLearnSetEntry(Move.FAKE_TEARS,"tm"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.FIRE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.THUNDER_FANG,"tm"),
                        new MoveLearnSetEntry(Move.ICE_FANG,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.SNARL,"tm"),
                        new MoveLearnSetEntry(Move.SWIFT,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.FREEZEDRY,"tm"),
                        new MoveLearnSetEntry(Move.SUNNY_DAY,"tm"),
                        new MoveLearnSetEntry(Move.RAIN_DANCE,"tm"),
                        new MoveLearnSetEntry(Move.PSYCHIC_FANGS,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BALL,"tm"),
                        new MoveLearnSetEntry(Move.LIGHT_SCREEN,"tm"),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.TRIPLE_AXEL,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.CRUNCH,"tm"),
                        new MoveLearnSetEntry(Move.ICE_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.PLAY_ROUGH,"tm"),
                        new MoveLearnSetEntry(Move.HELPING_HAND,"tm"),
                        new MoveLearnSetEntry(Move.HAIL,"tm"),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,"tm"),
                        new MoveLearnSetEntry(Move.BLIZZARD,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                ),
                List.of(Label.GEN4,Label.LOCKEMON),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 15, 36, 5.0, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_COLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.2, 0.3,
                List.of());
        this.setLangFileName("Luxio");
        this.setPortraitXYZ(0,1.8,0);
    }
}
