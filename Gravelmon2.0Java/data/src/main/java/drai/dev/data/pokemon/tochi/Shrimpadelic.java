package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Shrimpadelic extends drai.dev.data.pokemon.Pokemon {
    public Shrimpadelic() {
        super("Shrimpadelic",
                Type.WATER,Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                0, 0,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Shrimpedelic flash the bright colors all over its body to confuse and hypnotize its prey. Shrimpedelic are rather distracted Pokemon, and some believe this is because they are seeing into higher dimensions due to their heightened psychic abilities."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.HYPNOSIS,1)),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Shrimpadelic");

    }


}
