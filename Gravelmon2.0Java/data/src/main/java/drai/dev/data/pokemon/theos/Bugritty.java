package drai.dev.data.pokemon.theos;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Bugritty extends drai.dev.data.pokemon.Pokemon {
    public Bugritty() {
        super("Bugritty",
                Type.BUG,
                new Stats(70,
                        70,
                        60,
                        40,
                        40,
                        60),
                List.of(Ability.ADAPTABILITY), Ability.CORROSION,
                8, 40,
                new Stats(0,2,0,0,0,0), 160,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(),
                List.of("Upon evolution Bugritty gains a hard shell somewhat resembling a Pokèball. This allows them to sneak into the bags of trainers undetected and eat all that’s inside."),
                List.of(new EvolutionEntry("wizzip", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"24")))),
                List.of(),
                List.of(Label.THEOS),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(14).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.COMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Bugritty");

    }


}
