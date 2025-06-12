package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Glubble extends Pokemon {
    public Glubble() {
        super("Glubble",
                Type.ROCK, Type.WATER,
                new Stats(55,
                        50,
                        90,
                        50,
                        50,
                        40),
                List.of(Ability.STORM_DRAIN), Ability.RAIN_DISH,
                7, 755,
                new Stats(0,0,1,0,0,0), 180,
                0.5,
                54, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.MINERAL, EggGroup.DRAGON),
                List.of("It sits in high places with its mouth wide open to gather rainwater. If it dries up, it stops moving."),
                List.of(new EvolutionEntry("garblgoyle", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"35"),
                                new EvolutionRequirementEntry(EvolutionRequirementCondition.WEATHER,"true")))),
                List.of(
                ),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 12, 32, 4, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
    }
}
