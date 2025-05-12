package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanCloyster extends drai.dev.data.pokemon.Pokemon {
    public FormanCloyster(String name, Aspect aspect) {
        super(name, aspect, "FormanCloyster",
                Type.WATER,Type.FIRE,
                new Stats(92,
                        49,
                        79,
                        114,
                        109,
                        79),
                List.of(Ability.FLASH_FIRE), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.SEAFLOOR, SpawnPool.UNCOMMON, 35, 57, .5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_WARM_OCEAN))
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Cloyster");

    }


}
