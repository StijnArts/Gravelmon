package drai.dev.data.pokemon.insurgence.armored;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmoredTyranitar extends Pokemon {
    public ArmoredTyranitar(String name, Aspect aspect) {
        super(name, aspect, "ArmoredTyranitar",
                Type.ROCK, Type.DARK,
                new Stats(100,
                        134,
                        143,
                        95,
                        130,
                        61),
                List.of(Ability.SAND_STREAM), Ability.SAND_STREAM,
                21, 1220,
                new Stats(0, 3, 0, 0, 0, 0), 45,
                .5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.MONSTER),
                List.of(""),
                List.of(new EvolutionEntry("tyranitar", EvolutionType.LEVEL_UP, List.of(), List.of())),
                List.of(
                ),
                List.of(Label.GEN2, Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("tyranitar", new EvolutionEntry("armoredtyranitar", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(), List.of(), "minecraft:netherite_helmet"));
    }
}
