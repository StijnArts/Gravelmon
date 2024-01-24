package drai.dev.gravelmon.pokemon.qamor;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;

import java.util.*;


public class Chkachuru extends drai.dev.gravelmon.pokemon.Pokemon {
    public Chkachuru() {
        super("Chkachuru",
                Type.PSYCHIC,
                new Stats(77,
                        21,
                        30,
                        60,
                        71,
                        18),
                List.of(Ability.OWN_TEMPO), Ability.ADAPTABILITY,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Ch’kicha were benevolent spirits that started playing the musical instruments after they were amazed by the tribesmen's musical abilities. When this Pokemon sleeps, it reverts back into a lifeless maraca."),
                List.of(),
                List.of(                        ),
                List.of(Label.QAMOR),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Ch’kachuru");

    }


}
