package drai.dev.gravelmon.pokemon.fliga;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Slakoth extends drai.dev.gravelmon.pokemon.Pokemon {
    public Slakoth() {
        super("Slakoth",
                Type.NORMAL,
                new Stats(60,
                        65,
                        65,
                        30,
                        30,
                        30),
                List.of(Ability.OBLIVIOUS), Ability.POISON_HEAL,
                8, 240,
                new Stats(1,0,0,0,0,0), 255,
                0.5,
                56, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FLIGA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Slakoth");

    }


}
