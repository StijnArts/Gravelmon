package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Regitoasty extends drai.dev.data.pokemon.Pokemon {
    public Regitoasty() {
        super("Regitoasty",
                Type.FIRE,
                new Stats(101,
                        120,
                        86,
                        120,
                        83,
                        70),
                List.of(Ability.SIZZLING), Ability.WELL_BAKED_BODY,
                18, 0,
                new Stats(0,0,0,0,0,0), 3,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID, Label.JOKE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_OVERWORLD)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Regitoasty");

    }


}
