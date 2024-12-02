package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Dradna extends drai.dev.data.pokemon.Pokemon {
    public Dradna() {
        super("Dradna",
                Type.DRAGON,Type.PSYCHIC,
                new Stats(117,
                        41,
                        90,
                        99,
                        139,
                        50),
                List.of(Ability.REGENERATOR), null,
                19, 0,
                new Stats(0,0,0,0,0,0), 30,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.SUBMERGED, SpawnPool.RARE, 41, 65, .2, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_DEEP_OCEAN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.UNDERWATER),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Dradna");

    }


}
