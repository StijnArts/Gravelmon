package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Insomnine extends drai.dev.data.pokemon.Pokemon {
    public Insomnine() {
        super("Insomnine",
                Type.GHOST,
                new Stats(61,
                        78,
                        50,
                        123,
                        64,
                        86),
                List.of(Ability.INSOMNIA), Ability.BAD_DREAMS,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Exclusively drawn to nightmares, Insomnine will force people into deep slumbers to induce them, not allowing them to wake until its business is done. The seeds from its coat are used to make strong sedatives and anesthesia."),
                List.of(),
                List.of(                        ),
                List.of(Label.KORZA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Insomnine");

    }


}
