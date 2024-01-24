package drai.dev.gravelmon.pokemon.enriko;

import drai.dev.gravelmon.pokemon.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.conditions.*;
import java.util.*;

public class Cyanidae extends drai.dev.gravelmon.pokemon.Pokemon {
    public Cyanidae() {
        super("Cyanidae",
                Type.BUG,Type.POISON,
                new Stats(75,
                        90,
                        50,
                        90,
                        50,
                        145),
                List.of(Ability.POISON_TOUCH), Ability.SIMPLE,
                8, 165,
                new Stats(0,0,0,0,0,2), 85,
                0.5,
                135, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG,EggGroup.FLYING),
                List.of("Cyanidae venom is potent enough to knock out a Thermedary. They lance their prey and slurp up blood in under a second."),
                List.of(),
                List.of(                        ),
                List.of(Label.ENRIKO),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 3, 22, 3.8, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SKY, Biome.IS_MOUNTAIN)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"true")
                ), List.of(),
                List.of(SpawnPreset.NATURAL),
                0.28, 0.3,
                List.of());
           setLangFileName("Cyanidae");

    }


}
