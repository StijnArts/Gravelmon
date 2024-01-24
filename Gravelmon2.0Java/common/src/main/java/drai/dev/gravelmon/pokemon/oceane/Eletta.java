package drai.dev.gravelmon.pokemon.oceane;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Eletta extends drai.dev.gravelmon.pokemon.Pokemon {
    public Eletta() {
        super("Eletta",
                Type.ELECTRIC,Type.GHOST,
                new Stats(40,
                        50,
                        40,
                        60,
                        40,
                        40),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,1,0,0), 0,
                0.5,
                54, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Eletta born from messages lost to the tide emerge with personalities reflecting the letter's contents. It is said they continue to drift along the tides, longing to find their recipients and finally deliver the tidings no matter how long it takes."),
                List.of(),
                List.of(                        ),
                List.of(Label.OCEANE),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Eletta");

    }


}
