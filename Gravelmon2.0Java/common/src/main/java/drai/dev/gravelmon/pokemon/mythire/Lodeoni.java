package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Lodeoni extends drai.dev.gravelmon.pokemon.Pokemon {
    public Lodeoni() {
        super("Lodeoni",
                Type.ELECTRIC,
                new Stats(50,
                        65,
                        130,
                        80,
                        125,
                        50),
                List.of(Ability.LEVITATE,Ability.PLUS,Ability.MAGNET_PULL), Ability.MAGNET_PULL,
                8, 165,
                new Stats(0,0,2,0,0,0), 45,
                0.5,
                175, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL),
                List.of("It's given power by the many Lodie that swarm around its body. They keep it clean of the many metal objects that are attracted by its magnetic pull."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.DEFENSE_CURL,1)                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Lodeoni");

    }


}
