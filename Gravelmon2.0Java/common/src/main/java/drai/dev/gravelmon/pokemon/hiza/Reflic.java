package drai.dev.gravelmon.pokemon.hiza;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Reflic extends drai.dev.gravelmon.pokemon.Pokemon {
    public Reflic() {
        super("Reflic",
                Type.GHOST,Type.PSYCHIC,
                new Stats(50,
                        40,
                        30,
                        50,
                        60,
                        70),
                List.of(Ability.CLEAR_BODY), Ability.ILLUSION,
                8, 165,
                new Stats(0,0,0,0,1,0), 255,
                0.0,
                60, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("It is said that those who touch their reflection in Reflic become trapped inside the mirror, meanwhile a doppelganger controlled by Reflic will take their place outside."),
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
           setLangFileName("Reflic");

    }


}
