package drai.dev.data.pokemon.mikitari;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Furrva extends drai.dev.data.pokemon.Pokemon {
    public Furrva() {
        super("Furrva",
                Type.BUG,
                new Stats(52,
                        30,
                        30,
                        24,
                        22,
                        31),
                List.of(Ability.SHIELDDUST), Ability.RUN_AWAY,
                3, 34,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                39, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its fur is pointy and gives itches when touched, this discourages predators from hunting on it."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.TACKLE,1),
                        new MoveLearnSetEntry(Move.STRING_SHOT,1),
                        new MoveLearnSetEntry(Move.BUG_BITE,9)                        ),
                List.of(Label.MIKITARI),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Furrva");

    }


}
