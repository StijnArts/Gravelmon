package drai.dev.data.pokemon.aristos;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;


public class Navatoria extends drai.dev.data.pokemon.Pokemon {
    public Navatoria() {
        super("Navatoria",
                Type.FLYING, Type.WATER,
                new Stats(73,
                        40,
                        63,
                        111,
                        182,
                        101),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                24, 165,
                new Stats(0,0,0,0,0,0), 15,
                0.0,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("According to rumors it guides sailors who lost their way at sea, only to crash their boats into rocks and wail as they drown. It's one of the Ultra Beasts."),
                List.of(),
                List.of(),
                List.of(Label.ARISTOS),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .setPool(SpawnPool.RARE)
    .setMinLevel(56)
    .setWeight(SpawnWeight.ULTRA_RARE)
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_END)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
           setLangFileName("Navatoria");
            setCanFly(true);
    }


}
