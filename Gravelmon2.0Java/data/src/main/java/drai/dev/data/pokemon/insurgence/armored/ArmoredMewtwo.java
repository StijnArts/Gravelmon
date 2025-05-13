package drai.dev.data.pokemon.insurgence.armored;

import drai.dev.data.attributes.*;
import drai.dev.data.pokemon.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;

public class ArmoredMewtwo extends Pokemon {
    public ArmoredMewtwo(String name, Aspect aspect) {
        super(name, aspect,"ArmoredMewtwo",
                Type.PSYCHIC,
                new Stats(106, 110, 90 , 154, 90, 130),
                List.of(Ability.HUBRIS), Ability.HUBRIS,
                21, 1220,
                new Stats(0,0,0,3,0,0), 3,
                -1,
                64, ExperienceGroup.MEDIUM_SLOW,
                70,
                50, List.of(EggGroup.UNDISCOVERED),
                List.of(""),
                List.of(new EvolutionEntry("mewtwo", EvolutionType.LEVEL_UP, List.of(), List.of())),
                List.of(
                ),
                List.of(Label.GEN1,Label.INSURGENCE),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .legend()
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_VOID).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
        addAdditionalEvolution("mewtwo", new EvolutionEntry("armoredmewtwo", EvolutionType.ITEM_INTERACT, false, List.of(),
                List.of(),List.of(),"minecraft:netherite_helmet"));
    }
}
