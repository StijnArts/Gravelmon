package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Orcanfrak extends drai.dev.data.pokemon.Pokemon {
    public Orcanfrak() {
        super("Orcanfrak",
                Type.WATER, Type.STEEL,
                new Stats(72,
                        70,
                        120,
                        93,
                        130,
                        40),
                List.of(Ability.TORRENT), Ability.MOXIE,
                19, 2035,
                new Stats(0,0,3,0,0,0), 45,
                0.87,
                236, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER,EggGroup.WATER_1),
                List.of("The scales have developed into titanium-like metal during evolution. It resists almost every missile."),
                List.of(),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_WARM_OCEAN)
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Orcanfrak");

    }


}
