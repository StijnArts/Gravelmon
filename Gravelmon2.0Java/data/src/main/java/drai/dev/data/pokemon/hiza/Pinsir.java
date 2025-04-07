package drai.dev.data.pokemon.hiza;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class Pinsir extends drai.dev.data.pokemon.Pokemon {
    public Pinsir() {
        super("Pinsir",
                Type.STEEL, Type.BUG,
                new Stats(65,
                        125,
                        100,
                        55,
                        70,
                        85),
                List.of(Ability.STEADFAST,Ability.INSOMNIA,Ability.INNER_FOCUS), Ability.INNER_FOCUS,
                8, 165,
                new Stats(0,1,0,0,0,0), 45,
                0.5,
                100, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("It can be seem sharpening its pincers on rocks and trees. Unlike its Kantonian form, it specializes in cutting instead of crushing."),
                List.of(),
                List.of(),
                List.of(Label.HIZA),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Pinsir");

    }


}
