package drai.dev.data.pokemon.insurgence.armored;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmoredFlygon  extends Pokemon {
    public ArmoredFlygon(String name, Aspect aspect) {
        super(name, aspect, "ArmoredFlygon",
                Type.GROUND, Type.DRAGON,
                new Stats(80,
                        100,
                        104,
                        80,
                        104,
                        100),
                List.of(Ability.LEVITATE), Ability.LEVITATE,
                23, 1220,
                new Stats(0, 1, 0, 0, 0, 2), 45,
                .5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("flygon", EvolutionType.LEVEL_UP, List.of(), List.of())),
                List.of(
                ),
                List.of(Label.GEN3, Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("flygon", new EvolutionEntry("armoredflygon", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(), List.of(), "minecraft:netherite_helmet"));
    }
}
