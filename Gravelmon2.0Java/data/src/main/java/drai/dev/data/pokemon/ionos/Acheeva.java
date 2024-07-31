package drai.dev.data.pokemon.ionos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Acheeva extends drai.dev.data.pokemon.Pokemon {
    public Acheeva() {
        super("Acheeva",
                Type.ELECTRIC, Type.FIRE,
                new Stats(70,
                        100,
                        56,
                        20,
                        70,
                        200),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                13, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Outrunning an Acheeva would be considered a new Pokémon World record. Reaching such high speed has an advantage when hunting down a slower foe, such as Blitzle and Blazelle."),
                List.of(),
                List.of(                        ),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 23, 42, 1.5, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SAVANNA)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Acheeva");

    }


}
