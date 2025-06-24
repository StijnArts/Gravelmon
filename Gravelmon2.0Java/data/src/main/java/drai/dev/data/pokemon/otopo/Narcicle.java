package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Narcicle extends drai.dev.data.pokemon.Pokemon {
    public Narcicle() {
        super("Narcicle",
                Type.WATER, Type.ICE,
                new Stats(80,
                        90,
                        70,
                        70,
                        70,
                        95),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                17, 0,
                new Stats(0,0,0,0,0,0), 80,
                0.5,
                166, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.WATER_1,EggGroup.FIELD),
                List.of("It has the ability to swim at amazing speeds across water. Its long horn, which develops continually during its life, may puncture opponents."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_FROZEN_OCEAN)
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Narcicle");

    }


}
