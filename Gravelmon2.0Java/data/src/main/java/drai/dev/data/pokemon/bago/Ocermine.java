package drai.dev.data.pokemon.bago;


import drai.dev.data.attributes.*;
import drai.dev.data.util.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Ocermine extends drai.dev.data.pokemon.Pokemon {
    public Ocermine() {
        super("Ocermine",
                Type.WATER,Type.ICE,
                new Stats(73,
                        111,
                        77,
                        39,
                        77,
                        131),
                List.of(Ability.TORRENT), Ability.OVERCOAT,
                UnitConverter.feetToMeters(5, 9), 0,
                new Stats(0,0,0,0,0,0), 45,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.BAGO),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_RIVER)
    .canSeeSky()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Ocermine");

    }


}
