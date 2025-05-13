package drai.dev.data.pokemon.insurgence.armored;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmoredLeavanny extends Pokemon {
    public ArmoredLeavanny(String name, Aspect aspect) {
        super(name, aspect, "ArmoredLeavanny",
                Type.BUG, Type.GRASS,
                new Stats(75,
                        103,
                        104,
                        70,
                        104,
                        92),
                List.of(Ability.SWARM, Ability.CHLOROPHYLL), Ability.OVERCOAT,
                12, 205,
                new Stats(0, 3, 0, 0, 0, 0), 45,
                .5,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("leavanny", EvolutionType.LEVEL_UP, List.of(), List.of())),
                List.of(
                ),
                List.of(Label.GEN5, Label.INSURGENCE),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("leavanny", new EvolutionEntry("armoredleavanny", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(), List.of(), "minecraft:netherite_helmet"));
    }
}
