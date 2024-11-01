package drai.dev.data.pokemon.lonava;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Goldenghast extends drai.dev.data.pokemon.Pokemon {
    public Goldenghast() {
        super("Goldenghast",
                Type.GHOST,Type.STEEL,
                new Stats(60,
                        90,
                        70,
                        90,
                        70,
                        95),
                List.of(Ability.GOOD_AS_GOLD), Ability.GOOD_AS_GOLD,
                7, 220,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                154, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.AMORPHOUS),
                List.of("Supposedly immortal, Goldenghast love nothing more than shiny metals. Churches often keep one around to protect their precious artefacts from thieves."),
                List.of(),
                List.of(                        ),
                List.of(Label.LONAVA),
                0, List.of(
                ), SpawnContext.GROUNDED, SpawnPool.RARE, 32, 54, 1.1, List.of(
                        new BiomeSpawnCondition(List.of(Biome.IS_SPOOKY)),
                        new SpawnCondition(SpawnConditionType.CANSEESKY,"false")
                ), List.of(),
                List.of(SpawnPreset.MANSION),
                0.28, 0.3,
                List.of());
           setLangFileName("Goldenghast");

    }


}
