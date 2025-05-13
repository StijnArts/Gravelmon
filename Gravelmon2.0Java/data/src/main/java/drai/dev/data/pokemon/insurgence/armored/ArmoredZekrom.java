package drai.dev.data.pokemon.insurgence.armored;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmoredZekrom extends Pokemon {
    public ArmoredZekrom(String name, Aspect aspect) {
        super(name, aspect, "ArmoredZekrom",
                Type.DRAGON, Type.ELECTRIC,
                new Stats(100,
                        150,
                        156,
                        120,
                        130,
                        90),
                List.of(Ability.TERAVOLT), Ability.TERAVOLT,
                30, 3450,
                new Stats(0, 3, 0, 0, 0, 0), 3,
                -1,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(new EvolutionEntry("zekrom", EvolutionType.LEVEL_UP, List.of(), List.of())),
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
        addAdditionalEvolution("zekrom", new EvolutionEntry("armoredzekrom", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(), List.of(), "minecraft:netherite_helmet"));
    }
}
