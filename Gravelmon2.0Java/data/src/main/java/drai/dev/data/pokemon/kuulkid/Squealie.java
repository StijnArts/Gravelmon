package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Squealie extends drai.dev.data.pokemon.Pokemon {
    public Squealie() {
        super("Squealie",
                Type.STEEL,
                new Stats(60,
                        52,
                        63,
                        40,
                        45,
                        80),
                List.of(Ability.SPEED_BOOST), Ability.SPEED_BOOST,
                6, 0,
                new Stats(0,0,0,0,0,0), 180,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("hogrod", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:fire_stone")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_NETHER_WASTELAND)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Squealie");

    }


}
