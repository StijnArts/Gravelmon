package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.data.attributes.conditions.*;
import java.util.*;

public class Digdog extends drai.dev.gravelmon.pokemon.Pokemon {
    public Digdog() {
        super("Digdog",
                Type.GROUND,
                new Stats(99,
                        23,
                        82,
                        32,
                        79,
                        41),
                List.of(Ability.UNAWARE), Ability.SAND_SPIT,
                5, 165,
                new Stats(2,0,0,0,0,0), 190,
                0.5,
                71, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.WATER_1),
                List.of("Digdogs can be found lying either beneath or right on top of huge sand piles. They're incredibly lax, and are known to be unresponsive to any physical stimuli when asleep."),
                List.of(new EvolutionEntry("groundhound", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"21")))),
                List.of(
                        new MoveLearnSetEntry(Move.SAND_ATTACK,1),
                        new MoveLearnSetEntry(Move.MUD_SPORT,4),
                        new MoveLearnSetEntry(Move.MAGNITUDE,7),
                        new MoveLearnSetEntry(Move.ROAR,10),
                        new MoveLearnSetEntry(Move.DIG,14),
                        new MoveLearnSetEntry(Move.HEAVY_SLAM,21),
                        new MoveLearnSetEntry(Move.SAND_TOMB,27),
                        new MoveLearnSetEntry(Move.CRUNCH,30),
                        new MoveLearnSetEntry(Move.SANDSHOT,37),
                        new MoveLearnSetEntry(Move.REST,39),
                        new MoveLearnSetEntry(Move.EARTHQUAKE,44),
                        new MoveLearnSetEntry(Move.FISSURE,51)
                ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.COMMON, 3, 22, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Digdog");

    }


}
