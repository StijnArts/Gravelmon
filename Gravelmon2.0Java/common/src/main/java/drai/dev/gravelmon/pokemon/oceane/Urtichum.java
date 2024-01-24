package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Urtichum extends drai.dev.gravelmon.pokemon.Pokemon {
    public Urtichum() {
        super("Urtichum",
                Type.POISON,
                new Stats(72,
                        88,
                        115,
                        54,
                        85,
                        34),
                List.of(Ability.POISON_POINT), Ability.POISON_POINT,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                157, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.WATER_1),
                List.of("If all its spines are broken off, it can release a cloud of poison from its posterior."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SPIKY_SHIELD,1)                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Urtichum");

    }


}
