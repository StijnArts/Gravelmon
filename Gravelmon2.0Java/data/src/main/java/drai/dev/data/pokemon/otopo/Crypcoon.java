package drai.dev.data.pokemon.otopo;


import drai.dev.data.attributes.*;
import drai.dev.gravelmon.pokemon.attributes.*;

import java.util.*;
public class Crypcoon extends drai.dev.data.pokemon.Pokemon {
    public Crypcoon() {
        super("Crypcoon",
                Type.BUG, Type.DARK,
                new Stats(0,
                        0,
                        0,
                        0,
                        0,
                        0),
                List.of(Ability.IMMUNITY,Ability.CURSED_BODY), Ability.EFFECT_SPORE,
                7, 0,
                new Stats(0,0,0,0,0,0), 150,
                0.5,
                0, ExperienceGroup.MEDIUM_FAST,
                70,
                50, List.of(EggGroup.BUG),
                List.of("Crypcoon has strengthened its shell by consuming all the riches locked away with it when buried among the Kings. It's too heavy to move, so it'll only react when it evolves."),
                List.of(new EvolutionEntry("sarcofomoth", EvolutionType.LEVEL_UP, List.of(),
                        List.of(new EvolutionRequirementEntry(EvolutionRequirementCondition.LEVEL,"22")))),
                List.of(),
                List.of(Label.OTOPO),
                0, List.of(
                ),new PokemonSpawnDataBuilder(2)
                        .setMinLevel(11).setPool(SpawnPool.COMMON).setWeight(SpawnWeight.UNCOMMON)
                        .setContext(SpawnContext.GROUNDED)
                        .setBiomes(Biome.IS_DESERT).cantSeeSky()
                        .setSpawnPreset(SpawnPreset.DESERT_PYRAMID).build(),
                List.of());
           setLangFileName("Crypcoon");

    }


}
