package drai.dev.data.pokemon.ferroa;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Draguma extends drai.dev.data.pokemon.Pokemon {
    public Draguma() {
        super("Draguma",
                Type.DRAGON, Type.PSYCHIC,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.AIRBORNE), Ability.AIRBORNE,
                8, 165,
                new Stats(0,0,0,0,0,0), 100,
                0.5,
                0, ExperienceGroup.FLUCTUATING,
                70,
                50, List.of(EggGroup.DRAGON,EggGroup.AMORPHOUS),
                List.of("Draguma uses psychic propulsion from the organs on its wing membranes to silently float in the air. It's been spotted lifting off small objects high into the atmosphere."),
                List.of(),
                List.of(
                        new MoveLearnSetEntry(Move.ENERGYLOOP,1)                        ),
                List.of(Label.FERROA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Draguma");

    }


}
