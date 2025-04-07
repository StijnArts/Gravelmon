package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Tasmon extends drai.dev.data.pokemon.Pokemon {
    public Tasmon() {
        super("Tasmon",
                Type.GHOST, Type.DARK,
                new Stats(40,
                        60,
                        30,
                        50,
                        30,
                        70),
                List.of(Ability.PICKPOCKET), Ability.FRISK,
                4, 91,
                new Stats(0,1,0,0,0,1), 200,
                0.5,
                64, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.FIELD,EggGroup.MONSTER),
                List.of("Tasmon's small frame allows it to navigate urban environments with ease, darting through dark alleys and narrow streets. This mischievous pup has a penchant for playful deception, often hiding in the shadows and surprising unsuspecting passersby. Its oversized paws may seem clumsy, but they conceal sharp claws that Tasmon employs in its clever antics."),
                List.of(new EvolutionEntry("casanovil", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:dusk_stone")),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_OVERWORLD).canSeeSky().atNight()
                        .setSpawnPreset(SpawnPreset.VILLAGE).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Tasmon");

    }


}
