package drai.dev.data.pokemon.flux;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Wurmiterra extends Pokemon {
    public Wurmiterra() {
        super("Wurmiterra",
                Type.BUG, Type.GROUND,
                new Stats(80,
                        95,
                        70,
                        70,
                        85,
                        30),
                List.of(Ability.WEAK_ARMOR, Ability.DRY_SKIN), Ability.DRY_SKIN,
                21, 334,
                new Stats(0,0,1,0,1,0), 45,
                0.5,
                125, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG, EggGroup.MINERAL),
                List.of("It secretes a sticky substance that it uses to attach clods of dirt to its body as protection. It rolls its body like a wheel to get around quickly."),
                List.of(new EvolutionEntry("wurmiterra", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(),
                List.of(Label.FLUX),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 16, 29, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_PLAINS)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(new BiomeSpawnCondition(List.of(Biome.IS_COLD))),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
    }
}
