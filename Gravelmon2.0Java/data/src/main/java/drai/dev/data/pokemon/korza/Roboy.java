package drai.dev.data.pokemon.korza;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Roboy extends drai.dev.data.pokemon.Pokemon {
    public Roboy() {
        super("Roboy",
                Type.STEEL,Type.PSYCHIC,
                new Stats(35,
                        20,
                        70,
                        75,
                        50,
                        30),
                List.of(Ability.STURDY), Ability.STURDY,
                12, 340,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.MINERAL,EggGroup.AMORPHOUS),
                List.of("A globular mass hidden inside a little metal suit. Roboy have psychic abilities which allow it to move the suit and interact with the environment. Scientists are unsure of their origins."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.SELFREPAIR,1)                        ),
                List.of(Label.KORZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Roboy");

    }


}
