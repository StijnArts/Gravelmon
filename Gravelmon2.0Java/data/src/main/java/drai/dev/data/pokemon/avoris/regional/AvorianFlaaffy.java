package drai.dev.data.pokemon.avoris.regional;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class AvorianFlaaffy extends drai.dev.data.pokemon.Pokemon {
    public AvorianFlaaffy() {
        super("Flaaffy",
                Type.PSYCHIC, Type.ELECTRIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.SOUNDPROOF,Ability.TELEPATHY,Ability.SYNCHRONIZE), Ability.SYNCHRONIZE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolving, it developed a stronger ability to read and control the minds of humans. They hypnotize their foes, cause hallucinations, and make their escape."),
                List.of(),
                List.of(),
                List.of(Label.AVORIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Flaaffy");

    }


}
