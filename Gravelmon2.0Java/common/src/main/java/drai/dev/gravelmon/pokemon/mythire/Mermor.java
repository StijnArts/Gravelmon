package drai.dev.gravelmon.pokemon.mythire;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Mermor extends drai.dev.gravelmon.pokemon.Pokemon {
    public Mermor() {
        super("Mermor",
                Type.WATER,
                new Stats(40,
                        50,
                        60,
                        35,
                        60,
                        35),
                List.of(Ability.SHELL_ARMOR,Ability.JUSTIFIED,Ability.RUN_AWAY), Ability.RUN_AWAY,
                8, 165,
                new Stats(0,0,1,0,0,0), 255,
                0.5,
                56, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.WATER_2),
                List.of("It's small and picked on by other sea Pokémon, so it hides inside of shells for protection. However, it tends to get stuck and becomes even easier to catch."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.SCALE_SHOT,"tm")                        ),
                List.of(Label.MYTHIRE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Mermor");

    }


}
