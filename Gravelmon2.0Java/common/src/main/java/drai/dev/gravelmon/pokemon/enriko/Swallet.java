package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Swallet extends drai.dev.gravelmon.pokemon.Pokemon {
    public Swallet() {
        super("Swallet",
                Type.DARK,Type.STEEL,
                new Stats(75,
                        100,
                        25,
                        125,
                        25,
                        120),
                List.of(Ability.PICKUP,Ability.FRISK,Ability.STURDY), Ability.STURDY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.GRASS),
                List.of("Their mouth generally remains closed at all times, to keep the hoard of money inside. It only opens it when absolutely necessary to pelt an attacker with an onslaught of coins."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.BLOCK,1),
                        new MoveLearnSetEntry(Move.THIEF,24),
                        new MoveLearnSetEntry(Move.SWAGGER,28),
                        new MoveLearnSetEntry(Move.METAL_BURST,32),
                        new MoveLearnSetEntry(Move.CRUNCH,35),
                        new MoveLearnSetEntry(Move.OMINOUS_WIND,38),
                        new MoveLearnSetEntry(Move.DARK_PULSE,45)                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Swallet");

    }


}
