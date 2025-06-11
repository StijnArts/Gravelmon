package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Frostytop extends drai.dev.data.pokemon.Pokemon {
    public Frostytop() {
        super("Frostytop",
                Type.ICE,Type.PSYCHIC,
                new Stats(46,
                        23,
                        44,
                        60,
                        75,
                        20),
                List.of(Ability.ANTICIPATION,Ability.ICE_BODY), Ability.SNOW_WARNING,
                6, 0,
                new Stats(0,0,0,0,1,0), 170,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(new EvolutionEntry("zerebro", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:ice_stone")),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(13)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Frostytop");

    }


}
