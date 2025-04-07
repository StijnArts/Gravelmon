package drai.dev.data.pokemon.nodorro;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Trashic extends drai.dev.data.pokemon.Pokemon {
    public Trashic() {
        super("Trashic",
                Type.POISON, Type.BUG,
                new Stats(30,
                        40,
                        35,
                        40,
                        50,
                        55),
                List.of(Ability.SWARM,Ability.POISON_TOUCH), Ability.LIQUID_OOZE,
                4, 80,
                new Stats(0,0,0,0,0,1), 190,
                0.5,
                87, ExperienceGroup.FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of(""),
                List.of(new EvolutionEntry("crabbish", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"28")))),
                List.of(),
                List.of(Label.NODORRO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(16).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DEEP_DARK).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Trashic");

    }


}
