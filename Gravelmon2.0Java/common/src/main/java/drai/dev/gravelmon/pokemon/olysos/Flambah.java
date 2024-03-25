package drai.dev.gravelmon.pokemon.olysos;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;

public class Flambah extends drai.dev.gravelmon.pokemon.Pokemon {
    public Flambah() {
        super("Flambah",
                Type.FIRE,
                new Stats(50,
                        69,
                        40,
                        34,
                        60,
                        50),
                List.of(Ability.BLAZE), Ability.STATIC,
                4, 52,
                new Stats(0,0,0,1,0,0), 45,
                0.87,
                62, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.FIELD),
                List.of("Its horns are constantly powered with a high heat from the inside, which, if wanted, can reach a temperature of up to 500°. It depends mostly on the mood."),
                List.of(),
                List.of(                        ),
                List.of(Label.OLYSOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Flambah");

    }


}
