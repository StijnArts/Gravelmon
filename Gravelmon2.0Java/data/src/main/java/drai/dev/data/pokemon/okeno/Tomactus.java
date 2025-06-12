package drai.dev.data.pokemon.okeno;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tomactus extends drai.dev.data.pokemon.Pokemon {
    public Tomactus() {
        super("Tomactus",
                Type.GRASS,Type.ELECTRIC,
                new Stats(60,
                        60,
                        46,
                        50,
                        30,
                        20),
                List.of(Ability.LIGHTNING_ROD,Ability.DRY_SKIN), Ability.SOLAR_POWER,
                5, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("cactower", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:thunder_stone")),
                List.of(),
                List.of(Label.OKENO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_DESERT)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Tomactus");

    }


}
