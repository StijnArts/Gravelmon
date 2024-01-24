package drai.dev.gravelmon.pokemon.norheim;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Gnatle extends drai.dev.gravelmon.pokemon.Pokemon {
    public Gnatle() {
        super("Gnatle",
                Type.GRASS,Type.ROCK,
                new Stats(38,
                        45,
                        70,
                        45,
                        65,
                        45),
                List.of(Ability.OVERGROW,Ability.DAMP,Ability.ROCK_HEAD), Ability.ROCK_HEAD,
                8, 165,
                new Stats(0,0,1,0,1,0), 0,
                0.87,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG,EggGroup.WATER_3),
                List.of("Gnatle are incredibly hard to notice, making them highly sought after among collectors. When facing down they look like any kind of rock found in the woods. When happy, they scatter and jump around cheerfully."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.GRASS_KNOT,1)                        ),
                List.of(Label.NORHEIM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Gnatle");

    }


}
