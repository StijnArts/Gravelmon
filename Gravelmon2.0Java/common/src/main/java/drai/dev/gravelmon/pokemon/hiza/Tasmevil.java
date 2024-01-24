package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Tasmevil extends drai.dev.gravelmon.pokemon.Pokemon {
    public Tasmevil() {
        super("Tasmevil",
                Type.DARK,
                new Stats(53,
                        95,
                        80,
                        70,
                        54,
                        81),
                List.of(Ability.ANGER_POINT,Ability.RIVALRY,Ability.GLUTTONY), Ability.GLUTTONY,
                8, 165,
                new Stats(0,2,0,0,0,0), 127,
                0.5,
                145, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of("They are known to attack even when unprovoked, however due to their nocturnal nature they are mostly passive during the day."),
                List.of(),
                List.of(                        ),
                List.of(Label.HIZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Tasmevil");

    }


}
