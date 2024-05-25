package drai.dev.gravelmon.pokemon.hiza.regional;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class HizianLileep extends drai.dev.gravelmon.pokemon.Pokemon {
    public HizianLileep(int dex) {
        super(dex, "Lileep",
                Type.GRASS, Type.GHOST,
                new Stats(66,
                        41,
                        77,
                        87,
                        61,
                        23),
                List.of(Ability.PERISH_BODY), Ability.PERISH_BODY,
                13, 165,
                new Stats(0,0,0,1,0,0), 90,
                0.5,
                71, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of("Reanimated from an unusually light Root Fossil. Its glowing tentacles are extremely sticky and captures anything that comes close to it."),
                List.of(new EvolutionEntry("HizianCradily", EvolutionType.LEVEL_UP, List.of(),
                                List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(
                        new MoveLearnSetEntry(Move.ASTONISH,1),
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1),
                        new MoveLearnSetEntry(Move.ROLLOUT,1),
                        new MoveLearnSetEntry(Move.ABSORB,5),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,9),
                        new MoveLearnSetEntry(Move.BULLET_SEED,13),
                        new MoveLearnSetEntry(Move.INFESTATION,17),
                        new MoveLearnSetEntry(Move.HEX,21),
                        new MoveLearnSetEntry(Move.MEGA_DRAIN,25),
                        new MoveLearnSetEntry(Move.DISABLE,29),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,35),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,40),
                        new MoveLearnSetEntry(Move.CURSE,45),
                        new MoveLearnSetEntry(Move.PAIN_SPLIT,50),
                        new MoveLearnSetEntry(Move.POWER_WHIP,55),
                        new MoveLearnSetEntry(Move.BEAT_UP,"egg"),
                        new MoveLearnSetEntry(Move.BLOCK,"egg"),
                        new MoveLearnSetEntry(Move.LEECH_SEED,"egg"),
                        new MoveLearnSetEntry(Move.SHADOW_SNEAK,"egg"),
                        new MoveLearnSetEntry(Move.STRENGTH_SAP,"egg"),
                        new MoveLearnSetEntry(Move.SCARY_FACE,"tm"),
                        new MoveLearnSetEntry(Move.PROTECT,"tm"),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,"tm"),
                        new MoveLearnSetEntry(Move.THIEF,"tm"),
                        new MoveLearnSetEntry(Move.TRAILBLAZE,"tm"),
                        new MoveLearnSetEntry(Move.POUNCE,"tm"),
                        new MoveLearnSetEntry(Move.FACADE,"tm"),
                        new MoveLearnSetEntry(Move.HEX,"tm"),
                        new MoveLearnSetEntry(Move.NIGHT_SHADE,"tm"),
                        new MoveLearnSetEntry(Move.ENDURE,"tm"),
                        new MoveLearnSetEntry(Move.BULLET_SEED,"tm"),
                        new MoveLearnSetEntry(Move.SLEEP_TALK,"tm"),
                        new MoveLearnSetEntry(Move.SEED_BOMB,"tm"),
                        new MoveLearnSetEntry(Move.GRASS_KNOT,"tm"),
                        new MoveLearnSetEntry(Move.REST,"tm"),
                        new MoveLearnSetEntry(Move.SPIKES,"tm"),
                        new MoveLearnSetEntry(Move.SUBSTITUTE,"tm"),
                        new MoveLearnSetEntry(Move.GIGA_DRAIN,"tm"),
                        new MoveLearnSetEntry(Move.SHADOW_BALL,"tm"),
                        new MoveLearnSetEntry(Move.ENERGY_BALL,"tm"),
                        new MoveLearnSetEntry(Move.GRASSY_TERRAIN,"tm"),
                        new MoveLearnSetEntry(Move.PHANTOM_FORCE,"tm"),
                        new MoveLearnSetEntry(Move.LEAF_STORM,"tm"),
                        new MoveLearnSetEntry(Move.SOLAR_BEAM,"tm"),
                        new MoveLearnSetEntry(Move.TERA_BLAST,"tm")
                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.ULTRA_RARE, 16, 35, 1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lileep");
setCanBreathUnderwater(true);
    }


}
