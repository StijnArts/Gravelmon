package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranLopunny extends Pokemon {
    public CefiranLopunny(String name, Aspect aspect, Stats stats) {
        super(name, aspect,"CefiranBuneary",
                Type.ICE,
                stats,
                List.of(Ability.SLUSH_RUSH), Ability.SNOW_CLOAK,
                17, 505,
                new Stats(0,1,0,0,0,1), 60,
                0.5,
                67, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(
                ),
                List.of(),
                List.of(Label.GEN4,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(23)
    .setWeight(SpawnWeight.VERY_COMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SNOWY_FOREST)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
