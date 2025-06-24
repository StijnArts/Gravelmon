package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianFloette extends drai.dev.data.pokemon.Pokemon {
    public TheossianFloette(String name, Aspect aspect) {
        super(name, aspect, "Floette",
                Type.GHOST, Type.FAIRY,
                new Stats(54,
                        45,
                        47,
                        75,
                        98,
                        52),
                List.of(Ability.CURSED_BODY), Ability.MISTY_SURGE,
                2, 9,
                new Stats(0,0,0,0,2,0), 120,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Legend has it, Theosian Floette help lost souls find their way to the afterlife using their lanturn-like flower."),
                List.of(new EvolutionEntry("theossianflorges", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:moon_stone")),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(19).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Floette");

    }


}
