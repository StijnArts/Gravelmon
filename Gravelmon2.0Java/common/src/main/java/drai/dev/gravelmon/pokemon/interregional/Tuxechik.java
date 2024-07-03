package drai.dev.gravelmon.pokemon.interregional;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Tuxechik extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tuxechik() {
        super("Tuxechik",
                Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                5, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("juavarrior", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"25")))),
                List.of(
                        new MoveLearnSetEntry(Move.GROWL,1),
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.POWDER_SNOW,5),
                        new MoveLearnSetEntry(Move.MIST,10),
                        new MoveLearnSetEntry(Move.ICE_SHARD,15),
                        new MoveLearnSetEntry(Move.SNOWSCAPE,20),
                        new MoveLearnSetEntry(Move.ICY_WIND,25),
                        new MoveLearnSetEntry(Move.FREEZEDRY,30),
                        new MoveLearnSetEntry(Move.AFTER_YOU,35),
                        new MoveLearnSetEntry(Move.AURORA_VEIL,40),
                        new MoveLearnSetEntry(Move.SWAGGER,45),
                        new MoveLearnSetEntry(Move.ICICLE_CRASH,50),
                        new MoveLearnSetEntry(Move.SHEER_COLD,55)             ),
                List.of(Label.INTERREGIONAL),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_FREEZING, Biome.IS_FROZEN_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Tuxechik");

    }


}
