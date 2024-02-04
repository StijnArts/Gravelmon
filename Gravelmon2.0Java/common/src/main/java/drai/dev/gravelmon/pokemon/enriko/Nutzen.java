package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Nutzen extends drai.dev.gravelmon.pokemon.Pokemon {
    public Nutzen() {
        super("Nutzen",
                Type.STEEL,
                new Stats(20,
                        20,
                        120,
                        20,
                        120,
                        20),
                List.of(Ability.ANALYTIC,Ability.MOODY,Ability.MOTOR_DRIVE), Ability.MOTOR_DRIVE,
                5, 165,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                123, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.DRAGON),
                List.of("They were built as toys for children, but the factory mysteriously shut down. They love to eat metal scrap."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.AUTOTOMIZE,1)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.ULTRA_RARE, 1, 25, 3, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.URBAN),
                0.28, 0.3,
                List.of());
           setLangFileName("Nutzen");

    }


}
