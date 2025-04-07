package drai.dev.data.pokemon.mystis;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Colorlish extends drai.dev.data.pokemon.Pokemon {
    public Colorlish() {
        super("Colorlish",
                Type.WATER,
                new Stats(50,
                        30,
                        50,
                        40,
                        50,
                        30),
                List.of(Ability.SECRETINSIGHT), Ability.MARVEL_SCALE,
                7, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Colorish's scales have grown over its eyes. Thankfully, it is so dull it often isn't noticed until it bites or rams into others. It hunts using a mystic power."),
                List.of(new EvolutionEntry("marvelish", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:marvel_scale")))),
                List.of(),
                List.of(Label.MYSTIS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.SUBMERGED)
                        .setBiomes(Biome.IS_FRESHWATER).canSeeSky()
                        .setSpawnPreset(SpawnPreset.UNDERWATER).build(),
                0.28, 0.3,
                List.of());
        setCanSwim(true);
        setCanBreathUnderwater(true);
        setAvoidsLand(true);
           setLangFileName("Colorlish");

    }


}
