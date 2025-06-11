package drai.dev.data.pokemon.realidea;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Faemie extends Pokemon {
    public Faemie() {
        super("Faemie",
                Type.PSYCHIC, Type.FAIRY,
                new Stats(100,90,60,100,130,80),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                4, 3,
                new Stats(1,0,1,0,1,0), 3,
                -1,
                263, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(),
                List.of(
                ),
                List.of(Label.REALIDEA_SYSTEM),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .starter()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_MAGICAL)
    .canSeeSky()
    .duringDaytime()
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
        setCanFly(true);
    }
}
