package drai.dev.gravelmon.pokemon.ferroa;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chirunner extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chirunner() {
        super("Chirunner",
                Type.FLYING,Type.GROUND,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.QUICK_FEET,Ability.SAND_VEIL,Ability.STAKEOUT), Ability.STAKEOUT,
                8, 165,
                new Stats(0,0,0,0,0,1), 255,
                0.5,
                49, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FLYING),
                List.of("At the slightest threat, it sprints away at remarkable speeds—it can keep pace with a speeding car. The sand scattered by its running forms a cloud, allowing it to escape unseen."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SCRATCH,1),
                        new MoveLearnSetEntry(Move.CLONEATTACK,"tm")                        ),
                List.of(Label.FERROA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chirunner");

    }


}
