package drai.dev.data.pokemon.ionos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class IonosianArbok extends drai.dev.data.pokemon.Pokemon {
    public IonosianArbok(String name, Aspect aspect, Stats stats) {
        super(name, aspect, "Arbok",
                Type.POISON, Type.DARK,
                stats,
                List.of(Ability.MOXIE), Ability.BAD_DREAMS,
                17, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Only found in dark, underground caves. Its hood can sometimes be seen blinking and whisper can be heard from its mouth."),
                List.of(),
                List.of(),
                List.of(Label.IONOS),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.UNCOMMON, 28, 53, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SWAMP)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Arbok");

    }


}
