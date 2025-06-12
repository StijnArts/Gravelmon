package drai.dev.data.pokemon.form.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class FormanNidorina extends drai.dev.data.pokemon.Pokemon {
    public FormanNidorina(String name, Aspect aspect) {
        super(name, aspect, "FormanNidorina",
                Type.NORMAL,Type.FAIRY,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.CUTE_CHARM), null,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("formannidoqueen", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(),
                List.of(Label.FORM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(15)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .atNight()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Nidorina");

    }


}
