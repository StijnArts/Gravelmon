package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanNinetales extends drai.dev.data.pokemon.Pokemon {
    public FormanNinetales(String name, Aspect aspect) {
        super(name, aspect, "Ninetales",
                Type.GHOST,Type.FIRE,
                new Stats(72,
                        38,
                        76,
                        130,
                        76,
                        110),
                List.of(Ability.CURSED_BODY), null,
                16, 0,
                new Stats(0,0,0,0,0,0), 60,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 33, 54, .1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.TIMERANGE,"night")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ninetales");

    }


}
