package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class OlysosianZombark extends drai.dev.data.pokemon.Pokemon {
    public OlysosianZombark(String s, Aspect aspect) {
        super(s, aspect, "Zombark",
                Type.GHOST,
                new Stats(0,0,0,0,0,0),
                List.of(Ability.CURSED_BODY), Ability.RUN_AWAY,
                5, 0,
                new Stats(0,0,0,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("This is a Olysian entry for Mystis' Zombark's line. Permission by Dylando."),
                List.of(new EvolutionEntry("serenine", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dawn_stone")),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SPOOKY).atNight()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Zombark");

    }
}
