package drai.dev.data.pokemon.oceane;

import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ASalpackin extends drai.dev.data.pokemon.Pokemon {
    public ASalpackin() {
        super("ASalpackin",
                Type.ELECTRIC, Type.FLYING,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.KEEN_EYE), Ability.KEEN_EYE,
                8, 165,
                new Stats(0,0,0,0,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Few Salpackin survive the conditions required to achieve this Formation, a synergism of their previous ones. Each cluster member of those that do now brims with volatile energy highly capable of converting fluids and gases into plasma."),
                List.of(),
                List.of(),
                List.of(Label.OCEANE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("A-Salpackin");

    }


}
