package drai.dev.data.pokemon.form;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Magneraid extends drai.dev.data.pokemon.Pokemon {
    public Magneraid() {
        super("Magneraid",
                Type.NUCLEAR,Type.STEEL,
                new Stats(67,
                        45,
                        84,
                        107,
                        67,
                        121),
                List.of(Ability.ANALYTIC), null,
                15, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(                        ),
                List.of(Label.FORM),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.COMMON, 30, 51, .6, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_OVERWORLD))
                ), List.of(),
                List.of(SpawnPreset.VILLAGE),
                0.28, 0.3,
                List.of());
        setPreferredBlocks("cobblemon:healing_machine");
        setCanFly(true);
           setLangFileName("Magneraid");

    }


}
