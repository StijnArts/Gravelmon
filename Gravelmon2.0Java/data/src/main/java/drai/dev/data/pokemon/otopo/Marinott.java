package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Marinott extends drai.dev.data.pokemon.Pokemon {
    public Marinott(Stats stats) {
        super("Marinott",
                Type.WATER, Type.NORMAL,
                stats,
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                14, 0,
                new Stats(0,0,0,0,0,0), 90,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD),
                List.of("Marinott travels with Otopian Sailors. They are skilled fisherfolk that can easily catch hundreds of fish every day. It's not uncommon to see it around fishing ports. It has a reputation for rescuing humans and hauling prey."),
                List.of(),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(35).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SURFACE)
                        .setBiomes(Biome.IS_COAST).canSeeSky()
                        .setSpawnPreset(SpawnPreset.WATER_SURFACE).build(),
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
           setLangFileName("Marinott");

    }


}
