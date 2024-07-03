package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;

import java.util.*;


public class Cryometry extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cryometry() {
        super("Cryometry",
                Type.ICE,
                new Stats(40,
                        30,
                        30,
                        63,
                        100,
                        70),
                List.of(Ability.ICE_SCALES), Ability.LEVITATE,
                3, 165,
                new Stats(0,0,0,0,1,0), 140,
                0.0,
                67, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of("Ice crystals from the first snow of winter form these Pokemon. They seek others of its kind to form long links to trap victims."),
                List.of(new EvolutionEntry("cryogonal", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"38")))),
                List.of(
                        new MoveLearnSetEntry(Move.SHARPEN,1),
                        new MoveLearnSetEntry(Move.CONFUSE_RAY,4),
                        new MoveLearnSetEntry(Move.RAPID_SPIN,8),
                        new MoveLearnSetEntry(Move.LASER_FOCUS,12),
                        new MoveLearnSetEntry(Move.ICY_WIND,16),
                        new MoveLearnSetEntry(Move.HAZE,20),
                        new MoveLearnSetEntry(Move.ANCIENT_POWER,24),
                        new MoveLearnSetEntry(Move.AURORA_BEAM,28),
                        new MoveLearnSetEntry(Move.NIGHT_SLASH,32),
                        new MoveLearnSetEntry(Move.FREEZEDRY,36),
                        new MoveLearnSetEntry(Move.REFLECT,40),
                        new MoveLearnSetEntry(Move.RECOVER,44),
                        new MoveLearnSetEntry(Move.ICE_BEAM,48),
                        new MoveLearnSetEntry(Move.ACID_ARMOR,52)                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 26, 10, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true"),
                        new SpawnCondition(SpawnConditionType.IS_RAINING,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cryometry");
setCanFly(true);
    }


}
