package drai.dev.data.pokemon.mushi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tarpress extends drai.dev.data.pokemon.Pokemon {
    public Tarpress() {
        super("Tarpress",
                Type.WATER, Type.PSYCHIC,
                new Stats(135,
                        102,
                        108,
                        55,
                        90,
                        40),
                List.of(Ability.TORRENT), Ability.MAGIC_GUARD,
                16, 0,
                new Stats(3,0,0,0,0,0), 0,
                0.875,
                265, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.WATER_3),
                List.of(""),
                List.of(),
                List.of(),
                List.of(Label.MUSHI),
                0, List.of(
                ),new PokemonSpawnDataBuilder(3)
                        .starter()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL, SpawnPreset.NEAR_WATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Tarpress");

    }


}
