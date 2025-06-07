package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Psyfan extends drai.dev.data.pokemon.Pokemon {
    public Psyfan() {
        super("Psyfan",
                Type.PSYCHIC, Type.FLYING,
                new Stats(65,
                        75,
                        80,
                        95,
                        80,
                        75),
                List.of(Ability.FOREWARN), Ability.DAZZLING,
                15, 70,
                new Stats(0,0,0,2,0,0), 0,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("In the wild, Psyfan are constantly looking ahead in time before any battle. They will run away if they see a loss in their future."),
                List.of(),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Psyfan");

    }


}
