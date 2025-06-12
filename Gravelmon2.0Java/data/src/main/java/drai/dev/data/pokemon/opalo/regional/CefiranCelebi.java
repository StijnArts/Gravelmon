package drai.dev.data.pokemon.opalo.regional;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class CefiranCelebi extends Pokemon {
    public CefiranCelebi(String name, Aspect aspect) {
        super(name, aspect,"CefiranCelebi",
                Type.GROUND, Type.FAIRY,
                new Stats(600, StatArchetype.ALL_ROUND, List.of()),
                List.of(Ability.PRANKSTER), Ability.MOODY,
                12, 580,
                new Stats(0,0,0,1,0,0), 3,
                0.5,
                88, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(
                ),
                List.of(Label.GEN2,Label.OPAL),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.ULTRA_RARE)
    .setMinLevel(65)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_SAVANNA)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
