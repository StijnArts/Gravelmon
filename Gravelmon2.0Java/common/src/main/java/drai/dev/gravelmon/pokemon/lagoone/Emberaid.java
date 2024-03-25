package drai.dev.gravelmon.pokemon.lagoone;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Emberaid extends drai.dev.gravelmon.pokemon.Pokemon {
    public Emberaid() {
        super("Emberaid",
                Type.FIRE,
                new Stats(55,
                        67,
                        70,
                        79,
                        52,
                        82),
                List.of(Ability.BLAZE), Ability.BLAZE,
                11, 45,
                new Stats(0,0,0,1,0,1), 45,
                0.875,
                142, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Its light body allows it to float in the air like a will-o'-wisp, often being confused as one. The winds power up its flames and allow it move more freely."),
                List.of(),
                List.of(                        ),
                List.of(Label.LAGOONE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Emberaid");

    }


}
