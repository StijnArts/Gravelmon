package drai.dev.data.pokemon.olysos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Happetite extends drai.dev.data.pokemon.Pokemon {
    public Happetite() {
        super("Happetite",
                Type.GRASS, Type.DRAGON,
                new Stats(90,
                        120,
                        70,
                        30,
                        50,
                        65),
                List.of(Ability.STRONG_JAW,Ability.HUSTLE), Ability.RECKLESS,
                13, 360,
                new Stats(0,2,0,0,0,0), 160,
                0.5,
                1250, ExperienceGroup.SLOW,
                70,
                50, List.of(EggGroup.GRASS,EggGroup.DRAGON),
                List.of("Beneath its mask is a mouth that can stretch far, able to gobble down large meals without any effort."),
                List.of(new EvolutionEntry("serposter", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.HELD_ITEM,"cobblemon:dragon_scale")))),
                List.of(),
                List.of(Label.OLYSOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(21).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_JUNGLE)
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                0.28, 0.3,
                List.of());
           setLangFileName("Happetite");

    }


}
