package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Molooze extends drai.dev.data.pokemon.Pokemon {
    public Molooze() {
        super("Molooze",
                Type.POISON, Type.ICE,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.WEAK_ARMOR,Ability.LIQUID_OOZE), Ability.HYDRATION,
                12, 0,
                new Stats(0,0,1,0,0,0), 170,
                0.5,
                0, ExperienceGroup.ERRATIC,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Its shell is getting brittle due to the high acid content in the fluid it releases. Because the fluid it discharges dilutes in the water it lives in, it is presently not powerful enough to damage other Pokemon."),
                List.of(new EvolutionEntry("escargoo", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"40")))),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(13).setPool(SpawnPool.UNCOMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_SWAMP).canSeeSky()
                        .setSpawnPreset(SpawnPreset.NATURAL).build(),
                List.of());
           setLangFileName("Molooze");

    }


}
