package drai.dev.data.pokemon.tochi;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Martwig extends drai.dev.data.pokemon.Pokemon {
    public Martwig() {
        super("Martwig",
                Type.GRASS,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.QUICK_FEET), Ability.QUICK_FEET,
                6, 0,
                new Stats(0,0,0,0,0,0), 220,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("During the winter, Martwig bury themselves in the ground except for their tail, which they leave above ground to gain energy from photosynthesis during their long slumber. It is said that when the Martwig begin to come up from out of the ground winter is over."),
                List.of(new EvolutionEntry("martimber", EvolutionType.ITEM_INTERACT, false, List.of(),
                        List.of(),List.of(),"cobblemon:sun_stone")),
                List.of(),
                List.of(Label.TOCHI),
                0, List.of(
                ), new PokemonSpawnDataBuilder(1)
                        .setMinLevel(12).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_TAIGA).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Martwig");

    }


}
