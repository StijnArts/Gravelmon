package drai.dev.data.pokemon.theos.regional;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class TheossianJumpluff extends drai.dev.data.pokemon.Pokemon {
    public TheossianJumpluff(String name, Aspect aspect) {
        super(name, aspect, "Jumpluff",
                Type.GROUND, Type.GRASS,
                new Stats(110,
                        55,
                        70,
                        55,
                        95,
                        75),
                List.of(Ability.HARVEST), Ability.DRY_SKIN,
                16, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Jumpluff spend their time watching over fields by standing on their wood like tail. They do this to keep away bird Pokémon from feeding on the harvest."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Jumpluff");

    }


}
