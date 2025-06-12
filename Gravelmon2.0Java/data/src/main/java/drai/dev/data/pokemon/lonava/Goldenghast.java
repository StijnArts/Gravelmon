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
                List.of(),
                List.of(Label.LONAVA),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(32)
    .setWeight(SpawnWeight.RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SPOOKY)
    .cantSeeSky()
    .setSpawnPreset(SpawnPreset.MANSION)
    .build(), List.of());
	
           setLangFileName("Goldenghast");

    }


}
