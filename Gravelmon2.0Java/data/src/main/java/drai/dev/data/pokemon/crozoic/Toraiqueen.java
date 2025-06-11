package drai.dev.data.pokemon.crozoic;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Toraiqueen extends drai.dev.data.pokemon.Pokemon {
    public Toraiqueen() {
        super("Toraiqueen",
                Type.DRAGON, Type.FIGHTING,
                new Stats(
                        90,
                        105,
                        120,
                        60,
                        70,
                        65
                ),
                List.of(Ability.RIVALRY), Ability.SUPREME_OVERLORD,
                24, 2898,
                new Stats(0, 0, 0, 0, 0, 0), 45,
                0,
                0, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER, EggGroup.FIELD),
                List.of("A close relative of Tyrantrum, but from a different continent. In its desert habitat, it reigns supreme, shedding excess heat in the form of raging blue flames."),
                List.of(),
                List.of(),
                List.of(Label.CROZOIC),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
    .fossil()
    .setContext(SpawnContext.GROUNDED)
    .setBiomes(Biome.IS_BADLANDS, Biome.IS_VOLCANIC, Biome.IS_LUSH)
    .setSpawnPreset(SpawnPreset.NATURAL)
    .build(), List.of());
	
    }
}
