package drai.dev.data.pokemon.avalos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Jodoge extends drai.dev.data.pokemon.Pokemon {
    public Jodoge() {
        super("Jodoge",
                Type.FAIRY, Type.NORMAL,
                new Stats(140,
                        60,
                        50,
                        100,
                        90,
                        60),
                List.of(Ability.UNAWARE, Ability.FRIEND_GUARD), Ability.SLOW_START,
                13, 0,
                new Stats(0,0,0,0,1,0), 90,
                0.5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.FIELD),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.AVALOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(2)
    .setPool(SpawnPool.COMMON)
    .setMinLevel(3)
    .setWeight(SpawnWeight.UNCOMMON)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	

    }
}
