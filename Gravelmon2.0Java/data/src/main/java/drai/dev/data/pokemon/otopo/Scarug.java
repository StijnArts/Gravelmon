package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Scarug extends drai.dev.data.pokemon.Pokemon {
    public Scarug() {
        super("Scarug",
                Type.BUG,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.IMMUNITY,Ability.CURSED_BODY), Ability.EFFECT_SPORE,
                4, 0,
                new Stats(0,0,0,0,0,0), 255,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("They are discovered in such enormous numbers that the floor appears to be moving. They will quickly disperse if exposed to light."),
                List.of(new EvolutionEntry("crypcoon", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"11")))),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(1)
                        .setMinLevel(3).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.DESERT_PYRAMID).build(),
                List.of());
           setLangFileName("Scarug");

    }


}
