package drai.dev.gravelmon.pokemon.junnin;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Chinchul extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chinchul() {
        super("Chinchul",
                Type.NORMAL,
                new Stats(50,
                        35,
                        35,
                        20,
                        30,
                        60),
                List.of(Ability.FLUFFY,Ability.PICKUP,Ability.WONDER_SKIN), Ability.WONDER_SKIN,
                8, 165,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                46, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Chinchul is treasured by many trainers because of its soft fur, so the softer the fur, the more desired the Chinchul. Even some trainers give it food for its soft fur."),
                List.of(),
                List.of(                        ),
                List.of(Label.JUNNIN),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Chinchul");

    }


}
