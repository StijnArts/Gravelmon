package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Gumbarachnid extends drai.dev.data.pokemon.Pokemon {
    public Gumbarachnid() {
        super("Gumbarachnid",
                Type.BUG,Type.FAIRY,
                new Stats(70,
                        50,
                        60,
                        60,
                        75,
                        60),
                List.of(Ability.POISON_POINT), Ability.ANTICIPATION,
                8, 0,
                new Stats(1,0,0,0,1,0), 80,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of("Don't be fooled, the bright-coloured balls inside this pokemon's abdomen are its eggs and young. Gumbarachnids violently shake their abdomens when threatened, creating a disorienting rattling sound."),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.UNCOMMON)
    .setMinLevel(21)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_GRASSLAND)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.VILLAGE)
    .build(), List.of());
	
           setLangFileName("Gumbarachnid");

    }


}
