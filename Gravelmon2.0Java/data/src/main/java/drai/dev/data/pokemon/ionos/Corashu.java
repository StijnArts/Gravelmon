package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Corashu extends drai.dev.data.pokemon.Pokemon {
    public Corashu() {
        super("Corashu",
                Type.WATER,
                new Stats(60,
                        70,
                        50,
                        70,
                        77,
                        80),
                List.of(Ability.TORRENT), Ability.ZEN_MODE,
                11, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Corashu (Normal Form) is still getting used to dry land. Its insides contains water, making it possible to survive far away from any natural water source. While exploring more effectively, it transforms into an odd shaped coral, hovering around at high speeds."),
                List.of(new EvolutionEntry("campullion", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"32")))),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 16, 40, 0.9, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Corashu");

    }


}
