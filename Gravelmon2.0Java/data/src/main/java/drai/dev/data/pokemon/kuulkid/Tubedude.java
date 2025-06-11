package drai.dev.data.pokemon.kuulkid;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tubedude extends drai.dev.data.pokemon.Pokemon {
    public Tubedude() {
        super("Tubedude",
                Type.WATER,Type.FIGHTING,
                new Stats(132,
                        100,
                        100,
                        76,
                        156,
                        96),
                List.of(Ability.SLIPNSLIDE), Ability.SLIPNSLIDE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.KUULKID),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .subLegend()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_WARM_OCEAN)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setCanWalkOnWater(true);
           setLangFileName("Tubedude");

    }


}
